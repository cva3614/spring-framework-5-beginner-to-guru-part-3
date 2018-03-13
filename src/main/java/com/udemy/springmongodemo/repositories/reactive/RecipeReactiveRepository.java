package com.udemy.springmongodemo.repositories.reactive;

import com.udemy.springmongodemo.domain.Recipe;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface RecipeReactiveRepository extends ReactiveMongoRepository<Recipe, String> {
}
