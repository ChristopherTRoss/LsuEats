package com.gth.protolsueats;

/**
 * Created by 14481_000 on 4/15/2016.
 */
public class Restaurant {
    private String location;
    private String resName;
    private boolean onCampus;
    private Menu menu;
    /**
     * Creates a Resturant instance
     * @param location location of resturant
     * @param resname Name of resturant
     * @param onCampus true if on campus, false if off campus
     */
    public Restaurant(String location, String resname, boolean onCampus)
    {
        this.location = location;
        resName = resname;
        this.onCampus = onCampus;
        menu = new Menu();
    }
    /*
    *returns location of resturant
    */
    public String getLocation()
    {
        return location;
    }
    /*
    * returns name of resturant
    */
    public String getResName()
    {
        return resName;

    }
    /*
    * returns menu of resturant
    */
    public Menu getMenu()
    {
        return menu;
    }
    /**
     *
     * @return 1 if it is on campus, 0 if its not
     */
    public boolean getOnCampus()
    {
        return onCampus;
    }
    /**
     * Checks to see if one resturant is the same as another
     * @param res Resturant you want to compare
     * @return 1 if they are equal, 0 if they are not
     */
    public boolean isEqual(Restaurant res)
    {
        return (res.getOnCampus()== onCampus &&
                res.getLocation().equals(location) &&
                res.getResName().equals(resName));
    }

}


