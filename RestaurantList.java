package com.gth.protolsueats;
import java.util.Random;

/**
 * Created by 14481_000 on 4/15/2016.
 */
public class RestaurantList {
    private Restaurant [] list = new Restaurant[100];
    private int listSize;

    public RestaurantList()
    {
        listSize = 0;
    }
    /*
    * returns listSize
    */
    public int getSize()
    {
        return listSize;
    }
    /**
     * Checks to see if a resturant is contained in the list
     * @param restaurant resturant you checking to see if it contained
     * @return 1 if it is contained, 0 if it is not
     */

    public boolean contains(Restaurant restaurant)
    {
        for(int i = 0; i<listSize;i++)
        {
            if(restaurant.isEqual(list[i]))
                return true;

        }
        return false;
    }
    /**
     *
     * @param position position of restaurant in array that you want returned
     * @return Resturant located at that position on the list
     */
    public Restaurant getRes(int position)
    {
        return list[position];
    }
    /**
     * Inserts a resturant to end of list and then increments listSize
     * @param res resturant added to the list
     */
    public void insert(Restaurant res)
    {
        list[listSize] = res;
        listSize++;
    }
    /**
     * Deletes the resturant located at that position then decrements the size
     * @param pos postion of resturant being deleted
     */
    public void delete(int pos)
    {
        list[pos] = null;
        listSize--;
    }
    /**
     * Generates random resturant in the list
     * @return resturant randomly selected
     */
    public Meal getRandMeal()
    {

        if(listSize > 0){
            Random rand = new Random();
            int randElement = rand.nextInt(listSize);
            for(int i = 0; i<listSize; i++){


                if(list[randElement]!=null)
                {
                    int randMealElement = rand.nextInt(listSize);
                    Meal randMeal = list[randElement].getMenu().findRandomMeal();
                    if(randMeal!=null)
                        return randMeal;

                }
            }

        }
        else
            System.out.println("No resturants availabe with those prefrences");
        return null;
    }

    public Menu listToMenu()
    {
        Menu menu = new Menu();
        Meal meal;
        for(int i =0; i<this.getSize();i++)
            for(int j = 0; j<this.getRes(i).getMenu().getSize(); j++)
            {
                meal = this.getRes(i).getMenu().getMeal(j);
                menu.insert(meal);
            }
        return menu;
    }

    public RestaurantList combineResList(RestaurantList resList1, RestaurantList resList2)
    {
        RestaurantList finalResList = new RestaurantList();
        for(int i = 0; i<resList1.getSize();i++)
        {
            finalResList.insert(resList1.getRes(i));
        }
        for(int i = 0; i<resList2.getSize();i++)
        {
            finalResList.insert((resList2.getRes(i)));
        }
        return finalResList;
    }



    /**
     * Print the Resturant list by just their name and location
     * Ex. Mellow Mushroom Burbank Dr.
     */
//    public void printList()
//    {
//        for(int i = 0; i<listSize;i++)
//        {
//            System.out.printf("%s %s\n", list[i].getResName(), list[i].getLocation());
//            list[i].getMenu().printMenu();
//        }
//    }
}
