package org.coffeemaker;

public class HotTea extends Beverages {
    Recipe hotTeaRecipe = RecipeBuilder.getRecipeBuilder().getRecipe("hot_tea");

    public String brew() {
        return super.brew(hotTeaRecipe);
    }

}
