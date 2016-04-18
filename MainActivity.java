package com.gth.protolsueats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
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
    Restaurant melMus = new Restaurant("Burbank","Mellow Mushroom", false);
    resList.insert(melMus);
    resList.getRes(0).getMenu().insert(new Meal("Pep", resList.getRes(0), 10.00, "Italian"));
    resList.getRes(0).getMenu().insert(new Meal("Funky Chick", resList.getRes(0), 17.00, "Italian"));
    resList.getRes(0).getMenu().insert(new Meal("Hoagie", resList.getRes(0), 7.00, "Sandwich"));


    resList.insert(new Restaurant("Union", "Panda", true));
    resList.getRes(1).getMenu().insert(new Meal("Orange Chicken", resList.getRes(1), 8.00, "Chinese"));
    resList.getRes(1).getMenu().insert(new Meal("Sweet Fire Chick", resList.getRes(1), 7.00, "Chinese"));
    resList.getRes(1).getMenu().insert(new Meal("Shrimp", resList.getRes(1), 6.89, "Chinese"));
    resList.insert(new Restaurant("Burbank", "Fuzzys", false));
    resList.getRes(2).getMenu().insert(new Meal("Tacos", resList.getRes(2), 2.00, "Mexican"));
    resList.getRes(2).getMenu().insert(new Meal("Quesdilla", resList.getRes(2), 7.00, "Mexican"));
    resList.getRes(2).getMenu().insert(new Meal("Enchilda", resList.getRes(2), 5.00, "Mexican"));

    Menu priceMenu = new Menu();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Switch switch1 = (Switch) findViewById(R.id.switchPrice);
        switch1.setOnCheckedChangedListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
                if(isChecked)
                {
                    priceMenu = UnderTen.matchResPreferences(resList);
                }
                else{
                    priceMenu = null;
                }
            }
        });
    }


    Menu burgerMenu = new Menu();
    Menu italianMenu = new Menu();
    Menu chineseMenu = new Menu();
    Menu sandwichMenu = new Menu();
    Menu saladMenu = new Menu();
    Menu mexicanMenu = new Menu();
    RestaurantList offCampRes = new RestaurantList();
    RestaurantList onCampRes = new RestaurantList();

    /**
     * When a checkbox is clicked, it goes through each checkbox, and makes a menu out of the ones
     * checked.  If one that was checked, becomes unchecked then it changes the old menu to a null one
     * in order to empty it.
     * @param view
     */
    public void onCheckboxClicked(View view){
        boolean checked = ((CheckBox)view).isChecked();
        switch(view.getId()){
            case R.id.checkBurger:
                if(checked){
                    burgerMenu = Burger.matchResPreferences(resList);
                }
                else
                    burgerMenu = null;
                break;
            case R.id.checkItalian:
                if(checked){
                    italianMenu = Italian.matchResPreferences(resList);
                }
                else
                    italianMenu = null;
                break;
            case R.id.checkMexican:
                if(checked){
                    mexicanMenu = Mexican.matchResPreferences(resList);
                }
                else
                    mexicanMenu = null;
                break;
            case R.id.checkSandwich:
                if(checked){
                    sandwichMenu = Sandwich.matchResPreferences(resList);
                }
                else
                    sandwichMenu = null;
                break;
            case R.id.checkSalad:
                if(checked){
                    saladMenu = Salad.matchResPreferences(resList);
                }
                else
                    saladMenu = null;
                break;
            case R.id.checkChinese:
                if(checked){
                    chineseMenu = Chinese.matchResPreferences(resList);
                }
                else
                    mexicanMenu = null;
                break;
            case R.id.checkOffCamp:
                if(checked) {
                    offCampRes = OffCamp.matchPreferences(resList);
                }
                    break;

            case R.id.checkOnCamp:
                if(checked)
                    onCampRes = OnCamp.matchPreferences(resList);
                break;
                }

        }
    RestaurantList retList = new RestaurantList();
    Menu typeMenu = new Menu();
    public void getMeal(View view)
    {
        Textview t = (Textview) findViewById(R.id.textMeal);
        retList = AndResPref.matchPreferences(onCampRes, offCampRes);
        typeMenu = mexicanMenu.add(italianMenu).add(saladMenu).add(sandwichMenu).add(burgerMenu).add(chineseMenu);




    }







}
