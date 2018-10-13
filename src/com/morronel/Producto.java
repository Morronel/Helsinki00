package com.morronel;

public class Producto {

    private String name;
    private double price;
    private int amount;

    public Producto(String nameAtStart, double priceAtStart, int amountAtStart){
        name = nameAtStart;
        price = priceAtStart;
        amount = amountAtStart;
    }

    public void printProducto(){
        System.out.println(name + ", price " + price + ", amount " + amount);
    }
}
