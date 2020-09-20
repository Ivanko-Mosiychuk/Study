package com.app;

public enum UserRole {
    ADMIN("admin"),
    SELLER("seller"),
    BUYER("buyer");

    private String name;

    UserRole(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
