package org.example.employeemanagementsystem.auth.controller;

import org.example.employeemanagementsystem.auth.service.Impl.EmployeeService;
import org.example.employeemanagementsystem.entity.EmployeeEntity;
import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.data.domain.Pageable;

@Controller
public class EmployeeQuery {
    @Autowired
    private EmployeeService service;


//    @QueryMapping
//    public Page<EmployeeEntity> getEmployeeDetails(Pageable pageable){
//        return service.getEmployeeDetails(pageable);
//    }

    @QueryMapping
    public EmployeeEntity getEmployeeById(@Argument Long empId){
        return service.getEmployeeById(empId);
    }

    @MutationMapping
    public ResponseEntity<String> createEmpData(@Argument EmployeeEntity employee){
      return service.createEmpData(employee);
    }

    @MutationMapping
    public EmployeeEntity updateEmpData(@Argument Long empId, @Argument EmployeeEntity employee){
        return service.updateEmpData(empId,employee);
    }

    @MutationMapping
    public EmployeeEntity deleteEmpData(@Argument Long empId){
        return service.deleteEmpData(empId);
    }

    @MutationMapping
    public EmployeeEntity softDelete(@Argument Long empId){
        return service.softDelete(empId);
    }

    @MutationMapping
    public String restoreEmployee(@Argument Long empId){
        return service.restoreEmployee(empId);
    }
}
