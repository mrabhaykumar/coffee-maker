package org.coffeemaker;

import java.util.ArrayList;
import java.util.List;

public abstract class Beverages {
    Ingredients storeIngredients = IngredientsManager.getIngredientsManager().getIngredients();

    Ingredients recipeIngredients;

    public String brew(Recipe recipe) {
        recipeIngredients = recipe.getIngredients();
        StringBuilder stringBuilder = new StringBuilder("Low on ");

        List<String> lowCheckMessages = check();
        if (lowCheckMessages.size() == 0) {
            updateStoreIngredients(recipeIngredients);
            return "Prepared";
        }
        lowCheckMessages.forEach(msg -> stringBuilder.append(msg).append(", "));
        stringBuilder.setLength(stringBuilder.length() - 2);
        return stringBuilder.toString();
    }

    public List<String> check() {
        List<String> lowIngredients = new ArrayList<>();
        if (storeIngredients.getSugarSyrup() < recipeIngredients.getSugarSyrup()) {
            lowIngredients.add("suger syrup");
        }
        if (storeIngredients.getTeaLeavesSyrup() < recipeIngredients.getTeaLeavesSyrup()) {
            lowIngredients.add("tea leaves syrup");
        }
        if (storeIngredients.getCoffeeSyrup() < recipeIngredients.getCoffeeSyrup()) {
            lowIngredients.add("coffee syrup");
        }
        if (storeIngredients.getGingerSyrup() < recipeIngredients.getGingerSyrup()) {
            lowIngredients.add("ginger syrup");
        }
        if (storeIngredients.getHotMilk() < recipeIngredients.getHotMilk()) {
            lowIngredients.add("hot Milk");
        }
        if (storeIngredients.getHotWater() < recipeIngredients.getHotWater()) {
            lowIngredients.add("hot water");
        }
        if (storeIngredients.getGreenMixture() < recipeIngredients.getGreenMixture()) {
            lowIngredients.add("green Mixture");
        }
        return lowIngredients;
    }

    public void updateStoreIngredients(Ingredients recipeIngredients) {
        storeIngredients.setCoffeeSyrup(storeIngredients.getCoffeeSyrup() - recipeIngredients.getCoffeeSyrup());
        storeIngredients.setGingerSyrup(storeIngredients.getGingerSyrup() - recipeIngredients.getGingerSyrup());
        storeIngredients.setHotMilk(storeIngredients.getHotMilk() - recipeIngredients.getHotMilk());
        storeIngredients.setTeaLeavesSyrup(storeIngredients.getTeaLeavesSyrup() - recipeIngredients.getTeaLeavesSyrup());
        storeIngredients.setHotWater(storeIngredients.getHotWater() - recipeIngredients.getHotWater());
        storeIngredients.setSugarSyrup(storeIngredients.getSugarSyrup() - recipeIngredients.getSugarSyrup());
        storeIngredients.setGreenMixture(storeIngredients.getGreenMixture() - recipeIngredients.getGreenMixture());
    }
}
