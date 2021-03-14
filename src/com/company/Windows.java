package com.company;

public class Windows {
    private int amount;

    public Windows(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Windows:" +"amount of rooms=" + amount;
    }
}
