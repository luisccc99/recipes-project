package com.example.recipes;

import org.springframework.web.bind.annotation.*;

@RestController
public class RecipeController {
    private Recipe recipe = new Recipe();

    @GetMapping("/recipe")
    public Recipe getRecipe() {
        return recipe;
    }

    @PostMapping("/recipe")
    public void postRecipe(@RequestBody Recipe recipe) {
        this.recipe = recipe;
    }

}
