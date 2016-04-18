package com.gth.protolsueats;

/**
 * Created by 14481_000 on 4/15/2016.
 */
public class AndMealPref implements  MealPreferences{
    private MealPreferences pref;
    private MealPreferences otherPref;

    /*
    *Construct that AndMealPrefrence.  Initialze both Meal Prefrences
    */
    public AndMealPref(MealPreferences pref1, MealPreferences pref2)
    {
        pref = pref1;
        otherPref = pref2;
    }

    /*
    * Filter out a menu with the first prefrence and store in firstPrefMeals
    * Filter out the second Prefrences out of firstPrefMeals and return
    */
    @Override
    public Menu matchPreferences(Menu meals){
        Menu firstPrefMeals = pref.matchPreferences(meals);
        return otherPref.matchPreferences(firstPrefMeals);
    }

    @Override
    public Menu matchResPreferences(RestaurantList resList)
    {
        Menu firstPrefMeals = pref.matchResPreferences(resList);
        return otherPref.matchPreferences(firstPrefMeals);

    }
}
