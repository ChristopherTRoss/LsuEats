package com.gth.protolsueats;

/**
 * Created by 14481_000 on 4/15/2016.
 */
public class OnCampusPref implements  RestaurantPreferences{
    /**
     * Creates a OnCampus ResturantPrefrence class
     * @param restaurants the resturant list you want to filter
     * @return resturantList with just onCampus resturants
     */
    @Override
    public RestaurantList matchPreferences(RestaurantList restaurants){
        RestaurantList OnCampusResturants = new RestaurantList();

        for (int i = 0; i<restaurants.getSize(); i++) {
            if (restaurants.getRes(i).getOnCampus() == true) {
                OnCampusResturants.insert(restaurants.getRes(i));
            }
        }

        return OnCampusResturants;
    }
}
