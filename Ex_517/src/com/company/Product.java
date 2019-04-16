package com.company;

public class Product {
    // Members ----------------------------------------------------------------
    private final int productNumber;
    private final double price;
    private final int quantitySold;
    private final double totalCost;

    // Constructors ------------------------------------------------------------
    public Product(int productNumber, double price, int quantitySold ) {
        this.productNumber = productNumber;
        this.price = price;

        if ( quantitySold < 0 ) {
            this.quantitySold = 0;
        } else {
            this.quantitySold = quantitySold;
        }

        this.totalCost = calcTotalCost();
    }

    // Methods -----------------------------------------------------------------
    private double calcTotalCost() {
        return price * quantitySold;
    }

    // Standard Setters and Getters Methods-------------------------------------
    public double getPrice() {
        return price;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public double getTotalCost() {
        return totalCost;
    }
}
