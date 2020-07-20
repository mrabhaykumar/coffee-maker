package org.coffeemaker;

import java.util.HashMap;
import java.util.Map;

public class RecipeBuilder {
    public static HashMap<String, Recipe> recipes;

    private RecipeBuilder() {
        recipes = new HashMap<>();
    }

    private static class RecipeBuilderHelper {
        private static final RecipeBuilder INSTANCE = new RecipeBuilder();
    }

    public static RecipeBuilder getRecipeBuilder() {
        return RecipeBuilder.RecipeBuilderHelper.INSTANCE;
    }

    public Recipe getRecipe(String beverage) {
        return recipes.get(beverage);
    }

    public void buildRecipe(Map<String, Integer> ingredientsMap, String recipeName) {
        Ingredients ingredients = new Ingredients();
        ingredients.setHotMilk(ingredientsMap.getOrDefault("hot_milk", 0));
        ingredients.setGingerSyrup(ingredientsMap.getOrDefault("ginger_syrup", 0));
        ingredients.setSugarSyrup(ingredientsMap.getOrDefault("sugar_syrup", 0));
        ingredients.setTeaLeavesSyrup(ingredientsMap.getOrDefault("tea_leaves_syrup", 0));
        ingredients.setHotWater(ingredientsMap.getOrDefault("hot_water", 0));
        ingredients.setGreenMixture(ingredientsMap.getOrDefault("green_mixture", 0));
        ingredients.setCoffeeSyrup(ingredientsMap.getOrDefault("coffee_syrup", 0));

        Recipe recipe = new Recipe();
        recipe.setIngredients(ingredients);
        recipes.put(recipeName, recipe);
    }
}
