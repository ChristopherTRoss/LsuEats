package com.gth.protolsueats;

/**
 * Created by 14481_000 on 4/15/2016.
 */
public class OrResPref implements RestaurantPreferences{
    private RestaurantPreferences pref;
    private RestaurantPreferences otherPref;

    public OrResPref(RestaurantPreferences pref1, RestaurantPreferences pref2)
    {
        pref = pref1;
        otherPref = pref2;
    }
    /**
     * Creates a ResturantList with one Prefrence OR another prefrence
     * Ex. Offcampus and OncCampus resturants
     * @param resturants
     * @return
     */
    @Override
    public RestaurantList matchPreferences(RestaurantList resturants){
        RestaurantList firstPrefRes = pref.matchPreferences(resturants);
        RestaurantList secondPrefRes = otherPref.matchPreferences(resturants);
        for(int i = 0; i<secondPrefRes.getSize(); i++)
        {
            if(!firstPrefRes.contains(secondPrefRes.getRes(i)))
                firstPrefRes.insert(secondPrefRes.getRes(i));
        }
        return firstPrefRes;
    }
}
