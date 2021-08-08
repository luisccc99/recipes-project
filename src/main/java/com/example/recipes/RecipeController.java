package com.example.recipes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class RecipeController {
    private final Map<Integer, Recipe> recipes;

    @Autowired
    public RecipeController(Map<Integer, Recipe> recipes) {
        this.recipes = recipes;
    }

    @GetMapping("/recipe/{id}")
    public Recipe one(@PathVariable int id) {
        if (!recipes.containsKey(id)) {
            throw new RecipeNotFoundException(id);
        } else {
            return recipes.get(id);
        }
    }

    @PostMapping("/recipe/new")
    public void newRecipe(@RequestBody Recipe recipe) {
        recipes.put(Recipe.numberOfRecipes, recipe);
    }

}
