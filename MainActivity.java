package com.gth.protolsueats;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Creates all my instances that I want to be able to call from other methods.
     * This mainly includes all my preferences classes and default menus.
     */
    MealPreferences Burger = new BurgerPref();
    MealPreferences Chinese = new ChinesePref();
    MealPreferences Italian = new ItalianPref();
    MealPreferences Mexican = new MexicanPref();
    RestaurantPreferences OffCamp = new OffCampusPref();
    RestaurantPreferences OnCamp = new OnCampusPref();
    MealPreferences Salad = new SaladPref();
    MealPreferences Sandwich = new SandwichPref();
    MealPreferences UnderTen = new UnderTenPref();
    RestaurantList resList = new RestaurantList();
    Menu burgerMenu = new Menu();
    Menu italianMenu = new Menu();
    Menu chineseMenu = new Menu();
    Menu sandwichMenu = new Menu();
    Menu saladMenu = new Menu();
    Menu mexicanMenu = new Menu();
    Menu priceMenu = new Menu();
    boolean under10Dollars = false;
    RestaurantList offCampRes = new RestaurantList();
    RestaurantList onCampRes = new RestaurantList();

    /**
     * the onCreate method begins once the app is opened.  It creates all the restaurants and
     * meals on the menu of the resturants and saves them all to the restaurant list resList.
     * It also activates a switch that when switched on, changes the underTen preferences to true
     * so later the meals can be sorted accordingly
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Restaurant melMus = new Restaurant("Burbank","Mellow Mushroom", false);
        resList.insert(melMus);
        resList.getRes(0).getMenu().insert(new Meal("Pepperoni Pizza", resList.getRes(0), 10.00, "Italian"));
        resList.getRes(0).getMenu().insert(new Meal("Funky Chick Pizza", resList.getRes(0), 17.00, "Italian"));
        resList.getRes(0).getMenu().insert(new Meal("MeatBall Hoagie", resList.getRes(0), 7.00, "Sandwich"));
        resList.getRes(0).getMenu().insert(new Meal("Sausage Hoagie", resList.getRes(0), 7.00, "Sandwich"));


        resList.insert(new Restaurant("Union", "Panda", true));
        resList.getRes(1).getMenu().insert(new Meal("Orange Chicken", resList.getRes(1), 6.00, "Chinese"));
        resList.getRes(1).getMenu().insert(new Meal("Sweet Fire Chicken", resList.getRes(1), 6.00, "Chinese"));
        resList.getRes(1).getMenu().insert(new Meal("Coconut Shrimp", resList.getRes(1), 6.00, "Chinese"));
        resList.getRes(1).getMenu().insert(new Meal("String Bean Chicken", resList.getRes(1), 6.00, "Chinese"));
        resList.getRes(1).getMenu().insert(new Meal("Kung Poa Chicken", resList.getRes(1), 6.00, "Chinese"));
        resList.getRes(1).getMenu().insert(new Meal("Beijing Beef", resList.getRes(1), 6.00, "Chinese"));

        resList.insert(new Restaurant("Burbank", "Fuzzys", false));
        resList.getRes(2).getMenu().insert(new Meal("Pork Tacos", resList.getRes(2), 2.00, "Mexican"));
        resList.getRes(2).getMenu().insert(new Meal("Steak Tacos", resList.getRes(2), 2.00, "Mexican"));
        resList.getRes(2).getMenu().insert(new Meal("Chicken Tacos", resList.getRes(2), 2.00, "Mexican"));
        resList.getRes(2).getMenu().insert(new Meal("Quesdilla", resList.getRes(2), 7.00, "Mexican"));
        resList.getRes(2).getMenu().insert(new Meal("Burrito", resList.getRes(2), 5.00, "Mexican"));

        resList.insert(new Restaurant("Union", "Chick-fil-a", true));
        resList.getRes(3).getMenu().insert(new Meal("Fried Chicken Sandwich", resList.getRes(3), 5.00, "Sandwich"));
        resList.getRes(3).getMenu().insert(new Meal("Grilled Chicken Sandwich", resList.getRes(3), 5.00, "Sandwich"));

        resList.insert(new Restaurant("Union", "Chick-n-Grill", true));
        resList.getRes(4).getMenu().insert(new Meal("Build a Burrito", resList.getRes(4), 7.00, "Mexican"));
        resList.getRes(4).getMenu().insert(new Meal("Burrito in a Bowl", resList.getRes(4), 7.00, "Mexican"));
        resList.getRes(4).getMenu().insert(new Meal("Taco Salad", resList.getRes(4), 6.00, "Salad"));

        resList.insert(new Restaurant("Union", "French Quarter Cafe", true));
        resList.getRes(5).getMenu().insert(new Meal("Meatball Marinara", resList.getRes(5), 7.00, "Sandwich"));
        resList.getRes(5).getMenu().insert(new Meal("Canal Street Club", resList.getRes(5), 7.00, "Sandwich"));
        resList.getRes(5).getMenu().insert(new Meal("Big Easy Caprese", resList.getRes(5), 7.00, "Sandwich"));

        resList.insert(new Restaurant("Union", "OntheGeaux", true));
        resList.getRes(6).getMenu().insert(new Meal("Build a Salad", resList.getRes(6), 5.00, "Salad"));
        resList.getRes(6).getMenu().insert(new Meal("Chicken Caesar", resList.getRes(6), 5.00, "Salad"));

        resList.insert(new Restaurant("Union", "McDonalds", true));
        resList.getRes(7).getMenu().insert(new Meal("Big Mac", resList.getRes(7), 4.00, "Burger"));
        resList.getRes(7).getMenu().insert(new Meal("2 Cheeseburgers", resList.getRes(7), 4.00, "Burger"));
        resList.getRes(7).getMenu().insert(new Meal("Chicken McWrap", resList.getRes(7), 5.00, "Sandwich"));

        resList.insert(new Restaurant("Foster Hall", "SubWay", true));
        resList.getRes(8).getMenu().insert(new Meal("Black Forest Ham", resList.getRes(8), 5.00, "Sandwich"));
        resList.getRes(8).getMenu().insert(new Meal("Italian BMT", resList.getRes(8), 6.00, "Sandwich"));
        resList.getRes(8).getMenu().insert(new Meal("Steak and Cheese", resList.getRes(8), 7.00, "Sandwich"));

        resList.insert(new Restaurant("Burbank", "Nine Dragon", false));
        resList.getRes(9).getMenu().insert(new Meal("Amazing Chicken", resList.getRes(9), 7.00, "Chinese"));
        resList.getRes(9).getMenu().insert(new Meal("Singapore Chicken", resList.getRes(9), 7.00, "Chinese"));
        resList.getRes(9).getMenu().insert(new Meal("Seasame Chicken", resList.getRes(9), 7.00, "Chinese"));

        resList.insert(new Restaurant("Burbank", "Sonic", false));
        resList.getRes(10).getMenu().insert(new Meal("Sonic Burger", resList.getRes(10), 4.00, "Burger"));
        resList.getRes(10).getMenu().insert(new Meal("Bacon Cheeseburger Toaster", resList.getRes(10), 5.00, "Burger"));
        resList.getRes(10).getMenu().insert(new Meal("Breakfast Toaster", resList.getRes(10), 4.00, "Sandwich"));

        resList.insert(new Restaurant("Burbank", "Not Your Moms", false));
        resList.getRes(11).getMenu().insert(new Meal("Pizza Burger", resList.getRes(11), 8.00, "Burger"));
        resList.getRes(11).getMenu().insert(new Meal("Mushroom Swiss", resList.getRes(11), 8.00, "Burger"));
        resList.getRes(11).getMenu().insert(new Meal("SurfnTurf Burger", resList.getRes(11), 8.00, "Burger"));

        resList.insert(new Restaurant("Highland", "5 Guys", false));
        resList.getRes(12).getMenu().insert(new Meal("CheeseBurger", resList.getRes(12), 6.00, "Burger"));
        resList.getRes(12).getMenu().insert(new Meal("Bacon Burger", resList.getRes(12), 6.00, "Burger"));

        resList.insert(new Restaurant("Highland", "Fat Cow", false));
        resList.getRes(13).getMenu().insert(new Meal("Delta Burger", resList.getRes(13), 9.00, "Burger"));
        resList.getRes(13).getMenu().insert(new Meal("Who Dat Burger", resList.getRes(13), 16.00, "Burger"));
        resList.getRes(13).getMenu().insert(new Meal("Fuji Apple", resList.getRes(13), 8.00, "Salad"));

        resList.insert(new Restaurant("Highland", "Buffalo Wild Wings", false));
        resList.getRes(14).getMenu().insert(new Meal("Big Jack Burger", resList.getRes(14), 9.00, "Burger"));
        resList.getRes(14).getMenu().insert(new Meal("SouthWest Philly", resList.getRes(14), 9.00, "Sandwich"));
        resList.getRes(14).getMenu().insert(new Meal("Screamin Nacho Burger", resList.getRes(14), 8.00, "Burger"));

        resList.insert(new Restaurant("Chimes", "PoBoy Times", false));
        resList.getRes(15).getMenu().insert(new Meal("Chicken Philly", resList.getRes(15), 6.00, "Sandwich"));
        resList.getRes(15).getMenu().insert(new Meal("Supreme Poboy", resList.getRes(15), 6.00, "Sandwich"));
        resList.getRes(15).getMenu().insert(new Meal("Fried Shrimp Poboy", resList.getRes(15), 7.00, "Sandwich"));

        resList.insert(new Restaurant("Chimes", "Geauld Tigers", false));
        resList.getRes(16).getMenu().insert(new Meal("Black Pepper Chicken", resList.getRes(16), 8.00, "Chinese"));
        resList.getRes(16).getMenu().insert(new Meal("General Tso Chicken", resList.getRes(16), 8.00, "Chinese"));
        resList.getRes(16).getMenu().insert(new Meal("Sweet and Sour Chicken", resList.getRes(16), 8.00, "Chinese"));

        resList.insert(new Restaurant("Chimes", "Newks", false));
        resList.getRes(17).getMenu().insert(new Meal("Newks Q", resList.getRes(17), 7.00, "Sandwich"));
        resList.getRes(17).getMenu().insert(new Meal("Cobb Salad", resList.getRes(17), 7.00, "Salad"));
        resList.getRes(17).getMenu().insert(new Meal("Southern Salad", resList.getRes(17), 8.00, "Salad"));

        resList.insert(new Restaurant("Highland", "Chimes", false));
        resList.getRes(18).getMenu().insert(new Meal("Fried Crawfish Salad", resList.getRes(18), 13.00, "Salad"));
        resList.getRes(18).getMenu().insert(new Meal("Seafood Lasagna", resList.getRes(18), 17.00, "Italian"));
        resList.getRes(18).getMenu().insert(new Meal("Pasta Alfredo", resList.getRes(18), 12.00, "Italian"));

        resList.insert(new Restaurant("Highland", "Pita Pit", false));
        resList.getRes(19).getMenu().insert(new Meal("DagWood", resList.getRes(19), 7.00, "Sandwich"));
        resList.getRes(19).getMenu().insert(new Meal("Philly Steak Pita", resList.getRes(19), 6.00, "Sandwich"));
        resList.getRes(19).getMenu().insert(new Meal("Club Pita", resList.getRes(19), 7.00, "Sandwich"));

        resList.insert(new Restaurant("Burbank", "Brecks Bistro", false));
        resList.getRes(20).getMenu().insert(new Meal("Brown Sugar BLTC", resList.getRes(20), 9.00, "Sandwich"));
        resList.getRes(20).getMenu().insert(new Meal("Chicken Marsala", resList.getRes(20), 13.00, "Italian"));
        resList.getRes(20).getMenu().insert(new Meal("Cajun Carbonara Pasta", resList.getRes(20), 14.00, "Italian"));


        Switch swit = (Switch)findViewById(R.id.switchPrice);
        assert swit != null;
        swit.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                under10Dollars = isChecked;
            }
        });



    }




    /**
     * When a checkbox is clicked, it goes through each checkbox, and makes a menu out of the ones
     * checked.  If one that was checked, becomes unchecked then it changes the old menu to a new menu
     * in order to empty the contents.
     * @param view the view of the checkbox clicked
     */
    public void onCheckboxClicked(View view){
        boolean checked = ((CheckBox)view).isChecked();
        switch(view.getId()){
            case R.id.checkBurger:
                if(checked){
                    burgerMenu = Burger.matchResPreferences(resList);
                }
                else
                    burgerMenu = new Menu();
                break;
            case R.id.checkItalian:
                if(checked){
                    italianMenu = Italian.matchResPreferences(resList);
                }
                else
                    italianMenu = new Menu();
                break;
            case R.id.checkMexican:
                if(checked){
                    mexicanMenu = Mexican.matchResPreferences(resList);
                }
                else
                    mexicanMenu = new Menu();
                break;
            case R.id.checkSandwich:
                if(checked){
                    sandwichMenu = Sandwich.matchResPreferences(resList);
                }
                else
                    sandwichMenu = new Menu();
                break;
            case R.id.checkSalad:
                if(checked){
                    saladMenu = Salad.matchResPreferences(resList);
                }
                else
                    saladMenu = new Menu();
                break;
            case R.id.checkChinese:
                if(checked){
                    chineseMenu = Chinese.matchResPreferences(resList);
                }
                else
                    mexicanMenu = new Menu();
                break;
            case R.id.checkOffCamp:
                if(checked) {
                    offCampRes = OffCamp.matchPreferences(resList);
                }
                else {
                    offCampRes = new RestaurantList();
                }
                    break;

            case R.id.checkOnCamp:
                if(checked)
                    onCampRes = OnCamp.matchPreferences(resList);
                else
                {
                    onCampRes = new RestaurantList();
                }
                break;
                }


        }

    /**
     * This method is called once the Generate Meal button is clicked.  This method creates
     * a restaurant list that combines onCampRes and offCampRes(these will be empty of their respective
     * checkboxes are not set) and then converts that list into a Menu with all of those meals of the
     * restaurants on it.  It then creates an additional menu that has all the food types that have
     * been checked on it.  It then creates a final menu, and elements are added to the final menu if
     * they appear on both the typeMenu and the retMenu. Once you have the final menu, you check
     * if the under10 boolean is on, if it is, you filter out meals over $10 to have your final list.
     * Next, it generates a random meal from the finalMenu, checks to make sure the meal is not null,
     * then returns that meal.  If it is null, it prints error message "NO meal found with these
     * preferences".
     * @param view the view of the button clicked
     */
    public void getMeal(View view)
    {
        RestaurantList retList = new RestaurantList();
        Menu typeMenu;
        TextView t = (TextView) findViewById(R.id.textMeal);
        retList = retList.combineResList(onCampRes, offCampRes);
        Menu retMenu = retList.listToMenu();
        typeMenu = chineseMenu.add(saladMenu).add(mexicanMenu).add(sandwichMenu).add(italianMenu).add(burgerMenu);
        int size = typeMenu.getSize();
        Menu finalMenu=new Menu();
        if(size<retMenu.getSize())
        {
            size = retMenu.getSize();
            for(int i = 0; i<size;i++)
            {
                if(typeMenu.contains(retMenu.getMeal(i)))
                {
                    finalMenu.insert(retMenu.getMeal(i));
                }

            }
        }
        else
        {
            for(int i = 0; i<size;i++)
            {
                if(retMenu.contains(typeMenu.getMeal(i)))
                {
                    finalMenu.insert(typeMenu.getMeal(i));
                }

            }

        }


        if(under10Dollars)
        {
            finalMenu = UnderTen.matchPreferences(typeMenu);
        }
        else{
            finalMenu = typeMenu;
        }
        Meal finalMeal = finalMenu.findRandomMeal();
        if (finalMeal == null)
        {
            assert t != null;
            t.setText("No meal found with these Preferences");

        }
        else {
            String mealDes = finalMeal.MealDescription();
            t.setText(mealDes);
        }



    }







}
