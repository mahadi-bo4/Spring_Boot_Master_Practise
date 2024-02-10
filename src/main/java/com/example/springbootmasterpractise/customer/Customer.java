package com.example.springbootmasterpractise.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table
public class Customer {

    @Id
    private Long id;

    @NotBlank(message = "Name must be not empty")
    private String name;

    @NotBlank(message = "Password must be not empty")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @Email(message = "Email must be not empty")
    private  String email;

    public Customer(Long id,
                    String name,
                    String password,
                    String email) {

        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public Customer() {
    }

    @JsonProperty("customerID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonIgnore
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
