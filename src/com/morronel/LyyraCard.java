package com.morronel;

public class LyyraCard {

    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public void payEconomical() {
        balance -= 2.50;
    }

    public void payGourmet() {
        balance -= 4.00;
    }

    public String toString() {
        return "The card has " + balance + " euros";
    }

}
