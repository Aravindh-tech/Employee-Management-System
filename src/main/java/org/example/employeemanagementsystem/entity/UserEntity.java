package org.example.employeemanagementsystem.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "userEntity")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String password;
    private String email;
    private Long mobileNumber;
    private Long status;
    private Long companyId;

}
