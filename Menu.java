package com.gth.protolsueats;

import java.util.Random;

public class Menu
{
    private Meal [] list = new Meal[500];
    private int listSize;

    /*
    * create a menu class and initialize size at 0
    */
    public Menu()
    {
        listSize = 0;
    }

    /**
     *
     * @return current size of menu(# of meals the menu contains)
     */
    public int getSize()
    {
        return listSize;
    }
    /**
     * Takes the position given and returns the meal located at that element
     * @param position position of meal within the menu
     * @return the meal located at the position
     */
    public Meal getMeal(int position)
    {
        return list[position];
    }
    /**
     * Checks to see if the menu contains a certain meal.
     * @param meal The meal you want to see if its in the menu
     * @return true if the meal in the menu, false if it isnt
     */
    public boolean contains(Meal meal)
    {
        for(int i = 0; i<listSize;i++){
            if(meal.isEqual(list[i]))
                return true;
        }
        return false;

    }
    /**
     * Inserts a meal to the end of the menu then increments the size
     * @param meal meal added to menu
     */
    public void insert(Meal meal)
    {
        list[listSize] = meal;
        listSize++;
    }

    public Menu add(Menu menu)
    {
        Menu finalMenu = new Menu();
        int menSize = menu.getSize();

        for(int i = 0; i<menSize;i++)
        {
            finalMenu.insert(menu.getMeal(i));
        }
        for(int i = 0; i<listSize;i++)
        {
            finalMenu.insert(list[i]);
        }
        return finalMenu;

    }
    /**
     * deletes the meal located at that position
     * @param pos position of meal you want to delete
     */
    public void delete(int pos)
    {
        list[pos] = null;
        listSize--;
    }
    /**
     * Generates a random Meal from the menu
     * Does this by creating a rand int and going to that position to find meal
     * @return the meal randomly selected
     */
    public Meal findRandomMeal()
    {
        if(listSize > 0){
            Random rand = new Random();
            int randomElement = rand.nextInt(listSize);
            return list[randomElement];
        }

        //   System.out.println("No meals match those Prefrences");
        return null;

    }
    /**
     * Prints each meal in the menu
     * EX. Burger 2.99 McDonalds
     *     Nuggets 1.99 McDonalds
     *     McFlurry 1.00 McDonalds
     */
//    public void printMenu()
//    {
//        for(int i = 0; i<listSize; i++)
//        {
//            list[i].printMealDescription();
//        }
//    }



}
