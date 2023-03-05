package com.arayworks.posterserver.controller;

import com.arayworks.posterserver.repository.CustomerRepository;
import com.arayworks.posterserver.repository.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customers")
    public List<Customer> findAllCustomers(){
        return customerRepository.findAll();
    }
}
