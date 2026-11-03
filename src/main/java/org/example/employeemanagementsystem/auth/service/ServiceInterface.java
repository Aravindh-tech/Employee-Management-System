package org.example.employeemanagementsystem.auth.service;

import com.fasterxml.jackson.databind.JsonNode;
import org.example.employeemanagementsystem.entity.EmployeeEntity;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface ServiceInterface {

    ResponseEntity<String> createEmpData(EmployeeEntity employee);

    Page<EmployeeEntity> getEmployeeDetails(String search,Pageable pageable);

    EmployeeEntity getEmployeeById(Long empId);

    EmployeeEntity updateEmpData(Long empId, EmployeeEntity employee);

    EmployeeEntity deleteEmpData(Long empId);

    EmployeeEntity softDelete(Long empId);

    String restoreEmployee(Long empId);

    Optional<EmployeeEntity> getByEmployeeKey(String empEmail, String empName );

    Object getEmployeeByKeyword(String name);

    List<EmployeeEntity> getEmployeeByDepartment(String department);

    JsonNode getEmployeeAdditionalInfo(Long empId);

    EmployeeEntity updateEmployeeAddress(Long empId, Map<String,String> address);

    EmployeeEntity updateEmployeeSkills(Long empId, JsonNode empSkills);

}
