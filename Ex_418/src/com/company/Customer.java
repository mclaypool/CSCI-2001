package com.company;

public class Customer {

    // Memebers ----------------------------------------------------------------

    private int accountNumber;
    private int monthStartBalance;
    private int monthlyCredit;
    private int monthlyCharges;
    private int creditLimit;
    private String exceedLimitMsg = "Credit limit exceeded!";

    // Constructors ------------------------------------------------------------

    public Customer(){ }

    public Customer(int accountNumber, int monthStartBalance,
                    int monthlyCredit, int monthlyCharges, int creditLimit) {

        this.accountNumber = accountNumber;
        this.monthStartBalance = monthStartBalance;
        this.monthlyCredit = monthlyCredit;
        this.monthlyCharges = monthlyCharges;
        this.creditLimit = creditLimit;
    }

    // Methods -----------------------------------------------------------------

    public int newBalance(){
        return monthStartBalance + monthlyCharges - monthlyCredit;
    }

    // Setters and Getters -----------------------------------------------------

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getMonthStartBalance() {
        return monthStartBalance;
    }

    public void setMonthStartBalance(int monthStartBalance) {
        this.monthStartBalance = monthStartBalance;
    }

    public int getMonthlyCredit() {
        return monthlyCredit;
    }

    public void setMonthlyCredit(int monthlyCredit) {
        this.monthlyCredit = monthlyCredit;
    }

    public int getMonthlyCharges() {
        return monthlyCharges;
    }

    public void setMonthlyCharges(int monthlyCharges) {
        this.monthlyCharges = monthlyCharges;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getExceedLimitMsg() {
        return exceedLimitMsg;
    }
}
