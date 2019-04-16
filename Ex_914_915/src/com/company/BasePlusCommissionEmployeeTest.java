package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BasePlusCommissionEmployeeTest {

    @Test
    void earnings() {
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
                "Bob", "Lewis", "333-33-3333", 5000, .04, 300 );

        assertEquals( 500, employee.earnings() );
    }

    @Test
    void basePlusCommissionEmployeeToString() {
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
                "Bob", "Lewis", "333-33-3333", 5000, .04, 1000 );

        String expected = "base-salaried commission employee: Bob Lewis\n" +
                "social security number: 333-33-3333\n" +
                "gross sales: 5000.00\ncommission rate: 0.04\n" +
                "base salary: 1000.00";
        assertEquals( expected, employee.toString() );
    }

    @Test
    void getBaseSalary() {
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
                "Bob", "Lewis", "333-33-3333", 5000, .04, 300 );

        assertEquals( 300, employee.getBaseSalary() );
    }

    @Test
    void setBaseSalary() {
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
                "Bob", "Lewis", "333-33-3333", 5000, .04, 300 );

        employee.setBaseSalary( 1000 );
        assertEquals( 1000, employee.getBaseSalary() );
    }

    @Test
    void setBaseSalaryNegative() {
        try{
            BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
                    "Bob", "Lewis", "333-33-3333", 5000, .04, -1 );
        }
        catch( Exception e ) {
            assertTrue( e instanceof IllegalArgumentException);
            return;
        }
        fail("Exception not thrown");
    }
}