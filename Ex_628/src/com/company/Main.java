package com.company;

import java.util.Scanner;
import static java.lang.System.out;
import gpa.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        // sentinel loop to get grades from user
        while ( true ) {

            out.print("Please enter the student's class grade: ");

            try {
                final int grade = input.nextInt();
                out.printf( "The GPA for the student is %s%n%n",
                        Gpa.qualityPoints(grade) );
            }
            catch ( IllegalArgumentException e ) {
                out.println( e.getMessage() + '\n' );
            }

            // determine if loop should end
            out.print( "Would you like to enter another student's grade? (y/n) " );
            char breakLoop = input.next().charAt(0);

            if ( breakLoop != 'y' && breakLoop != 'Y' )
            {
                break;
            }
            out.println();
        }// end while
    }
}
