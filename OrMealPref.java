package com.gth.protolsueats;

/**
 * Created by 14481_000 on 4/15/2016.
 */
public class OrMealPref implements MealPreferences{
    private MealPreferences pref;
    private MealPreferences otherPref;

    public OrMealPref(MealPreferences pref1, MealPreferences pref2)
    {
        pref = pref1;
        otherPref = pref2;
    }
    /**
     * Ors two different Prefrences together to contain a menu with both options
     * as meals.
     * Does this by creating a menu for each type of prefrence, then checks
     * to see if they are contained in each other, if not, then the meal is added
     * @param meals
     * @return
     */
    @Override
    public Menu matchPreferences(Menu meals){
        Menu firstPrefMeals = pref.matchPreferences(meals);
        Menu secondPrefMeals = otherPref.matchPreferences(meals);
        for(int i = 0; i<meals.getSize(); i++)
        {
            if(!firstPrefMeals.contains(meals.getMeal(i)))
                firstPrefMeals.insert(meals.getMeal(i));
        }
        return firstPrefMeals;
    }

    @Override
    public Menu matchResPreferences(RestaurantList resList){
        Menu firstPrefMeals = pref.matchResPreferences(resList);
        Menu secondPrefMeals = otherPref.matchPreferences(firstPrefMeals);
        if(firstPrefMeals.getSize()<secondPrefMeals.getSize())
        {
            Menu temp = firstPrefMeals;
            firstPrefMeals = secondPrefMeals;
            secondPrefMeals = temp;
        }
        for(int i = 0; i<firstPrefMeals.getSize(); i++)
        {
            if(!firstPrefMeals.contains(secondPrefMeals.getMeal(i)))
                firstPrefMeals.insert(secondPrefMeals.getMeal(i));
        }
        return firstPrefMeals;
    }
}
