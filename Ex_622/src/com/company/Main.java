package com.company;

import java.util.Scanner;
import static java.lang.System.out;
import temperatures.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        out.println( "Are you converting to Celsius or to Fahrenheit?" );
        out.println( "Enter c for Celsius and f for Fahrenheit" );
        char inputType = input.next().charAt(0);

        String inputTempType;
        String outputTempType;

        if ( inputType == 'c' || inputType == 'C' ){
            inputTempType = TempChoices.Fahrenheit.name();
            outputTempType = TempChoices.Celsius.name();

        } else if ( inputType == 'f' || inputType == 'F' ) {
            inputTempType = TempChoices.Celsius.name();
            outputTempType = TempChoices.Fahrenheit.name();

        } else {
            out.println( "You entered an incorrect temp choice" );
            return;
        }

        out.printf( "%nPlease enter the temperature in %s%n", inputTempType );
        double temp = input.nextDouble();

        if ( outputTempType.equals( TempChoices.Celsius.name() ) ){
            temp = Temperature.toCelsius( temp );
        } else {
            temp = Temperature.toFahrenheit( temp );
        }

        out.printf( "%nYour temp in %s is %f%n", outputTempType, temp );
    }
}
