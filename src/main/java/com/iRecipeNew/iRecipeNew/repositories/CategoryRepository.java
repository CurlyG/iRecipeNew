package com.iRecipeNew.iRecipeNew.repositories;

import com.iRecipeNew.iRecipeNew.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}