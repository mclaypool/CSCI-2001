package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void employeeToString() {
        Employee employee = new Employee( "Sue", "Jones", "222-22-2222" );
        String expected = "employee: Sue Jones\nsocial security number: 222-22-2222";
        assertEquals( expected, employee.toString() );
    }

    @Test
    void getFirstName() {
        Employee employee = new Employee( "Sue", "Jones", "222-22-2222" );
        assertEquals( "Sue", employee.getFirstName() );
    }

    @Test
    void getLastName() {
        Employee employee = new Employee( "Sue", "Jones", "222-22-2222" );
        assertEquals( "Jones", employee.getLastName() );
    }

    @Test
    void getSocialSecurityNumber() {
        Employee employee = new Employee( "Sue", "Jones", "222-22-2222" );
        assertEquals( "222-22-2222", employee.getSocialSecurityNumber() );

    }
}