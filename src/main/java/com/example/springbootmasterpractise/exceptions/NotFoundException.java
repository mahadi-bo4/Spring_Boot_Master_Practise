package com.example.springbootmasterpractise.exceptions;

public class NotFoundException extends RuntimeException{


    public NotFoundException(String customerNotFound) {
        super(customerNotFound);
    }
}
