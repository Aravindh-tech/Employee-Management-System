package org.example.employeemanagementsystem.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "company_details")
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String companyName;
    private String companyMail;
    private Long status;

}
