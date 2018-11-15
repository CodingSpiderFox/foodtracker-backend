package com.codingspiderfox.foodtracker.backend.repository;

import com.codingspiderfox.foodtracker.backend.entities.FoodItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FoodItemRepository extends MongoRepository<FoodItem, String> {
}
