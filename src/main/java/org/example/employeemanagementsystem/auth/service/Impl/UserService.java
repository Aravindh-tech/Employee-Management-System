package org.example.employeemanagementsystem.auth.service.Impl;


import org.example.employeemanagementsystem.entity.UserEntity;
import org.example.employeemanagementsystem.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {


    @Autowired
    private UsersRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    public UserEntity createUserData(UserEntity user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setEmail(user.getEmail().toLowerCase());

        return repository.save(user);
    }

    public List<UserEntity> getUsersDetails(){
        return repository.findAll();
    }

    public UserEntity updateUserData(Long id, UserEntity user){
        UserEntity userEntity = repository.findById(id).orElseThrow(()-> new RuntimeException("Id not found"));

        userEntity.setUserName(user.getUserName());
        userEntity.setEmail(user.getEmail());
        userEntity.setStatus(user.getStatus());
        userEntity.setMobileNumber(user.getMobileNumber());

        return repository.save(userEntity);

    }

    public UserEntity deleteUserData(Long id){
        UserEntity userEntity = repository.findById(id).orElseThrow(()-> new RuntimeException("Id not found"));

        repository.delete(userEntity);

        return userEntity;
    }

}
