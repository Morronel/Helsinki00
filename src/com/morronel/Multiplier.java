package com.morronel;

public class Multiplier {
    int number;

    public Multiplier(int newNumber){
        this.number = newNumber;
    }

    public int multiply(int otherNumber){
        return (number * otherNumber);
    }
}
