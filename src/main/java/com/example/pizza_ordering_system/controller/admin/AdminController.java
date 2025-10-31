package com.example.pizza_ordering_system.controller.admin;

import com.example.pizza_ordering_system.model.Store;
import com.example.pizza_ordering_system.response.ApiResponse;
import com.example.pizza_ordering_system.service.interfaces.StoreService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    private final StoreService storeService;

    public AdminController(StoreService storeService) {
        this.storeService = storeService;
    }
    @PostMapping("/stores")
    public ResponseEntity<ApiResponse<Store>> addStore(@RequestBody Store store) {
        Store savedStore = storeService.addStore(store);
        ApiResponse<Store> response = new ApiResponse<>(
                HttpStatus.CREATED.value(),
                savedStore,
                "Store added successfully"
        );
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/stores")
    public ResponseEntity<ApiResponse<List<Store>>> getAllStores() {
        List<Store> stores = storeService.getAllStores();
        ApiResponse<List<Store>> response = new ApiResponse<>(
                HttpStatus.OK.value(),
                stores,
                "Stores fetched successfully"
        );
        return ResponseEntity.ok(response);
    }


}
