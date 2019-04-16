package gpa;

public class Gpa {

    public static int qualityPoints( int grade ) {
        if ( grade > 100 || grade < 0) {
            throw new IllegalArgumentException("Class grade is invalid");
        }

        if ( isBetween( grade, 90, 100 ) ) {
            return 4;
        } else if ( isBetween( grade, 80, 89 ) ) {
            return 3;
        } else if ( isBetween( grade, 70, 79 ) ) {
            return 2;
        } else if ( isBetween( grade, 60, 69 ) ) {
            return 1;
        }

        //default response == if ( grade < 60 )
        return 0;
    }

    private static boolean isBetween( int grade, int lower, int upper ) {
        return lower <= grade && grade <= upper;
    }
}
