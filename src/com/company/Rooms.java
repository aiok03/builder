package com.company;

public class Rooms {
    private int amount;

    public Rooms(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Rooms:" +"amount of rooms=" + amount;
    }
}
