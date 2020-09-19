package com.app;

public class User {
    private String name;
    private String email;
    private int age;
    private Cart cart;

    public User(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.cart = new Cart();
    }
}
