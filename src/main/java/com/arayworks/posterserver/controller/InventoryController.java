package com.arayworks.posterserver.controller;

import com.arayworks.posterserver.repository.InventoryRepository;
import com.arayworks.posterserver.repository.entity.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InventoryController {
    @Autowired
    private InventoryRepository inventoryRepository;

    @GetMapping("/inventories")
    public List<Inventory> findAllInventories(){
        return inventoryRepository.findAll();
    }
}
