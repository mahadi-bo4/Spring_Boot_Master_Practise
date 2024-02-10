package com.example.springbootmasterpractise.customer;

import com.example.springbootmasterpractise.exceptions.ApiRequestException;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping(path = "api/v2/customer")
@RestController
public class CustomerControllerV2 {

    private final static Logger log = LoggerFactory.getLogger(CustomerControllerV2.class);

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
        log.info("Inside getCustomer()");
        return customerService.getCustomer(id);
    }

    @GetMapping(path = "{id}/exception")
    Customer getCustomerException(@PathVariable("id") Long id){
        throw new ApiRequestException("ApiRequestException for customer" + id);
    }


    @PostMapping
    void createNewCustomer(@Valid @RequestBody Customer customer){
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
