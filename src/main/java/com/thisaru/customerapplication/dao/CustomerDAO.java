package com.thisaru.customerapplication.dao;


import com.thisaru.customerapplication.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository//CustomerDAO acts as the Interface and in the Crudrepository Customer is the particular Class and
// the Integer type is the primary key(ID) of that entitiy(Customer)
public interface CustomerDAO extends CrudRepository<Customer, Integer> {
    @Override
    List<Customer> findAll();
}
