package com.arayworks.posterserver.controller;

import com.arayworks.posterserver.repository.OrderItemRepository;
import com.arayworks.posterserver.repository.entity.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderItemController {
    @Autowired
    private OrderItemRepository orderItemRepository;

    @GetMapping("/orderitems")
    public List<OrderItem> findAllOrderItems(){
        return orderItemRepository.findAll();
    }
}
