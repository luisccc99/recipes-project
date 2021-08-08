package com.example.recipes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recipe {
    public static int numberOfRecipes = 0;
    private String name;
    private String description;
    private String[] ingredients;
    private String[] directions;

    {
        numberOfRecipes++;
    }
}
