package com.example.springdatar2dbc.repositories;

import com.example.springdatar2dbc.entities.Ingredient;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface IngredientRepository extends ReactiveCrudRepository<Ingredient, String> {

}
