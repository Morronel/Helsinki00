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

    public String toString() {
        return "money in register "+cashInRegister+" economical lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
    }
}
