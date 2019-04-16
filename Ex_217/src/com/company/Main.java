package com.company;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        // get inputs
        Scanner input = new Scanner( System.in );

        System.out.print( "Enter first integer: " );
        int number1 = input.nextInt();

        System.out.print( "Enter second integer: " );
        int number2 = input.nextInt();

        System.out.print( "Enter third integer: " );
        int number3 = input.nextInt();

        int ints[] = { number1, number2, number3 };

        // calculate avg
        double double_avg = IntStream.of(ints).average().getAsDouble();
        int average = (int) Math.round( double_avg );

        // print sum, average, product, smallest, largest
        System.out.printf( "Sum: %d%n", IntStream.of(ints).sum() );
        System.out.printf( "Average: %d%n", average );
        System.out.printf( "Product: %d%n", (number1 * number2 * number3) );
        System.out.printf( "Min: %d%n", IntStream.of(ints).min().getAsInt() );
        System.out.printf( "Max: %d%n", IntStream.of(ints).max().getAsInt() );
    }
}
