package com.app;

public class Item {
    private String name;
    private Double price;
    private boolean available;
    private int remainder;

    public Item(String name, Double price, int remainder) {
        this.name = name;
        this.price = price;
        this.remainder = remainder;
        this.available = remainder>0;
    }
}
