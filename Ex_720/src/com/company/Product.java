package com.company;

public class Product {
    // Members -----------------------------------------------------------------
    private int id;
    private String name;

    // Constructors ------------------------------------------------------------
    public Product() { };

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Methods -----------------------------------------------------------------
    @Override
    public String toString() {
        // Convert product to JSON
        return String.format(
                "{id=%s, name='%s'}", id, name
        );
    }

    // Standard Setters and Getters Methods-------------------------------------
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
