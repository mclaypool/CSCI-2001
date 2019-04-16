package com.company;

import static org.junit.jupiter.api.Assertions.*;

public class InvoiceTest {
    // Test getInvoiceAmount works
    @org.junit.jupiter.api.Test
    void testInvoiceAmount() {
        Invoice invoice = new Invoice( "", "", 10, 105.07 );
        //double amount = Math.round( invoice.getInvoiceAmount() );
        assertEquals( 1050.6999999999998, invoice.getInvoiceAmount() );
    }

    // test getInvoiceAmount amount with negative quantity
    @org.junit.jupiter.api.Test
    void testNegativeQuantity() {
        Invoice invoice = new Invoice( "", "", -10, 105.99 );
        assertEquals( 0, invoice.getInvoiceAmount() );
    }

    // test constructor with negative price
    @org.junit.jupiter.api.Test
    void testPositivePrice() {
        Invoice invoice = new Invoice( "", "", 0, 0 );
        invoice.setPricePerItem(200);
        assertEquals( 200, invoice.getPricePerItem() );
    }

    // test getPricePerItem with negative
    @org.junit.jupiter.api.Test
    void testSetPricePerItem() {
        Invoice invoice = new Invoice( "", "", 0, 0 );
        invoice.setPricePerItem(-100);
        assertEquals( 0.0, invoice.getPricePerItem() );
    }

    // test setters and getters
    @org.junit.jupiter.api.Test
    void testPartNumber() {
        Invoice invoice = new Invoice( "", "", 0, 0 );
        invoice.setPartNumber( "E10" );
        assertEquals( "E10", invoice.getPartNumber() );
    }

    // test setters and getters
    @org.junit.jupiter.api.Test
    void testPartDescription() {
        Invoice invoice = new Invoice( "", "", 0, 0 );
        invoice.setPartDescription( "Motor" );
        assertEquals( "Motor", invoice.getPartDescription() );
    }

    // test setters and getters
    @org.junit.jupiter.api.Test
    void testQuantity() {
        Invoice invoice = new Invoice( "", "", 0, 0 );
        invoice.setQuantity( 10 );
        assertEquals( 10, invoice.getQuantity() );
    }
}
