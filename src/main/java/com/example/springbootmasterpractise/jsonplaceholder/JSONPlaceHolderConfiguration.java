package com.example.springbootmasterpractise.jsonplaceholder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JSONPlaceHolderConfiguration {

    @Bean
    CommandLineRunner runner(JSONPlaceHolderClient jsonPlaceHolderClient){

        return args -> {
            System.out.println("https://jsonplaceholder.typicode.com/posts");
            System.out.println(jsonPlaceHolderClient.getPosts().size());
            System.out.println();
            System.out.println("https://jsonplaceholder.typicode.com/posts/postId");
            System.out.println(jsonPlaceHolderClient.getPost(5));
        };
    }
}
