package org.example.employeemanagementsystem.auth.controller;


import org.example.employeemanagementsystem.auth.service.Impl.UserService;
import org.example.employeemanagementsystem.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public List<UserEntity> getUsersDetails(){
        return service.getUsersDetails();
    }

    @PostMapping("/add-user")
    public UserEntity createUserData(@RequestBody UserEntity user){
        return service.createUserData(user);
    }

    @PutMapping("/update-user/{id}")
    public UserEntity updateUserData(@PathVariable Long id,
                                     @RequestBody UserEntity user){

        return service.updateUserData(id,user);
    }

    @DeleteMapping("/delete-user/{id}")
    public UserEntity deleteUserData(@PathVariable Long id){
        return service.deleteUserData(id);
    }
}
