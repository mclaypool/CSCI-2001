package com.company;

import java.security.InvalidParameterException;


public class Rectangle {
    // Members -----------------------------------------------------------------
    private float length;
    private float width;

    // Constructors ------------------------------------------------------------
    public Rectangle(){
        this.length = 1;
        this.width = 1;
    }

    public Rectangle(float length, float width) {
        setLength( length );
        setWidth( width );
    }

    // Methods -----------------------------------------------------------------
    private boolean verify_float(float input) {
        if (input > 0 && input < 20) {
            return true;
        }
        return false;
    }

    public float calc_parimeter() {
        return 2 * ( length + width );
    }

    public float calc_area() {
        return length * width;
    }

    // Standard Setters and Getters Methods-------------------------------------
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        if ( !verify_float(length) ) {
            throw new InvalidParameterException(
                    "Input float must be between 0 and 20"
            );
        }
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        if ( !verify_float(width) ) {
            throw new InvalidParameterException(
                    "Input float must be between 0 and 20"
            );
        }
        this.width = width;
    }
}
