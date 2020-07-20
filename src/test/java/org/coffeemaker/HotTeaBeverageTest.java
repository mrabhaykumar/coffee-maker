package org.coffeemaker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class HotTeaBeverageTest {
HotTea hotTea;
    @Before
    public void setUp() throws Exception {
        hotTea = new HotTea();
        hotTea.storeIngredients = new Ingredients();
        hotTea.recipeIngredients = new Ingredients();
        HashMap<String, Integer> integerHashMap = new HashMap<>();
        RecipeBuilder.getRecipeBuilder().buildRecipe(integerHashMap,"hot_tea");
        hotTea.hotTeaRecipe = RecipeBuilder.getRecipeBuilder().getRecipe("hot_tea");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void brew() {
        hotTea.brew();
    }
}