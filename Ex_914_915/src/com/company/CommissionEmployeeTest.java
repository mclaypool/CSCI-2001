package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CommissionEmployeeTest {

    @Test
    void earnings() {
        CommissionEmployee employee = new CommissionEmployee(
                "Sue", "Jones", "222-22-2222", 10000, .06 );

        assertEquals( 600, employee.earnings() );
    }

    @Test
    void commissionEmployeeToString() {
        CommissionEmployee employee = new CommissionEmployee(
                "Sue", "Jones", "222-22-2222", 5000, .1 );

        String expected = "commission employee: Sue Jones\n" +
                        "social security number: 222-22-2222\n" +
                        "gross sales: 5000.00\ncommission rate: 0.10";
        assertEquals( expected, employee.toString() );
    }

    @Test
    void getGrossSales() {
        CommissionEmployee employee = new CommissionEmployee(
                "Sue", "Jones", "222-22-2222", 10000, .06 );

        assertEquals( 10000, employee.getGrossSales() );
    }

    @Test
    void setGrossSales() {
        CommissionEmployee employee = new CommissionEmployee(
                "Sue", "Jones", "222-22-2222", 10000, .06 );

        employee.setGrossSales( 5000 );
        assertEquals( 5000, employee.getGrossSales() );
    }

    @Test
    void setGrossSalesNegative() {
        try{
            CommissionEmployee employee = new CommissionEmployee(
                    "Sue", "Jones", "222-22-2222", -1, .06 );
        }
        catch( Exception e ) {
            assertTrue( e instanceof IllegalArgumentException);
            return;
        }
        fail("Exception not thrown");
    }

    @Test
    void getCommissionRate() {
        CommissionEmployee employee = new CommissionEmployee(
                "Sue", "Jones", "222-22-2222", 10000, .06 );

        assertEquals( .06, employee.getCommissionRate() );
    }

    @Test
    void setCommissionRate() {
        CommissionEmployee employee = new CommissionEmployee(
                "Sue", "Jones", "222-22-2222", 10000, .06 );

        employee.setCommissionRate( .01 );
        assertEquals( .01, employee.getCommissionRate() );
    }

    @Test
    void setCommissionRateLow() {
        try{
            CommissionEmployee employee = new CommissionEmployee(
                    "Sue", "Jones", "222-22-2222", 10000, 0 );
        }
        catch( Exception e ) {
            assertTrue( e instanceof IllegalArgumentException);
            return;
        }
        fail("Exception not thrown");
    }

    @Test
    void setCommissionRateHigh() {
        try{
            CommissionEmployee employee = new CommissionEmployee(
                    "Sue", "Jones", "222-22-2222", 10000, 1 );
        }
        catch( Exception e ) {
            assertTrue( e instanceof IllegalArgumentException);
            return;
        }
        fail("Exception not thrown");
    }
}