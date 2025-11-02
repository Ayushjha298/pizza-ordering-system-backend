package com.example.pizza_ordering_system.model.repository;

import com.example.pizza_ordering_system.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
