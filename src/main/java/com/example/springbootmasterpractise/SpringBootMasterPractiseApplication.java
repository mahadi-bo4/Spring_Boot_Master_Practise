package com.example.springbootmasterpractise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringBootMasterPractiseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMasterPractiseApplication.class, args);
    }

}
