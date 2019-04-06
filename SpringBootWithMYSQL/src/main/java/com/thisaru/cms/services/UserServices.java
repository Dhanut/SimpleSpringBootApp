package com.thisaru.cms.services;

import com.thisaru.cms.domain.UserDTO;

import java.util.List;
import java.util.Optional;

public interface UserServices {
    List<UserDTO> findAllUsers();

    String saveUser(UserDTO userDTO);

    String updateUser(UserDTO newUserDTO);

    Optional<UserDTO> findById(Integer id);
}
