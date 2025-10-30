package com.example.pizza_ordering_system.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "stores")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String storeName;
    private String location;
    private String contactNumber;

    @OneToMany(mappedBy = "store", cascade = CascadeType.ALL)
    private List<FoodItem> foodItems;
}