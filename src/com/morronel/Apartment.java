package com.morronel;

public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter){
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment) {
        if (this.squareMeters > otherApartment.squareMeters) {
            return true;
        }
        else {
            return false;
        }
    }

    public int priceDifference(Apartment otherApartment) {
        int diff = this.pricePerSquareMeter * this.squareMeters - otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        if (diff >= 0) {
            return diff;
        }
        else {
            return diff * -1;
        }
    }

    public boolean moreExpensiveThan(Apartment otherApartment) {
        int diff = this.pricePerSquareMeter * this.squareMeters - otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        if (diff > 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
