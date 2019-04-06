package com.thisaru.cms.controllers;

import com.thisaru.cms.domain.UserDTO;
import com.thisaru.cms.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class User {

    @Autowired
    private UserServices userServices;//service injection

    @GetMapping("/all")
    public List<UserDTO> allUsers(){
        return  userServices.findAllUsers();
    }

    @PostMapping("/add")
    public String addUser(@RequestBody UserDTO userDTO){
        return userServices.saveUser(userDTO);
    }

    @PutMapping("/update")
    public String updateUser(@RequestBody UserDTO newUserDTO){
        return userServices.updateUser(newUserDTO);
    }

    @GetMapping("/find/{id}")
    public Optional<UserDTO> getUserById(@PathVariable Integer id){
        return  userServices.findById(id);
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Integer id){
        userServices.deleteUser(id);
    }
}
