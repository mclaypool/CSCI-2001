package com.company;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        ArrayList<Product> productsSold = getInputs();
        displayOutput( productsSold );
    }


    private static ArrayList<Product> getInputs(){
        Scanner input = new Scanner( System.in );

        ArrayList<Product> productsSold = new ArrayList();
        final int[] productNumbers = new int[]{ 1, 2, 3, 4, 5 };

        // sentinel loop to get transactions from user
        while ( true ) {

            out.printf( "Please enter the product sold: %s%n",
                    Arrays.toString(productNumbers) );

            final int productChoice = input.nextInt();

            // determine if the entered value is a product
            if ( Contains( productNumbers, productChoice ) ) {

                out.println( "Please enter the quantity sold" );
                final int quantity = input.nextInt();

                addProductDetails( productsSold, productChoice, quantity );

            } else {
                out.println( "Product not found" );
            }

            // determine if loop should end
            out.println( "Would you like to enter another transaction? (y/n)" );
            String breakLoop = input.next();
            if ( breakLoop.toLowerCase().equals("n")
                 || breakLoop.toLowerCase().equals("no") )
            {
                break;
            }
        }// end while

        return productsSold;
    }


    private static boolean Contains( final int[] array, final int key ) {
        return Arrays.stream( array ).anyMatch( i -> i == key );
    }


    private static void addProductDetails(
            ArrayList<Product> productsSold,
            int productChoice,
            int quantity ) {

        switch (productChoice) {
            case 1:
                productsSold.add( new Product( 1, 2.98, quantity ) );
                break;
            case 2:
                productsSold.add( new Product( 2, 4.50, quantity  ) );
                break;
            case 3:
                productsSold.add( new Product( 3, 9.98, quantity  ) );
                break;
            case 4:
                productsSold.add( new Product( 4, 4.49, quantity  ) );
                break;
            case 5:
                productsSold.add( new Product( 5, 6.87, quantity  ) );
                break;
        }// end switch
    }


    private static void displayOutput( ArrayList<Product> productsSold ) {
        double totalSold = 0;

        if ( productsSold.size() > 0 ) {
            out.println("\nCompleted transactions:");

            for (Product product : productsSold) {
                out.printf("Product %d, Quantity %d, Total %f%n",
                        product.getProductNumber(),
                        product.getQuantitySold(),
                        product.getTotalCost()
                );

                totalSold += product.getTotalCost();

            }// end for loop
        }

        out.printf( "%nTotal value of products sold: %f%n", totalSold );
    }
}// end class main
