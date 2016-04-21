package com.gth.protolsueats;

/**
 * Created by 14481_000 on 4/15/2016.
 */
public class MexicanPref implements  MealPreferences{
    /**
     * Creates a Mexican MealPrefrence class
     * @param meals the menu you want to filter for Mexican food
     * @return menu with just mexican food
     */
    @Override
    public Menu matchPreferences(Menu meals){
        Menu MexicanMeals = new Menu();

        for (int i = 0; i<meals.getSize(); i++) {
            if (meals.getMeal(i).getType().equalsIgnoreCase("Mexican")) {
                MexicanMeals.insert(meals.getMeal(i));
            }
        }

        return MexicanMeals;
    }
    @Override
    public Menu matchResPreferences(RestaurantList reslist){
        Menu MexicanMeal = new Menu();
        for(int i = 0; i<reslist.getSize(); i++){
            for(int j = 0; j<reslist.getRes(i).getMenu().getSize(); j++){
                if(reslist.getRes(i).getMenu().getMeal(j).getType().equalsIgnoreCase("MEXICAN"))
                    MexicanMeal.insert(reslist.getRes(i).getMenu().getMeal(j));
            }


        }
        return MexicanMeal;

    }
}
