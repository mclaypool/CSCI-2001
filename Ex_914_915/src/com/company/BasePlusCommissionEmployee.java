package com.company;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary; // base salary per week

    // Constructors ------------------------------------------------------------
    public BasePlusCommissionEmployee(String firstName, String lastName,
                                      String socialSecurityNumber,
                                      double grossSales, double commissionRate,
                                      double baseSalary
    ) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        setBaseSalary( baseSalary );
    }


    // Methods -----------------------------------------------------------------
    @Override
    public double earnings() {
        return baseSalary + super.earnings();
    }

    @Override
    public String toString() {
        String output = super.toString();
        output = output.replaceAll("commission employee:",
                "base-salaried commission employee:");

        return String.format(
                "%s%n%s: %.2f",
                output,
                "base salary", baseSalary
        );
    }

    // Setter and Getters ------------------------------------------------------
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if ( baseSalary < 0.0 ) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;
    }
}
