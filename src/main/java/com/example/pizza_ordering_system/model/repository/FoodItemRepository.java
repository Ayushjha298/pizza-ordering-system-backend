package com.example.pizza_ordering_system.model.repository;

import com.example.pizza_ordering_system.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {
}
