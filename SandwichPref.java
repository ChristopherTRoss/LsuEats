package com.gth.protolsueats;

/**
 * Created by 14481_000 on 4/15/2016.
 */
public class SandwichPref implements MealPreferences{
    /**
     * Creates a Sandwich MealPrefrence class
     * @param meals the menu you want to filter for Sandwiches
     * @return menu with just sandwiches
     */
    @Override
    public Menu matchPreferences(Menu meals){
        Menu SandwichMeals = new Menu();

        for (int i = 0; i<meals.getSize(); i++) {
            if (meals.getMeal(i).getType().equalsIgnoreCase("SANDWICH")) {
                SandwichMeals.insert(meals.getMeal(i));
            }
        }

        return SandwichMeals;
    }
    @Override
    public Menu matchResPreferences(RestaurantList reslist){
        Menu SandwichMeal = new Menu();
        for(int i = 0; i<reslist.getSize(); i++){
            for(int j = 0; j<reslist.getRes(i).getMenu().getSize(); j++){
                if(reslist.getRes(i).getMenu().getMeal(j).getType().equalsIgnoreCase("SANDWICH"))
                    SandwichMeal.insert(reslist.getRes(i).getMenu().getMeal(j));
            }


        }
        return SandwichMeal;

    }
}
