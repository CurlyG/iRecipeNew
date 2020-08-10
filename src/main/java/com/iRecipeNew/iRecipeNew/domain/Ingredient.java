package com.iRecipeNew.iRecipeNew.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
import java.util.Set;



@Entity
@Data
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String unitOfMeasure;


    @OneToMany(mappedBy = "ingredient")
    List<RecipeIngredient> quantity;




}
