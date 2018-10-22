package com.morronel;

public class CashRegister {
    private double cashInRegister;   // the amount of cash in the register
    private int economicalSold;      // the amount of economical lunches sold
    private int gourmetSold;         // the amount of gourmet lunches sold

    public CashRegister() {
        cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        double price = 2.50;
        if (cashGiven >= price) {
            cashInRegister += price;
            economicalSold++;
            return cashGiven - price;
        }
        else {
            return cashGiven;
        }
    }

    public double payGourmet(double cashGiven) {
        double price = 4;
        if (cashGiven >= price) {
            cashInRegister += price;
            gourmetSold++;
            return cashGiven - price;
        }
        else {
            return cashGiven;
        }
    }

    public boolean payEconomical(LyyraCard card) {
        double price = 2.50;
        if (card.pay(price)) {
            economicalSold++;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean payGourmet(LyyraCard card) {
        double price = 4;
        if (card.pay(price)) {
            gourmetSold++;
            return true;
        }
        else {
            return false;
        }
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            cashInRegister += sum;
            card.loadMoney(sum);
        }
        else {
            System.out.println("ERROR");
        }
    }

    public String toString() {
        return "money in register "+cashInRegister+" economical lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
    }
}
