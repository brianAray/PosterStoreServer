package com.arayworks.posterserver.repository;

import com.arayworks.posterserver.repository.entity.Customer;
import com.arayworks.posterserver.repository.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByCustomer(Customer customer);
    List<Order> findByOrderDateBetween(LocalDate startDate, LocalDate endDate);
    List<Order> findByOrderTotalGreaterThan(BigDecimal total);
}
