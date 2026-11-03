package org.example.employeemanagementsystem.auth.service.Impl;


import org.example.employeemanagementsystem.entity.CompanyEntity;
import org.example.employeemanagementsystem.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CompanyService{

    @Autowired
    private CompanyRepository repository;

    public CompanyEntity createCompanyData(CompanyEntity company){
        return repository.save(company);

    }

    public List<CompanyEntity> getCompanyDetails(){
        return repository.findAll();
    }

    public CompanyEntity updateCompanyData(Long id, CompanyEntity company){
        CompanyEntity companyEntity = repository.findById(id).orElseThrow(()-> new RuntimeException("Id not found"));

        companyEntity.setCompanyMail(company.getCompanyMail());
        companyEntity.setStatus(company.getStatus());

        return repository.save(companyEntity);

    }


    public CompanyEntity deleteCompanyData(Long id){
        CompanyEntity companyEntity = repository.findById(id).orElseThrow(()-> new RuntimeException("Id not found"));

        repository.delete(companyEntity);

        return companyEntity;
    }


}
