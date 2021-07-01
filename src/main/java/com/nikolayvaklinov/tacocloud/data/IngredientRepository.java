package com.nikolayvaklinov.tacocloud.data;

import com.nikolayvaklinov.tacocloud.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository
        extends CrudRepository<Ingredient, String> {

}
