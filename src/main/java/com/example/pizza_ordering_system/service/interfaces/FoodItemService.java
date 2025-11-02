package com.example.pizza_ordering_system.service.interfaces;

import com.example.pizza_ordering_system.model.FoodItem;

import java.util.List;

public interface FoodItemService {
    FoodItem addFoodItem(FoodItem foodItem); // Prachi
    List<FoodItem> getAllFoodItems(); // Prachi
    FoodItem updateFoodItem(Long id, FoodItem updatedItem); // varsha
    void deleteFoodItem(Long id);
}
