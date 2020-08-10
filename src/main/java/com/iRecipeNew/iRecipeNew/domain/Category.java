package com.iRecipeNew.iRecipeNew.domain;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class  Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "category")
    private List<Recipe> recipes;
}
