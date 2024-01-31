package com.example.springbootmasterpractise.customer;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "api/v2/customer")
@RestController
public class CustomerControllerV2 {

    private final CustomerService customerService;

    public CustomerControllerV2(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value = "all")
    public List<Customer> getCustomers(){
        return customerService.getCustomers();
    }

    @GetMapping(path = "{id}")
    Customer getCustomer(@PathVariable("id") Long id){
        return customerService.getCustomer(id);
    }


    @PostMapping
    void createNewCustomer(@RequestBody Customer customer){
        System.out.println("POST MAPPING....");
        System.out.println(customer);
    }

    @PutMapping
    void updateCustomer(@RequestBody Customer customer){
        System.out.println("PUT MAPPING....");
        System.out.println(customer);
    }

    @DeleteMapping(path = "{id}")
    void deleteCustomer (@PathVariable Long id){
        System.out.println("DELETE CUSTOMER BY ID: " + id);
    }
}
