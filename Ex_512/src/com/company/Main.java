package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 15;

        System.out.println( "Iterative: " + iterativeProduct( n ) );

        // recursive (for fun)
        System.out.println( "Recursive: " + recursiveProduct( n ) );
    }

    public static int iterativeProduct( int n ) {
        if ( n % 2 == 0 ) throw new Error("input must be an odd number");

        int output = 1;

        for ( int i = 1; i <= n; i+=2 ) {
            output = output * i;
        }

        return output;
    }

    public static int recursiveProduct( int n ){
        if ( n % 2 == 0 ) throw new Error("input must be an odd number");

        if ( n <= 0 ) {
            return 1;
        }

        return n * recursiveProduct(n-2);
    }
}
