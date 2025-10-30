package com.example.pizza_ordering_system.service.interfaces;


import com.example.pizza_ordering_system.model.Store;

import java.util.List;

public interface StoreService {
    Store addStore(Store store);
    List<Store> getAllStores();
}
