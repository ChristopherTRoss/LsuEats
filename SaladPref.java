package com.gth.protolsueats;

/**
 * Created by 14481_000 on 4/15/2016.
 */
public class SaladPref implements MealPreferences{
    /**
     * Creates a Salad MealPrefrence class
     * @param meals the menu you want to filter for salads
     * @return menu with just salads
     */
    @Override
    public Menu matchPreferences(Menu meals){
        Menu SaladMeals = new Menu();

        for (int i = 0; i<meals.getSize(); i++) {
            if (meals.getMeal(i).getType().equalsIgnoreCase("SALAD")) {
                SaladMeals.insert(meals.getMeal(i));
            }
        }

        return SaladMeals;
    }
    @Override
    public Menu matchResPreferences(RestaurantList reslist){
        Menu SaladMeal = new Menu();
        for(int i = 0; i<reslist.getSize(); i++){
            for(int j = 0; j<reslist.getRes(i).getMenu().getSize(); j++){
                if(reslist.getRes(i).getMenu().getMeal(j).getType().equalsIgnoreCase("SALAD"))
                    SaladMeal.insert(reslist.getRes(i).getMenu().getMeal(j));
            }


        }
        return SaladMeal;

    }
}
