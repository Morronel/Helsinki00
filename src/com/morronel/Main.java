package com.morronel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void transfer(Account to, Account from, int howMuch){
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("vezhlivost", "dobrota", "teamwork", "))00))0"));

        Account mattProfile = new Account("MattProfile", 100);
        Account myProfile = new Account("Myprofile", 0);
        Producto banana = new Producto("Banana", 1.1, 13);

        transfer(myProfile, mattProfile, 150);

        System.out.println(mattProfile.balance());
        System.out.println(myProfile.balance());
        banana.printProducto();

        Multiplier multiplier = new Multiplier(2);
        System.out.println(multiplier.multiply(5));

        Menu menu = new Menu(list);
        menu.addMeal("kal");
        menu.printMeals();

        LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);

        cardPekka.payGourmet();
        cardBrian.payEconomical();
        System.out.println("Pekkas " + cardPekka);
        System.out.println("Brians " + cardBrian);
        cardPekka.loadMoney(20);
        cardBrian.payGourmet();
        System.out.println("Pekkas " + cardPekka);
        System.out.println("Brians " + cardBrian);
        cardPekka.payEconomical();
        cardPekka.payEconomical();
        cardBrian.loadMoney(50);
        System.out.println("Pekkas " + cardPekka);
        System.out.println("Brians " + cardBrian);
    }
}
