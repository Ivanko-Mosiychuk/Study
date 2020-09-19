package com.app;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> listOfItems;

    public Cart() {
        this.listOfItems = new ArrayList<>();
    }

    public List<Item> getListOfItems() {
        return listOfItems;
    }
}
