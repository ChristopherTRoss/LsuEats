package com.gth.protolsueats;

/**
 * Created by 14481_000 on 4/15/2016.
 */
public class BurgerPref implements MealPreferences{
    /**
     * Creates a Burger MealPrefrence class
     * @param meals the menu you want to filter for burgers
     * @return menu with just burgers
     */
    @Override
    public Menu matchPreferences(Menu meals){
        Menu BurgerMeals = new Menu();

        for (int i = 0; i<meals.getSize(); i++) {
            if (meals.getMeal(i).getType().equalsIgnoreCase("BURGER")) {
                BurgerMeals.insert(meals.getMeal(i));
            }
        }

        return BurgerMeals;
    }
    @Override
    public Menu matchResPreferences(RestaurantList reslist){
        Menu BurgerMeal = new Menu();
        for(int i = 0; i<reslist.getSize(); i++){
            for(int j = 0; j<reslist.getRes(i).getMenu().getSize(); j++){
                if(reslist.getRes(i).getMenu().getMeal(j).getType().equalsIgnoreCase("BURGER"))
                    BurgerMeal.insert(reslist.getRes(i).getMenu().getMeal(j));
            }


        }
        return BurgerMeal;

    }
}
