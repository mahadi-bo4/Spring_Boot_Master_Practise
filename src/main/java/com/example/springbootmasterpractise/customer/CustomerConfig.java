package com.example.springbootmasterpractise.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {

    @Value("${app.useFakeRepository:false}")
    private Boolean useFakeRepository;

    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
            System.out.println("Command line runner running....");
        };
    }

    @Bean
    CustomerRepo customerRepo (){
        System.out.println("useFakeRepository: " + useFakeRepository);
        return useFakeRepository?
                new CustomerFakeRepository() :
                new CustomerRepository();
    }
}
