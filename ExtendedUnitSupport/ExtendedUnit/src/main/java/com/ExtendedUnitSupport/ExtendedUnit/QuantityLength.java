package com.ExtendedUnitSupport.ExtendedUnit;

public class QuantityLength {
	private final double value;
    private final LengthUnit unit;

    public QuantityLength(double value, LengthUnit unit) {
        if (Double.isNaN(value)) {
            throw new IllegalArgumentException("Invalid numeric value");
        }
        if (unit == null) {
            throw new IllegalArgumentException("Unit cannot be null");
        }

        this.value = value;
        this.unit = unit;
    }

    private double convertToInches() {
        return unit.toInches(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof QuantityLength)) return false;

        QuantityLength other = (QuantityLength) obj;

        return Double.compare(
                this.convertToInches(),
                other.convertToInches()) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(convertToInches());
    }
}
