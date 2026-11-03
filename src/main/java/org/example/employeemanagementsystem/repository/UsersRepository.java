package org.example.employeemanagementsystem.repository;

import org.example.employeemanagementsystem.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<UserEntity,Long>{

    Optional<UserEntity> findByMobileNumber(Long mobile);

    Optional<UserEntity> findByEmail(String input);
}
