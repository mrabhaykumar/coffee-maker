package org.coffeemaker;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoffeeMaker {

    public static void main(String[] args) throws JsonProcessingException {
        String jsonInput = "{\"machine\":{\"outlets\":{\"count_n\":3},\"total_items_quantity\":{\"hot_water\":500,\"hot_milk\":500,\"ginger_syrup\":100,\"sugar_syrup\":100,\"tea_leaves_syrup\":100},\"beverages\":{\"hot_tea\":{\"hot_water\":200,\"hot_milk\":100,\"ginger_syrup\":10,\"sugar_syrup\":10,\"tea_leaves_syrup\":30},\"hot_coffee\":{\"hot_water\":100,\"ginger_syrup\":30,\"hot_milk\":400,\"sugar_syrup\":50,\"tea_leaves_syrup\":30},\"black_tea\":{\"hot_water\":300,\"ginger_syrup\":30,\"sugar_syrup\":50,\"tea_leaves_syrup\":30},\"green_tea\":{\"hot_water\":100,\"ginger_syrup\":30,\"sugar_syrup\":50,\"green_mixture\":30}}}}";
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> input = (Map<String, Object>)objectMapper.readValue(jsonInput, HashMap.class).get("machine");

        Map<String, Integer> total_items_quantity = (Map<String, Integer>) input.get("total_items_quantity");
        Map<String, Object> beverages = (Map<String, Object>) input.get("beverages");

        beverages.keySet().forEach(beverage -> {
         Map<String, Integer> bevDetails = (Map<String, Integer>) beverages.get(beverage);
         RecipeBuilder.getRecipeBuilder().buildRecipe(bevDetails, beverage);
        });

        IngredientsManager.getIngredientsManager().refill(
                total_items_quantity.getOrDefault("hot_milk",0),
                total_items_quantity.getOrDefault("hot_water",0),
                total_items_quantity.getOrDefault("ginger_syrup",0),
                total_items_quantity.getOrDefault("sugar_syrup",0),
                total_items_quantity.getOrDefault("tea_leaves_syrup",0),
                total_items_quantity.getOrDefault("coffee_syrup",0),
                total_items_quantity.getOrDefault("green_mixture",0));
        Scanner sc = new Scanner(System.in);
        while(true){
            String drink = sc.nextLine();
            if(drink.equals("green_tea")){
             String response =    new GreenTea().brew();
                System.out.println(response);
            } else if(drink.equals("hot_tea")){
                System.out.println(new HotTea().brew());
            }

        }
    }
}

