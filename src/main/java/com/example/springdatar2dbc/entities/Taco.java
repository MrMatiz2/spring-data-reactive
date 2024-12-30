package com.example.springdatar2dbc.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
//@RestResource(rel = "tacos", path = "tacos")
//@Document
public class Taco {

    @Id
    private Long id;
    private String name;
    private Date createdAt = new Date();
    private List<Ingredient> ingredients = new ArrayList<>();

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

}
