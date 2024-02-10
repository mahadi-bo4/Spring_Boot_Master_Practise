package com.example.springbootmasterpractise.customer;

import com.example.springbootmasterpractise.exceptions.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final static Logger log = LoggerFactory.getLogger(CustomerService.class);

    private final CustomerRepo customerRepo;


    public CustomerService(/*@Qualifier("fake")*/CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }


    public List<Customer> getCustomers(){
        return customerRepo.findAll();
    }

    Customer getCustomer(Long id){
        return customerRepo
                .findById(id)
                .orElseThrow(() -> {
                    NotFoundException notFoundException = new NotFoundException("Customer with id "+ id +" Not Found");
                    log.error("Error in getting {}", id, notFoundException);
                    return notFoundException;
                });
    }
}
