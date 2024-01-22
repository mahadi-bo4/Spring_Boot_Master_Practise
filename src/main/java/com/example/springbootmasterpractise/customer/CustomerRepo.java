package com.example.springbootmasterpractise.customer;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CustomerRepo {
    List<Customer> getCustomers();
}
