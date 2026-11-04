package org.example.employeemanagementsystem.auth.controller;



import com.fasterxml.jackson.databind.JsonNode;
import org.example.employeemanagementsystem.auth.service.Impl.EmployeeService;
import org.example.employeemanagementsystem.entity.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping
    public Page<EmployeeEntity> getEmployeeDetails(@RequestParam(required = false, defaultValue = "0") int page,
                                                   @RequestParam(required = false, defaultValue = "5") int size,
                                                   @RequestParam(required = false, defaultValue = "empId") String sortBy,
                                                   @RequestParam(required = false, defaultValue = "ASC") String sortDirection,
                                                   @RequestParam(required = false) String search){

        Sort sort;

        if(sortDirection.equalsIgnoreCase("ASC")){
            sort = Sort.by(sortBy).ascending();
        }
        else{
            sort = Sort.by(sortBy).descending();
        }

        Pageable pageable =PageRequest.of(page,size,sort);

        return service.getEmployeeDetails(search,pageable);
    }

    @GetMapping("/{empId}")
    public EmployeeEntity getEmployeeById(@PathVariable Long empId){
        return service.getEmployeeById(empId);
    }

    @GetMapping("/{empId}/additional-details")
    public JsonNode getEmployeeAdditionalInfo(@PathVariable Long empId){
        return service.getEmployeeAdditionalInfo(empId);
    }

    @PostMapping("/data")
    public ResponseEntity<String> createEmpData(@RequestBody EmployeeEntity employee){
        return service.createEmpData(employee);
    }

    @PutMapping("/update/{empId}")
    public EmployeeEntity updateEmpData(@PathVariable Long empId, @RequestBody EmployeeEntity employee){
        return service.updateEmpData(empId,employee);
    }

    @DeleteMapping("/delete/{empId}")
    public EmployeeEntity deleteEmpData(@PathVariable Long empId){
        return service.deleteEmpData(empId);
    }

    @DeleteMapping("/softDelete/{empId}")
    public EmployeeEntity softDelete(@PathVariable Long empId){
        return service.softDelete(empId);
    }

    @PatchMapping("/restore/{empId}")
    public String restoreEmployee(@PathVariable Long empId){
        return service.restoreEmployee(empId);
    }

    @GetMapping("/keyword")
    public Optional<EmployeeEntity> getByEmployeeKey(@Payload String empEmail, @Payload String empName){
        return service.getByEmployeeKey(empEmail,empName);
    }

    @GetMapping("/key")
    public Object getEmployeeByKeyword(@RequestParam String name){
        return service.getEmployeeByKeyword(name);
    }

    @GetMapping("/department/{department}")
    public List<EmployeeEntity> getEmployeeByDepartment(@PathVariable String department){
        return service.getEmployeeByDepartment(department);
    }

    @PatchMapping("/address/{empId}")
    public EmployeeEntity updateEmployeeAddress(@PathVariable Long empId,@RequestBody Map<String,String> request){
        return service.updateEmployeeAddress(empId,request);
    }

    @PatchMapping("skills/{empId}")
    public EmployeeEntity updateEmployeeSkills(@PathVariable Long empId, @RequestBody JsonNode empSkills){
        return service.updateEmployeeSkills(empId,empSkills);
    }

}
