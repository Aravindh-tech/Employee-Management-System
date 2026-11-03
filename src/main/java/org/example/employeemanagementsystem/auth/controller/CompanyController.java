package org.example.employeemanagementsystem.auth.controller;


import org.example.employeemanagementsystem.auth.service.Impl.CompanyService;
import org.example.employeemanagementsystem.entity.CompanyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/company")
public class CompanyController {

    @Autowired
    private CompanyService service;

    @GetMapping
    public List<CompanyEntity> getCompanyDetails(){
        return service.getCompanyDetails();
    }

    @PostMapping("/add")
    public CompanyEntity createCompanyData(@RequestBody CompanyEntity company){
        return service.createCompanyData(company);
    }

    @PutMapping("/update/{id}")
    public CompanyEntity updateCompanyData(@PathVariable Long id, @RequestBody CompanyEntity company){
        return service.updateCompanyData(id,company);
    }

    @DeleteMapping("/delete/{id}")
    public CompanyEntity deleteCompanyData(@PathVariable Long id){
        return service.deleteCompanyData(id);
    }
}
