package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // get inputs
        Scanner input = new Scanner( System.in );

        System.out.print( "Enter an integer: " );
        int number1 = input.nextInt();

        if ( number1 % 2 == 0 ) {
            System.out.println( "Even" );
        } else {
            System.out.println( "Odd" );
        }
    }
}
