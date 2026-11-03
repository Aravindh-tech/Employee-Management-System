package org.example.employeemanagementsystem.entity;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee_management_system")

public class EmployeeEntity extends EmployeeAudit{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empId;

    @NotBlank(message = "Enter the employee name")
    private String empName;

    private String empEmail;

    @NotNull(message = "Enter password")
    private String empPassword;

    @NotNull(message = "Mobile number is required")
    private Long empNumber;

    @NotNull
    @Positive(message = "Salary must be greater than zero")
    private Long empSalary;

    @NotBlank(message = "Enter department for employee")
    private String department;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(columnDefinition = "jsonb")
    private JsonNode empSkills;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(columnDefinition = "jsonb")
    private JsonNode empAddress;

    @Column(nullable = false)
    private boolean active = true;

}
