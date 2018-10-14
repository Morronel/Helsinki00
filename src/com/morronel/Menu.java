package com.morronel;

import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu(ArrayList<String> list) {
        this.meals = list;
    }

    public void addMeal(String meal){
        Menu.this.meals.add(meal);
    }

    public void printMeals(){
        System.out.println(meals);
    }
}
