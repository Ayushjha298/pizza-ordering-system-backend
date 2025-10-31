package com.example.pizza_ordering_system.service.impl;

import com.example.pizza_ordering_system.exception.ResourceNotFoundException;
import com.example.pizza_ordering_system.model.Store;
import com.example.pizza_ordering_system.repository.StoreRepository;
import com.example.pizza_ordering_system.service.interfaces.StoreService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {

    private final StoreRepository storeRepository;

    public StoreServiceImpl(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    @Override
    public Store addStore(Store store) {
        return storeRepository.save(store);
    }

    @Override
    public List<Store> getAllStores() {
        List<Store> stores = storeRepository.findAll();
        if (stores.isEmpty()) {
            throw new ResourceNotFoundException("No stores available");
        }
        return stores;
    }
}