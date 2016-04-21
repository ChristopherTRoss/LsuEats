package com.gth.protolsueats;

/**
 * Created by 14481_000 on 4/15/2016.
 */
public class ChinesePref implements  MealPreferences{
    /**
     * Creates a Chinese MealPrefrence class
     * @param meals the menu you want to filter for chinese food
     * @return menu with just chinese food
     */
    @Override
    public Menu matchPreferences(Menu meals){
        Menu ChineseMeals = new Menu();

        for (int i = 0; i<meals.getSize(); i++) {
            if (meals.getMeal(i).getType().equalsIgnoreCase("CHINESE")) {
                ChineseMeals.insert(meals.getMeal(i));
            }
        }

        return ChineseMeals;
    }
    @Override
    public Menu matchResPreferences(RestaurantList reslist){
        Menu ChineseMeal = new Menu();
        for(int i = 0; i<reslist.getSize(); i++){
            for(int j = 0; j<reslist.getRes(i).getMenu().getSize(); j++){
                if(reslist.getRes(i).getMenu().getMeal(j).getType().equalsIgnoreCase("CHINESE"))
                    ChineseMeal.insert(reslist.getRes(i).getMenu().getMeal(j));
            }


        }
        return ChineseMeal;

    }
}
