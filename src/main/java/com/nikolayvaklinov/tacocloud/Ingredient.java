package com.nikolayvaklinov.tacocloud;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.lang.reflect.Type;

@Data
@Entity
@AllArgsConstructor

@NoArgsConstructor(access=AccessLevel.PROTECTED, force=true)
public class Ingredient {

    @Id
    private String id;
    private String name;
    private Type type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

}
