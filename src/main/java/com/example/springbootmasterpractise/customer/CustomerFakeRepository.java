package com.example.springbootmasterpractise.customer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
@Primary
public class CustomerFakeRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        return Collections.emptyList();
    }
}
