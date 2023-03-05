package com.arayworks.posterserver.repository;

import com.arayworks.posterserver.repository.entity.Inventory;
import com.arayworks.posterserver.repository.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    List<Inventory> findByProduct(Product product);
    List<Inventory> findByQuantityGreaterThan(Integer quantity);
    List<Inventory> findByRestockDateBefore(LocalDate date);
}
