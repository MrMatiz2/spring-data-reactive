package com.example.springdatar2dbc.repositories;

import com.example.springdatar2dbc.entities.Ingredient;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface IngredientRepository extends ReactiveCrudRepository<Ingredient, Integer> {

    Mono<Ingredient> findBySlug(String slug);

}
