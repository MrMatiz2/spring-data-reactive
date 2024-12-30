package com.example.springdatar2dbc.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Taco {

    @Id
    private Long id;

    private @NonNull String name;

    private Set<Long> ingredientsIds = new HashSet<>();

    public void addIngredient(Ingredient ingredient) {
        ingredientsIds.add(ingredient.getId());
    }

}
