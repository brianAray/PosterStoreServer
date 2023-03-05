package com.arayworks.posterserver.controller;

import com.arayworks.posterserver.repository.OrderRepository;
import com.arayworks.posterserver.repository.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/orders")
    public List<Order> findAllOrders(){
        return orderRepository.findAll();
    }
}
