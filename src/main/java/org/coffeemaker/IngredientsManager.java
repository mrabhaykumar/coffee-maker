package org.coffeemaker;

public class IngredientsManager {
    private final Ingredients ingredients;
    private IngredientsManager() {
        ingredients  = new Ingredients();
    }

    private static class IngredientsHelper {
        private static final IngredientsManager INSTANCE = new IngredientsManager();
    }

    public static IngredientsManager getIngredientsManager() {
        return IngredientsManager.IngredientsHelper.INSTANCE;
    }

    public Ingredients getIngredients() {
        return ingredients;
    }
    public void refill(int hotMilk,
                       int hotWater,
                       int gingerSyrup,
                       int sugarSyrup,
                       int teaLeavesSyrup,
                       int coffeeSyrup,
                       int greenMixture) {

        IngredientsManager ingredientsManager = getIngredientsManager();
        ingredientsManager.ingredients.setHotMilk(ingredientsManager.ingredients.getHotMilk() + hotMilk);
        ingredientsManager.ingredients.setHotWater(ingredientsManager.ingredients.getHotWater() + hotWater);
        ingredientsManager.ingredients.setGingerSyrup(ingredientsManager.ingredients.getGingerSyrup() + gingerSyrup);
        ingredientsManager.ingredients.setTeaLeavesSyrup(ingredientsManager.ingredients.getTeaLeavesSyrup() + teaLeavesSyrup);
        ingredientsManager.ingredients.setCoffeeSyrup(ingredientsManager.ingredients.getCoffeeSyrup() + coffeeSyrup);
        ingredientsManager.ingredients.setSugarSyrup(ingredientsManager.ingredients.getSugarSyrup() + sugarSyrup);
        ingredientsManager.ingredients.setGreenMixture(ingredientsManager.ingredients.getGreenMixture() + greenMixture);

    }
}
