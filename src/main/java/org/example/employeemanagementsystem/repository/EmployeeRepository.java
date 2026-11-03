package org.example.employeemanagementsystem.repository;

import org.example.employeemanagementsystem.entity.EmployeeEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Pageable;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {



    Optional<EmployeeEntity> findByEmpName(String empName);

    Optional<EmployeeEntity> findByEmpEmail(String empEmail);

    Optional<EmployeeEntity> findByEmpNumber(Long empNumber);


    @Query(
            value = "SELECT * FROM employee_management_system WHERE emp_email=:emp_email OR emp_name=:emp_name", nativeQuery = true
    )
    Optional<EmployeeEntity> findByEmpEmailOrEmpName(@Param("emp_email") String empEmail, @Param("emp_name") String empName);

    List<EmployeeEntity> findByDepartment(String department);

    Page<EmployeeEntity> findByEmpNameContainingIgnoreCase(String empName, Pageable pageable);

}