package com.example.springbootmasterpractise.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class CustomerConfig {

    @Value("${app.useFakeRepository:false}")
    private Boolean useFakeRepository;

    @Value("${info.app.description}")
    private String companyDescription;

    private Environment environment;

    public CustomerConfig(Environment env) {
        environment = env;
    }

    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
            System.out.println("Command line runner running....");
            System.out.println(companyDescription);
            System.out.println(environment.getProperty("info.app.name"));
        };
    }

//    @Bean
//    CustomerRepo customerRepo (){
//        System.out.println("useFakeRepository: " + useFakeRepository);
//        return useFakeRepository?
//                new CustomerFakeRepository() :
//                new CustomerRepository();
//    }
}
