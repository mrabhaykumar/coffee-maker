package org.coffeemaker;

import java.util.ArrayList;
import java.util.List;

public class GreenTea extends Beverages {
    Recipe gingerTeaRecipe = RecipeBuilder.getRecipeBuilder().getRecipe("green_tea");
    public String brew() {
       return super.brew(gingerTeaRecipe);
    }

}
