package com.company;

public class CommissionEmployee extends Employee{

    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage

    // Constructors ------------------------------------------------------------
    public CommissionEmployee(String firstName, String lastName,
                              String socialSecurityNumber,
                              double grossSales, double commissionRate
    ) {
        super(firstName, lastName, socialSecurityNumber);
        setGrossSales( grossSales );
        setCommissionRate( commissionRate );
    }

    // Methods -----------------------------------------------------------------
    public double earnings() {
        return commissionRate * grossSales;
    }

    @Override
    public String toString() {
        String output = super.toString();
        output = output.replaceAll("employee:", "commission employee:");

        return String.format(
                "%s%n%s: %.2f%n%s: %.2f",
                output,
                "gross sales", grossSales,
                "commission rate", commissionRate
        );
    }

    // Setter and Getters ------------------------------------------------------
    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if ( grossSales < 0.0 ) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }

        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if ( commissionRate <= 0.0 || commissionRate >= 1.0 ) {
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0 and < 1.0");
        }

        this.commissionRate = commissionRate;
    }
}
