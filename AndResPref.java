package com.gth.protolsueats;

/**
 * Created by 14481_000 on 4/15/2016.
 */
public class AndResPref implements RestaurantPreferences{
    private RestaurantPreferences pref;
    private RestaurantPreferences otherPref;

    public AndResPref(RestaurantPreferences pref1, RestaurantPreferences pref2)
    {
        pref = pref1;
        otherPref = pref2;
    }

    /**
     * Takes both prefrences and filters both of them out of the resturant
     * list
     * @param resturants
     * @return ResturantList that has filtered out two prefrences
     */
    @Override
    public RestaurantList matchPreferences(RestaurantList resturants){
        RestaurantList firstPrefRes= pref.matchPreferences(resturants);
        return otherPref.matchPreferences(firstPrefRes);

    }

}

