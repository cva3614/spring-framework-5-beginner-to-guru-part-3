package com.udemy.springmongodemo.services;

import com.udemy.springmongodemo.domain.Recipe;
import com.udemy.springmongodemo.commands.RecipeCommand;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(String id);

    RecipeCommand findCommandById(String id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(String idToDelete);
}
