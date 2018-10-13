package com.morronel;

public class Account {

    private     String name;
    private     int balance;

    public Account(String initialName, int initBalance){
        this.name = initialName;
        this.balance = initBalance;
    }

    public String name() {
        return name;
    }

    public int balance() {
        return balance;
    }

    public int deposit(int num){
        this.balance += num;
        return this.balance;
    }

    public int withdrawal(int num){
        this.balance -= num;
        return this.balance;
    }
}
