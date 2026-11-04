package org.example.employeemanagementsystem.auth.service.Impl;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.example.employeemanagementsystem.auth.exception.EmployeeNotFoundException;
import org.example.employeemanagementsystem.auth.service.ServiceInterface;
import org.example.employeemanagementsystem.entity.EmployeeEntity;
import org.example.employeemanagementsystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class EmployeeService implements ServiceInterface {

    @Autowired
    private EmployeeRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuditorAware<Long> auditorAware;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private EmailService emailService;

    @Override
    public ResponseEntity<String> createEmpData(EmployeeEntity employee){

        Optional<EmployeeEntity> empEmail =repository.findByEmpEmail(employee.getEmpEmail());

        Optional<EmployeeEntity> empNumber = repository.findByEmpNumber(employee.getEmpNumber());

        if(empEmail.isPresent()){
            return new ResponseEntity<>(
                    "Email already exist",
                    HttpStatus.BAD_REQUEST
            );
        }

        if(empNumber.isPresent()){
            return new ResponseEntity<>(
                    "Number already exist",
                    HttpStatus.BAD_REQUEST
            );
        }

        String body = "Welcome " + employee.getEmpName() + "\n" + " Your login credentials " + "\n"
                + " username: " + employee.getEmpEmail() + " or "+ employee.getEmpNumber()+ "\n" +
                " password: " + employee.getEmpPassword();

        emailService.sendMail(
                employee.getEmpEmail(),
                "Your account created successfully",
                body
        );


        employee.setEmpPassword(passwordEncoder.encode(employee.getEmpPassword()));
        employee.setEmpEmail(employee.getEmpEmail().toLowerCase());

        repository.save(employee);

         return new ResponseEntity<>(
                 "Employee created",
                 HttpStatus.CREATED
         );

    }

    @Override
    public Page<EmployeeEntity> getEmployeeDetails(String search,
            Pageable pageable) {

        if(search == null){
            return repository.findAll(pageable);
        }
        else{
            return repository.findByEmpNameContainingIgnoreCase(search,pageable);
        }
    }

    @Override
    public EmployeeEntity getEmployeeById(Long empId){

       return repository.findById(empId).orElseThrow(() ->
                new EmployeeNotFoundException("Employee not found"));
    }


    @Override
    public EmployeeEntity updateEmpData(Long empId, EmployeeEntity employee) {
        EmployeeEntity employeeEntity = repository.findById(empId)
                .orElseThrow(() ->
                        new EmployeeNotFoundException("Employee not found")
                );

        if (employee.getEmpName() != null) {
            employeeEntity.setEmpName(employee.getEmpName());
        }

        if (employee.getEmpEmail() != null) {
            employeeEntity.setEmpEmail(employee.getEmpEmail());
        }

        if (employee.getEmpPassword() != null) {
            employeeEntity.setEmpPassword(
                    passwordEncoder.encode(employee.getEmpPassword()));
        }

        if (employee.getEmpNumber() != null) {
            employeeEntity.setEmpNumber(employee.getEmpNumber());
        }

        if (employee.getEmpSalary() != null) {
            employeeEntity.setEmpSalary(employee.getEmpSalary());
        }

        if (employee.getDepartment() != null) {
            employeeEntity.setDepartment(employee.getDepartment());
        }

        if (employee.getEmpAddress() != null) {
            employeeEntity.setEmpAddress(employee.getEmpAddress());
        }

        EmployeeEntity updatedEmployee = repository.save(employeeEntity);

        String body = "Hello " + updatedEmployee.getEmpName() + "\n"
                + "Your records have been updated successfully.\n"
                + "Username: " + updatedEmployee.getEmpEmail() + "\n"
                + "Employee Number: " + updatedEmployee.getEmpNumber();

        emailService.sendMail(
                updatedEmployee.getEmpEmail(),
                "Your account updated successfully",
                body
        );

        return updatedEmployee;
    }


    @Override
    public EmployeeEntity deleteEmpData(Long empId){
        EmployeeEntity employeeEntity = repository.findById(empId).orElseThrow(
                ()-> new EmployeeNotFoundException("Employee not found")
        );

        String body = "Danger! " + employeeEntity.getEmpName() + "\n" + " Your account is removed ";

        emailService.sendMail(
                employeeEntity.getEmpEmail(),
                "We deleted your account!",
                body
        );

        repository.delete(employeeEntity);

        return employeeEntity;
    }

    @Override
    public EmployeeEntity softDelete(Long empId){
        EmployeeEntity employeeEntity = repository.findById(empId).orElseThrow(
                ()-> new EmployeeNotFoundException("Employee not found")
        );

        employeeEntity.setActive(false);

        String body = "Warning! " + employeeEntity + "\n" + " If you want the account back, please verify your login";

        emailService.sendMail(
                employeeEntity.getEmpEmail(),
                "Your account is suspended!",
                body
        );

        repository.save(employeeEntity);
        return employeeEntity;
    }
//
    @Override
    public String restoreEmployee(Long empId) {

        EmployeeEntity employeeEntity = repository.findById(empId)
                .orElseThrow(() ->
                        new EmployeeNotFoundException("Employee not found")
                );

        if (employeeEntity.isActive()) {
            return "Employee is already active";
        }

        employeeEntity.setActive(true);

        Long owner = auditorAware.getCurrentAuditor()
                .orElseThrow(() ->
                        new RuntimeException("Auditor not found")
                );

        employeeEntity.setLastModifiedBy(owner);

        String body = "Good news! Your account has been recovered successfully.";

        emailService.sendMail(
                employeeEntity.getEmpEmail(),
                "Account recovered successfully",
                body
        );

        repository.save(employeeEntity);

        return "Employee is active now";
    }

    @Override
    public Optional<EmployeeEntity> getByEmployeeKey(String empEmail, String empName ){
        return repository.findByEmpEmailOrEmpName(empEmail,empName);
    }

    @Override
    public Object getEmployeeByKeyword(String name){
        Optional<EmployeeEntity> employeeMail = repository.findByEmpEmail(name);

        Optional<EmployeeEntity> employeeName = repository.findByEmpName(name);

        if (employeeMail.isPresent()){
            return employeeMail;
        }
        else if(employeeName.isPresent()){
            return employeeName;
        }
        else{
            return new EmployeeNotFoundException("Employee not found");
        }
    }

    @Override
    public List<EmployeeEntity> getEmployeeByDepartment(String department){
        return repository.findByDepartment(department);
    }

    @Override
    public JsonNode getEmployeeAdditionalInfo(Long empId) {
        EmployeeEntity employee = repository.findById(empId)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found")
                );

        ObjectNode response = objectMapper.createObjectNode();
        response.set("address", employee.getEmpAddress());
        response.set("skills", employee.getEmpSkills());

        return response;
    }


    @Override
    public EmployeeEntity updateEmployeeAddress(Long empId,Map<String,String> input){

        EmployeeEntity employee = repository.findById(empId).orElseThrow(
                ()->new EmployeeNotFoundException("Employee not found")
        );

        ObjectNode updateAddress;

        if(employee.getEmpAddress()!=null && employee.getEmpAddress().isObject()){
            updateAddress = (ObjectNode) employee.getEmpAddress();
        }
        else{
            updateAddress = objectMapper.createObjectNode();
        }

        input.forEach(
                (key,value)-> updateAddress.put(key,value)
        );

        employee.setEmpAddress(updateAddress);
        repository.save(employee);

        return employee;
    }

    @Override
    public EmployeeEntity updateEmployeeSkills(Long empId, JsonNode empSkills) {

        EmployeeEntity employee = repository.findById(empId)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found")
                );

        JsonNode existingNode = employee.getEmpSkills();

        ArrayNode existingSkills;

        if (existingNode != null && existingNode.isArray()) {
            existingSkills = (ArrayNode) existingNode;
        } else {
            existingSkills = objectMapper.createArrayNode();
        }

        if (empSkills.isArray()) {
            for (JsonNode newSkill : empSkills) {
                if (!existingSkills.toString().contains(newSkill.toString())) {
                    existingSkills.add(newSkill);
                }
            }
        }

        employee.setEmpSkills(existingSkills);
        repository.save(employee);

        return employee;
    }

}
