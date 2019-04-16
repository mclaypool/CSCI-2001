package com.company;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sales {
    // Members -----------------------------------------------------------------
    public Map<Employee, Map<Product, Integer>> monthlySales;

    // Constructors ------------------------------------------------------------
    public Sales() {
        monthlySales = new HashMap<Employee, Map<Product, Integer>>();
    };

    public Sales( Map<Employee, Map<Product, Integer>> results ) {
        this.monthlySales = results;
    }

    // Methods -----------------------------------------------------------------
    @Override
    public String toString() {
        return null;
    }

    // Standard Setters and Getters Methods-------------------------------------
    public Map<Employee, Map<Product, Integer>> getSales() {
        return monthlySales;
    }

    /* Cumbersome to use
    public void setSales(Map<Employee, Map<Product, Integer>> sales) {
        this.results = sales;
    }*/
}
