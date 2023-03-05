package com.arayworks.posterserver.repository;

import com.arayworks.posterserver.repository.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
