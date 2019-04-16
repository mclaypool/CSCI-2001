package com.company;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @org.junit.jupiter.api.Test
    void testFirstName() {
        Employee test = new Employee();
        test.setFirstName("Max");
        assertEquals( "Max", test.getFirstName() );
    }

    @org.junit.jupiter.api.Test
    void testLastName() {
        Employee test = new Employee();
        test.setLastName( "Claypool" );
        assertEquals( "Claypool", test.getLastName() );
    }

    @org.junit.jupiter.api.Test
    void testMonthlySalary() {
        Employee test = new Employee();
        test.setMonthlySalary( 1000.0 );
        assertEquals( 1000.0, test.getMonthlySalary() );
    }

    @org.junit.jupiter.api.Test
    void testYearlySalary() {
        Employee test = new Employee("", "", 1000);
        assertEquals( 12000.0, test.getYearlySalary() );
    }

    @org.junit.jupiter.api.Test
    void testNegativeSalary() {
        Employee test = new Employee();

        try {
            test.setMonthlySalary( -1000.0 );
            test.getMonthlySalary();
            assertTrue( false );
        }
        catch (IllegalArgumentException e) {
            assertTrue( true );
        }
    }

    @org.junit.jupiter.api.Test
    void giveRaise() {
        Employee test = new Employee( "Max", "Claypool", 1000 );
        test.giveRaise( 0.1 );
        assertEquals( 1100.0, test.getMonthlySalary() );
    }
}