package com.example.pizza_ordering_system.controller.admin;

import com.example.pizza_ordering_system.model.Store;
import com.example.pizza_ordering_system.service.interfaces.StoreService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    private final StoreService storeService;

    public AdminController(StoreService storeService) {
        this.storeService = storeService;
    }

    // ✅ ADMIN ENDPOINT: Add Store
    @PostMapping("/stores")
    public Store addStore(@RequestBody Store store) {
        return storeService.addStore(store);
    }
}
