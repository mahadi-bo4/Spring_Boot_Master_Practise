package com.example.springbootmasterpractise.customer;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

//@Repository(value = "fake")
public class CustomerRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L,"Mahadi Hasan", "password123","eample01@gmail.com"),
                new Customer(2L,"Nin ni", "123password", "emmple02@gmail.com")
        );
    }
}
