package com.arayworks.posterserver.repository;

import com.arayworks.posterserver.repository.entity.Order;
import com.arayworks.posterserver.repository.entity.OrderItem;
import com.arayworks.posterserver.repository.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    List<OrderItem> findByOrder(Order order);
    List<OrderItem> findByProduct(Product product);
    List<OrderItem> findByQuantityGreaterThan(Integer quantity);
    List<OrderItem> findByPriceGreaterThan(BigDecimal price);
}
