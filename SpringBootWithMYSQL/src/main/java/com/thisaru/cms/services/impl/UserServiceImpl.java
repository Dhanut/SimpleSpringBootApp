package com.thisaru.cms.services.impl;


import com.thisaru.cms.domain.UserDTO;
import com.thisaru.cms.repositories.UserRepository;
import com.thisaru.cms.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserServices {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDTO>  findAllUsers() {
        //database search and then retrun all users(databse calling should be here)
        //return "ALL USERS";
        List<UserDTO> allusers = userRepository.findAll();
        return allusers;
    }

    @Override
    public String saveUser(UserDTO userDTO) {
        userRepository.save(userDTO);//save method in repositiory return the thing which we  save
        return "DATA SAVE TO DATABASE";
    }

    @Override
    public String updateUser(UserDTO newUserDTO) {
        String message = null;
        if(newUserDTO.getId() != null){
            userRepository.save(newUserDTO);
            message ="DATA UPDATED";
        }
        else{
            message ="ERROR IN UPDATING";
        }
        return message;
    }

    @Override
    public Optional<UserDTO> findById(Integer id) {
        return userRepository.findById(id);
    }
}
