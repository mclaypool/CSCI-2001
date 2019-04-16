package com.company;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @org.junit.jupiter.api.Test
    void test40Hours() {
        Employee test = new Employee( "Max", "Claypool", 40, 15 );
        assertEquals( 600, test.calcGrossWeeklyPay() );
    }

    @org.junit.jupiter.api.Test
    void testUnder40Hours() {
        Employee test = new Employee( "Max", "Claypool", 39, 15 );
        assertEquals( 585, test.calcGrossWeeklyPay() );
    }

    @org.junit.jupiter.api.Test
    void testOvertime() {
        Employee test = new Employee( "Max", "Claypool", 50, 15 );
        assertEquals( 825, test.calcGrossWeeklyPay() );
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Employee test = new Employee( "Max", "Claypool", 40, 15 );
        String expected = "{firstName='Max', lastName='Claypool', " +
                "hoursWorked=40.0, regularHours=40.0, Overtime=0.0, " +
                "hourlyRate=15.0, overtimeRate=22.5, " +
                "grossWeeklyPay=600.0}";

        assertEquals( expected, test.toString() );
    }
}