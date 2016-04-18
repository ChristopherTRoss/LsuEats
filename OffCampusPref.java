package com.gth.protolsueats;

/**
 * Created by 14481_000 on 4/15/2016.
 */
public class OffCampusPref implements RestaurantPreferences{
    /**
     * Creates a OffCampus ResturantPrefrence class
     * @param restaurants the resturant list you want to filter
     * @return resturantList with just offCampus resturants
     */
    @Override
    public RestaurantList matchPreferences(RestaurantList restaurants){
        RestaurantList OffCampusRestaurants = new RestaurantList();

        for (int i = 0; i<restaurants.getSize(); i++) {
            if (restaurants.getRes(i).getOnCampus() == false) {
                OffCampusRestaurants.insert(restaurants.getRes(i));
            }
        }

        return OffCampusRestaurants;
    }
}
