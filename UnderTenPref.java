package com.gth.protolsueats;

/**
 * Created by 14481_000 on 4/15/2016.
 */
public class UnderTenPref implements MealPreferences{
    /**
     * Creates a Under 10$ MealPrefrence class
     * @param meals the menu you want to filter for meals under $10
     * @return menu with just meals under $10
     */
    @Override
    public Menu matchPreferences(Menu meals){
        Menu Under10Meals = new Menu();

        for (int i = 0; i<meals.getSize(); i++) {
            if (meals.getMeal(i).getCost()<=10) {
                Under10Meals.insert(meals.getMeal(i));
            }
        }

        return Under10Meals;
    }

    @Override
    public Menu matchResPreferences(RestaurantList reslist){
        Menu Under10Meals = new Menu();
        for(int i = 0; i<reslist.getSize(); i++){
            for(int j = 0; j<reslist.getRes(i).getMenu().getSize(); j++){
                if(reslist.getRes(i).getMenu().getMeal(j).getCost()<=10)
                    Under10Meals.insert(reslist.getRes(i).getMenu().getMeal(j));
            }


        }
        return Under10Meals;

    }
}
