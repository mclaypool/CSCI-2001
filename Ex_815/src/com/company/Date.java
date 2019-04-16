package com.company;

import java.security.InvalidParameterException;
import java.time.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@SuppressWarnings({"deprecation", "WeakerAccess"})
public class Date extends java.util.Date{
    // Date class found here:
    // https://docs.oracle.com/javase/7/docs/api/java/util/Date.html

    // Constructors ------------------------------------------------------------
    /*
        These types of constructors were deprecated per the Java docs.
        You're Suppose to use parsing functions outside of this class,
        but I wanted to try extending a standard library function
        for this exercise
    */

    public Date( int month, int dayOfMonth, int year ) {
        verifyDayOfMonth( dayOfMonth );
        verifyMonthInt( month );

        this.setMonth( month - 1 );
        this.setDate( dayOfMonth );
        this.setYear( year - 1900 );
    }

    public Date( String month, int dayOfMonth, int year ) {
        verifyDayOfMonth( dayOfMonth );

        this.setMonth( Month.valueOf( month.toUpperCase() ).getValue() - 1 );
        this.setDate( dayOfMonth );
        this.setYear( year - 1900 );
    }

    public Date(int dayOfYear, int year) {
        verifyDayOfYear( dayOfYear );

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_YEAR, dayOfYear);
        cal.set(Calendar.YEAR, year);

        this.setMonth( cal.get(Calendar.MONTH) );
        this.setDate( cal.get(Calendar.DAY_OF_MONTH) );
        this.setYear( cal.get(Calendar.YEAR) - 1900 );
    }

    // Private methods for basic parameter handling ----------------------------
    private void verifyDayOfMonth( int dayOfMonth ) {
        if ( dayOfMonth > 31 || dayOfMonth < 1 )
            throw new InvalidParameterException();
    }

    private void verifyDayOfYear( int dayOfYear ) {
        if ( dayOfYear > 365 || dayOfYear < 1 )
            throw new InvalidParameterException();
    }

    private void verifyMonthInt( int month ) {
        if ( month > 12 || month < 1 )
            throw new InvalidParameterException();
    }

    // Methods -----------------------------------------------------------------
    public String toShortString() {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        return dateFormat.format(this);
    }

    public String toLongString() {
        DateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy");
        return dateFormat.format(this);
    }

    public String toDayYearString() {
        DateFormat dateFormat = new SimpleDateFormat("DDD yyyy");
        return dateFormat.format(this);
    }
}
