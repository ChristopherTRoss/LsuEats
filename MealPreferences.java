package com.gth.protolsueats;

/**
 * Created by 14481_000 on 4/15/2016.
 */
public interface MealPreferences {
    public Menu matchPreferences(Menu meals);
    public Menu matchResPreferences(RestaurantList reslist);
}
