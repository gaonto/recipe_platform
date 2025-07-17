package com.gaon.recipe_platform.repository;

import com.gaon.recipe_platform.model.RecipeIngredient;
import com.gaon.recipe_platform.model.RecipeIngredientId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeIngredientRepository extends JpaRepository<RecipeIngredient, RecipeIngredientId> {
}