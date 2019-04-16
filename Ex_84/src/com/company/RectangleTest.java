package com.company;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @org.junit.jupiter.api.Test
    void defaultLength() {
        Rectangle rec = new Rectangle();
        assertEquals( 1, rec.getLength() );
    }

    @org.junit.jupiter.api.Test
    void defaultWidth() {
        Rectangle rec = new Rectangle();
        assertEquals( 1, rec.getWidth() );
    }

    @org.junit.jupiter.api.Test
    void setLengthValid() {
        Rectangle rec = new Rectangle();
        rec.setLength( 10 );
        assertEquals( 10, rec.getLength() );
    }

    @org.junit.jupiter.api.Test
    void setLengthHighError() {
        Rectangle rec = new Rectangle();
        try{
            rec.setLength( 20 );
        }
        catch( Exception e ) {
            assertTrue( e instanceof InvalidParameterException);
            return;
        }
        fail("Exception not thrown");
    }

    @org.junit.jupiter.api.Test
    void setLengthLowError() {
        Rectangle rec = new Rectangle();
        try{
            rec.setLength( 0 );
        }
        catch( Exception e ) {
            assertTrue( e instanceof InvalidParameterException);
            return;
        }
        fail("Exception not thrown");
    }

    @org.junit.jupiter.api.Test
    void setWidthValid() {
        Rectangle rec = new Rectangle();
        rec.setWidth( 10 );
        assertEquals( 10, rec.getWidth() );
    }

    @org.junit.jupiter.api.Test
    void setWidthHighError() {
        Rectangle rec = new Rectangle();
        try{
            rec.setWidth( 20 );
        }
        catch( Exception e ) {
            assertTrue( e instanceof InvalidParameterException);
            return;
        }
        fail("Exception not thrown");
    }

    @org.junit.jupiter.api.Test
    void setWidthLowError() {
        Rectangle rec = new Rectangle();
        try{
            rec.setWidth( 0 );
        }
        catch( Exception e ) {
            assertTrue( e instanceof InvalidParameterException);
            return;
        }
        fail("Exception not thrown");
    }

    @org.junit.jupiter.api.Test
    void constructorError() {
        try{
            Rectangle rec = new Rectangle( 20, 0 );
        }
        catch( Exception e ) {
            assertTrue( e instanceof InvalidParameterException);
            return;
        }
        fail("Exception not thrown");
    }

    @org.junit.jupiter.api.Test
    void calc_parimeter() {
        Rectangle rec = new Rectangle();
        rec.setWidth( 5 );
        rec.setLength( 10 );
        assertEquals( 30, rec.calc_parimeter() );
    }

    @org.junit.jupiter.api.Test
    void calc_area() {
        Rectangle rec = new Rectangle();
        rec.setWidth( 5 );
        rec.setLength( 10 );
        assertEquals( 50, rec.calc_area() );
    }
}