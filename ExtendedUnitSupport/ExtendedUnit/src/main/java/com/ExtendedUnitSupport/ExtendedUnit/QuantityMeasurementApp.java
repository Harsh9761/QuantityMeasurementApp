package com.ExtendedUnitSupport.ExtendedUnit;

public class QuantityMeasurementApp {

	public static void main(String[] args) {
		QuantityLength yard = new QuantityLength(1, LengthUnit.YARDS);
        QuantityLength feet = new QuantityLength(3, LengthUnit.FEET);
        QuantityLength inches = new QuantityLength(36, LengthUnit.INCHES);
        QuantityLength cm = new QuantityLength(91.44, LengthUnit.CENTIMETERS);

        System.out.println("1 Yard == 3 Feet - " + yard.equals(feet));
        System.out.println("1 Yard == 36 Inches - " + yard.equals(inches));
        System.out.println("91.44 cm == 1 Yard - " + cm.equals(yard));

	}

}
