package com.morronel;

public class LyyraCard {

    private double balance;
    private String name;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
        this.name = name;
    }

    public void payEconomical() {
        if (balance - 2.50 >= 0) {
            balance -= 2.50;
        }
    }

    public void payGourmet() {
        if (balance - 4.00 >= 0) {
            balance -= 4.00;
        }
    }

    public void loadMoney(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public String toString() {
        return this.name + " has " + balance + " euros";
    }

}
