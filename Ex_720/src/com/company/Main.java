package com.company;

import java.util.*;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        final int maxProducts = 5;
        final int maxEmployees = 4;

        Scanner input = new Scanner( System.in );

        // loop 1 to 5 and add products ----------------------------------------
        List<String> products = new ArrayList<String>();

        out.println("Please enter the product names:");

        for ( int i = 1; i < maxProducts+1; i++ ) {
            out.printf( "Product %s's name: ", i );
            products.add( input.next() );
        }

        // nested loop to build multidimensional map ---------------------------
        out.println("\nPlease enter the employees and their product sales");

        // declare storage vars
        List<String> employees = new ArrayList<String>();
        int[][] sales = new int[4][5];
        int[] productTotals = new int[maxProducts];
        int[] employeeTotals = new int[maxEmployees];

        for ( int i = 1; i < maxEmployees+1; i++ ) {
            // get the employee's name
            out.printf( "%nEmployee %s's name: ", i );
            String employee = input.next();
            employees.add( employee );

            // get last months sales and calc total
            for ( int j = 0; j < maxProducts; j++ ){
                out.printf(
                    "Please enter the quantity of %s that %s sold last month: ",
                     products.get(j), employee
                );

                Integer quantity = input.nextInt();
                sales[i-1][j] = quantity;

                employeeTotals[i-1] = employeeTotals[i-1] + quantity;
                productTotals[j] = productTotals[j] + quantity;
            }
        }

        // print multidimensional array as table in console --------------------
        out.printf("%n%10s", "");
        for ( String employee: employees ) {
            out.printf("%10s", employee );
        }

        for ( int i = 0; i < maxProducts; i++ ) {
            out.printf( "%n%10s", products.get(i));

            for ( int j = 0; j < maxEmployees; j++ ) {
                out.printf("%10s", sales[j][i] );
            }

            out.printf("%10s", productTotals[i]);
        }

        out.printf("%n%10s", "");
        for ( int i = 0; i < maxEmployees; i++){
            out.printf("%10s", employeeTotals[i] );
        }

    }//end main
}//end class
