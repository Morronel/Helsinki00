package com.morronel;

public class LyyraCard {

    private double balance;

    public LyyraCard(double balanceAtStart) {
        balance = balanceAtStart;
    }

    public boolean pay(double amount){
        if (balance - amount >= 0) {
            this.balance -= amount;
            return true;
        }
        else {
            return false;
        }
    }

    public double balance() {
        return this.balance;
    }

    public void loadMoney(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public String toString() {
        return  " card has " + balance + " euros";
    }

}
