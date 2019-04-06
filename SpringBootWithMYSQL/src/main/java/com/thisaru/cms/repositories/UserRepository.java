package com.thisaru.cms.repositories;

import com.thisaru.cms.domain.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<UserDTO, Integer> {
    //getalusers
    //update
    //delete
    //findbyid
    //customquries
    //All the CRUD opearions should happen here.
}
