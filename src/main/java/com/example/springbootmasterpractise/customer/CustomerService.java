package com.example.springbootmasterpractise.customer;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepo customerRepo;

    public CustomerService(/*@Qualifier("fake")*/ CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }


    public List<Customer> getCustomers(){
        return customerRepo.getCustomers();
    }
}
