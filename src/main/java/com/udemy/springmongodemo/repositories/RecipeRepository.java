package com.udemy.springmongodemo.repositories;

import com.udemy.springmongodemo.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, String> {
}
