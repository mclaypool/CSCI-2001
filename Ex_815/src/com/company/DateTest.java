package com.company;

import org.opentest4j.AssertionFailedError;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @org.junit.jupiter.api.Test
    void toShortString() {
        Date date = new Date( 11, 16, 2018 );
        assertEquals( "11/16/2018", date.toShortString() );
    }

    @org.junit.jupiter.api.Test
    void toLongString() {
        Date date = new Date( 11, 16, 2018 );
        assertEquals( "November 16, 2018", date.toLongString() );
    }

    @org.junit.jupiter.api.Test
    void toDayYearString() {
        Date date = new Date( 11, 16, 2018 );
        assertEquals( "320 2018", date.toDayYearString() );
    }

    @org.junit.jupiter.api.Test
    void allIntsConstructor() {
        Date date = new Date( 11, 16, 2018 );
        assertEquals( "11/16/2018", date.toShortString() );
    }

    @org.junit.jupiter.api.Test
    void monthStringConstructor() {
        Date date = new Date( "November", 16, 2018 );
        assertEquals( "11/16/2018", date.toShortString() );
    }

    @org.junit.jupiter.api.Test
    void dayOfYearConstructor() {
        Date date = new Date( 320, 2018 );
        assertEquals( "11/16/2018", date.toShortString() );
    }

    @org.junit.jupiter.api.Test
    void badMonthInt() {
        try{
            new Date( 13, 16, 2018 );
        }
        catch( Exception e ) {
            assertTrue( e instanceof InvalidParameterException);
            return;
        }
        fail("Exception not thrown");
    }

    @org.junit.jupiter.api.Test
    void badDayofMonth() {
        try{
            new Date( 11, 43, 2018 );
        }
        catch( Exception e ) {
            assertTrue( e instanceof InvalidParameterException);
            return;
        }
        fail("Exception not thrown");
    }

    @org.junit.jupiter.api.Test
    void badMonthString() {
        try{
            new Date( "Junes", 16, 2018 );
        }
        catch( Exception e ) {
            assertTrue( e instanceof IllegalArgumentException);
            return;
        }
        fail("Exception not thrown");
    }

    @org.junit.jupiter.api.Test
    void badDayOfYear() {
        try{
            new Date( 366, 2018 );
        }
        catch( Exception e ) {
            assertTrue( e instanceof InvalidParameterException);
            return;
        }
        fail("Exception not thrown");
    }
}