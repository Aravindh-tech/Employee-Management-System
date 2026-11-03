package org.example.employeemanagementsystem.repository;

import org.example.employeemanagementsystem.entity.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<CompanyEntity,Long> {
}
