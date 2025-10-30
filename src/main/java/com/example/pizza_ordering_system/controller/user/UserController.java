package com.example.pizza_ordering_system.controller.user;

import com.example.pizza_ordering_system.model.Store;
import com.example.pizza_ordering_system.service.interfaces.StoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final StoreService storeService;

    public UserController(StoreService storeService) {
        this.storeService = storeService;
    }

    // ✅ USER ENDPOINT: Get All Stores
    @GetMapping("/stores")
    public List<Store> getAllStores() {
        return storeService.getAllStores();
    }
}

