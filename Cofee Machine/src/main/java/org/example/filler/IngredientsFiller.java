package org.example.filler;

import org.example.enums.Ingreadient;

public class IngredientsFiller {
    public static void fillIngradients(Ingreadient type, double quantity){
        IngredientsHolder.addIngreadients(type,quantity);
    }
}
