package com.example.springbootmasterpractise.customer;

import com.example.springbootmasterpractise.exceptions.ApiExceptionHandler;
import com.example.springbootmasterpractise.exceptions.ApiRequestException;
import jakarta.validation.Valid;
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
