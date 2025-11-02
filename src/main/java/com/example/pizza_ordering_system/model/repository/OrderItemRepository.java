package com.example.pizza_ordering_system.model.repository;

import com.example.pizza_ordering_system.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
