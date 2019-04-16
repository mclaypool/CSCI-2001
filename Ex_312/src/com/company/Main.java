package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner( System.in );
        Invoice invoice = new Invoice("", "", 0, 0000);

        // add item
        System.out.println("Please input a product number");
        invoice.setPartNumber( input.nextLine() );

        // add desctiption
        System.out.println("Please input a product description");
        invoice.setPartDescription( input.nextLine() );

        // add price
        System.out.println("Please input a price");
        invoice.setPricePerItem( input.nextDouble() );

        // add quantity
        System.out.println("Please input a quantity");
        invoice.setQuantity( input.nextInt() );

        // display result
        System.out.println("\nYou are placing an order for the following:");
        System.out.printf("Part Number: %s\n",      invoice.getPartNumber());
        System.out.printf("Part Description: %s\n", invoice.getPartDescription());
        System.out.printf("Price Per Part: %s\n",   invoice.getPricePerItem());
        System.out.printf("Quantity: %s\n",         invoice.getQuantity());
        System.out.printf("Invoice Total: %s\n" ,   invoice.getInvoiceAmount());
    }
}
