package com.example.recipes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class RecipeRepository {

    @Bean
    public Map<Integer, Recipe> recipes() {
        return new HashMap<>();
    }

}
