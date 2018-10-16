package com.morronel;

public class LyyraCard {

    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }



    public String toString() {
        return "The card has " + balance + " euros";
    }

}
