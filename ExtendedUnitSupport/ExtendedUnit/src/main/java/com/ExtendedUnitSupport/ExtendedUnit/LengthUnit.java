package com.ExtendedUnitSupport.ExtendedUnit;

public enum LengthUnit {

    FEET(12.0),               // 1 foot = 12 inches
    INCHES(1.0),              // base unit
    YARDS(36.0),              // 1 yard = 3 feet = 36 inches
    CENTIMETERS(0.393701);    // 1 cm = 0.393701 inches

    private final double toInchesFactor;

    LengthUnit(double toInchesFactor) {
        this.toInchesFactor = toInchesFactor;
    }

    public double toInches(double value) {
        return value * toInchesFactor;
    }
}
