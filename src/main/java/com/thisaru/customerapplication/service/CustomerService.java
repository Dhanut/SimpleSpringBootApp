package com.thisaru.customerapplication.service;

import com.thisaru.customerapplication.dao.CustomerDAO;
import com.thisaru.customerapplication.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component//when Autowiring
public class CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

/*    private int customerIdCount =1;
    private List<Customer> customerList = new CopyOnWriteArrayList<>();*/

    public Customer addCustomer (Customer customer){
/*      customer.setCustomerId(customerIdCount);
        customerList.add(customer);
        customerIdCount++;
        return customer;*/
        return customerDAO.save(customer);
    }

    public  List<Customer> getCustomers(){

     /* return customerList;*/
        return customerDAO.findAll();
    }

    public Customer getCustomer(int customerId){
/*        return  customerList
            .stream()
            .filter(c -> c.getCustomerId() == customerId )
            .findFirst()
            .get();*/
        return customerDAO.findById(customerId).get();
    }

     public Customer updateCustomer (int customerId, Customer customer){
/*        customerList
                .stream()
                .forEach(c -> {
                    if(c.getCustomerId() == customerId){
                        c.setCustomerFirstName(customer.getCustomerFirstName());
                        c.setCustomerLastName(customer.getCustomerLastName());
                        c.setCustomerEmail(customer.getCustomerEmail());
                    }
                } );
         return  customerList
                 .stream()
                 .filter(c -> c.getCustomerId() == customerId )
                 .findFirst()
                 .get();*/
        customer.setCustomerId(customerId);
        return  customerDAO.save(customer);//if we write this line only, then no change with the above insert method.
         // To make a differ from above method, first we have to set the customerId as the first argument.
     }

     public void deleteCustomer(int customerId){
/*        customerList
                .stream()
                .forEach(c -> {
                    if(c.getCustomerId() == customerId){
                        customerList.remove(c);
                    }
                } );*/
            customerDAO.deleteById(customerId);
     }

}
