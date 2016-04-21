package com.gth.protolsueats;

/**
 * Created by 14481_000 on 4/15/2016.
 */
public class ItalianPref implements  MealPreferences{
    /**
     * Creates a Italian MealPrefrence class
     * @param meals the menu you want to filter for Italian
     * @return menu with just Italian food
     */
    @Override
    public Menu matchPreferences(Menu meals){
        Menu ItalianMeals = new Menu();

        for (int i = 0; i<meals.getSize(); i++) {
            if (meals.getMeal(i).getType().equalsIgnoreCase("ITALIAN")) {
                ItalianMeals.insert(meals.getMeal(i));
            }
        }

        return ItalianMeals;
    }
    @Override
    public Menu matchResPreferences(RestaurantList reslist){
        Menu ItalianMeal = new Menu();
        for(int i = 0; i<reslist.getSize(); i++){
            for(int j = 0; j<reslist.getRes(i).getMenu().getSize(); j++){
                if(reslist.getRes(i).getMenu().getMeal(j).getType().equalsIgnoreCase("Italian"))
                    ItalianMeal.insert(reslist.getRes(i).getMenu().getMeal(j));
            }


        }
        return ItalianMeal;

    }
}
