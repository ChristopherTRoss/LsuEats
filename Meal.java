package com.gth.protolsueats;

public class Meal
{
    private String name;
    private double cost;
    private String type;
    private Restaurant res;

    /**
     * Creates a meal with name, resturant, its cost, and its food type
     * @param name Name of meal
     * @param res Name of resturant that produces the meal
     * @param cost Cost of meal
     * @param type Type of food the meal is
     */
    public Meal (String name, Restaurant res, double cost, String type)
    {
        this.name = name;
        this.cost = cost;
        this.type = type;
        this.res = res;

    }
    /**
     *
     * @return name of meal
     */
    public String getName()
    {
        return name;
    }
    /**
     *
     * @return cost of meal
     */
    public double getCost()
    {
        return cost;
    }
    /**
     *
     * @return type of meal
     */
    public String getType()
    {
        return type;
    }

    /**
     *
     * @return the resturant the seves the meal
     */
    public Restaurant getResturant()
    {
        return res;
    }

    /**
     * Checks to see if one Meal is the same as another.
     * They are the same if they share cost, name, and type
     * @param meal Meal that you are comparing
     * @return 1 is the are equal, 0 is they are not
     */
    public boolean isEqual(Meal meal)
    {
        return meal.getCost() == cost && meal.getName().equals(name) && meal.getType().equals(type);
    }

    /**
     * Prints the basic description of the meal
     * In the format of:
     * Food name  cost Resturant Name
     * EX. Cheeseburger 2.99
     */
    public String MealDescription()
    {
        return "Meal: " + name + " " + "$" + cost + "0\n" +res.getResName() +" located at " + res.getLocation();
    }


}

