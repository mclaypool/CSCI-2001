package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HourlyEmployeeTest {

    @Test
    void earnings() {
        HourlyEmployee employee = new HourlyEmployee(
                "Sue", "Jones", "222-22-2222", 20, 40 );

        assertEquals( 800, employee.earnings() );
    }

    @Test
    void hourlyToString() {
        HourlyEmployee employee = new HourlyEmployee(
                "Sue", "Jones", "222-22-2222", 20, 40 );

        String expected = "hourly employee: Sue Jones\n" +
                "social security number: 222-22-2222\n" +
                "hourly wage: 20.00\nhours worked: 40.00";
        assertEquals( expected, employee.toString() );
    }

    @Test
    void getWage() {
        HourlyEmployee employee = new HourlyEmployee(
                "Sue", "Jones", "222-22-2222", 20, 40 );

        assertEquals( 20, employee.getWage() );
    }

    @Test
    void setWage() {
        HourlyEmployee employee = new HourlyEmployee(
                "Sue", "Jones", "222-22-2222", 20, 40 );

        employee.setWage(30);
        assertEquals( 30, employee.getWage() );
    }

    @Test
    void setWageNegative() {
        try{
            HourlyEmployee employee = new HourlyEmployee(
                    "Sue", "Jones", "222-22-2222", -1, 40 );
        }
        catch( Exception e ) {
            assertTrue( e instanceof IllegalArgumentException);
            return;
        }
        fail("Exception not thrown");
    }

    @Test
    void getHours() {
        HourlyEmployee employee = new HourlyEmployee(
                "Sue", "Jones", "222-22-2222", 20, 40 );

        assertEquals( 40, employee.getHours() );
    }

    @Test
    void setHours() {
        HourlyEmployee employee = new HourlyEmployee(
                "Sue", "Jones", "222-22-2222", 20, 40 );

        employee.setHours(60);
        assertEquals( 60, employee.getHours());
    }

    @Test
    void setHoursNegative() {
        try{
            HourlyEmployee employee = new HourlyEmployee(
                    "Sue", "Jones", "222-22-2222", 20, -1 );
        }
        catch( Exception e ) {
            assertTrue( e instanceof IllegalArgumentException);
            return;
        }
        fail("Exception not thrown");
    }

    @Test
    void setHoursHigh() {
        try{
            HourlyEmployee employee = new HourlyEmployee(
                    "Sue", "Jones", "222-22-2222", 20, 169 );
        }
        catch( Exception e ) {
            assertTrue( e instanceof IllegalArgumentException);
            return;
        }
        fail("Exception not thrown");
    }
}