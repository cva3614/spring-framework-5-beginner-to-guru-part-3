package com.udemy.springmongodemo.services;

import com.udemy.springmongodemo.domain.Recipe;
import com.udemy.springmongodemo.commands.RecipeCommand;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface RecipeService {

    Flux<Recipe> getRecipes();

    Mono<Recipe> findById(String id);

    Mono<RecipeCommand> findCommandById(String id);

    Mono<RecipeCommand> saveRecipeCommand(RecipeCommand command);

    Mono<Object> deleteById(String idToDelete);
}
