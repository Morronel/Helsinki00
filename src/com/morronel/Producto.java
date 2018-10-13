package com.morronel;

public class Producto {

    String name;
    double price;
    int amount;

    public Producto(String nameAtStart, double priceAtStart, int amountAtStart){
        name = nameAtStart;
        price = priceAtStart;
        amount = amountAtStart;
    }

    public void printProducto(){
        System.out.println(getName() + ", price " + getPrice() + ", amount " + getAmount());
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }
}
