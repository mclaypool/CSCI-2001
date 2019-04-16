package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner( System.in );
        Customer customer = new Customer();

        // setAccountNumber
        System.out.println("Please input the account number");
        customer.setAccountNumber( input.nextInt() );

        // setCreditLimit
        System.out.println("Please input the starting credit limit");
        customer.setCreditLimit( input.nextInt() );

        // setMonthStartBalance
        System.out.println("Please input the starting monthly balance");
        customer.setMonthStartBalance( input.nextInt() );

        // setMonthlyCharges
        System.out.println("Please input the total monthly charges");
        customer.setMonthlyCharges( input.nextInt() );

        // setMonthlyCredit
        System.out.println("Please input the total applied credit for the month");
        customer.setMonthlyCredit( input.nextInt() );

        // display new balance
        System.out.println( "You're new balance is: " + customer.newBalance() );

        if ( customer.newBalance() > customer.getCreditLimit() ) {
            System.out.println( customer.getExceedLimitMsg() );
        }
    }
}
