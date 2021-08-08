package com.example.recipes;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class RecipeNotFoundException extends RuntimeException {

    RecipeNotFoundException(int id) {
        super("Could not find recipe with id: " + id );
    }
}
