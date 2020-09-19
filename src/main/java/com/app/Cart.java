package com.app;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> listOfItems;

    public Cart() {
        this.listOfItems = new ArrayList<>();
    }

    private List<Item> getListOfItems() {
        return listOfItems;
    }

    public void addItemToCart(Item item){
        this.getListOfItems().add(item);
    }

    public void deleteItemFromCart(Item item){
        this.getListOfItems().remove(item);
    }
}
