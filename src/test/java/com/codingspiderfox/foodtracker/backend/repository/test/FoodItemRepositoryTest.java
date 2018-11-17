package com.codingspiderfox.foodtracker.backend.repository.test;

import com.codingspiderfox.foodtracker.backend.entities.FoodItem;
import com.codingspiderfox.foodtracker.backend.repository.FoodItemRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataMongoTest
@RunWith(SpringRunner.class)
public class FoodItemRepositoryTest {

    @Autowired
    private FoodItemRepository foodItemRepository;

    @Test
    public void createFoodItem_AndRetrieve_Successfully() {

        FoodItem foodItem = new FoodItem();
        foodItem.setEan("123");

        foodItemRepository.save(foodItem);

        Optional<FoodItem> retrievedFoodItem = foodItemRepository.findById(foodItem.getId());
        assertThat(retrievedFoodItem.isPresent())
                .as("Retrieved food item should not be null")
                .isTrue();
    }
}
