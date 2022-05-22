package com.sofka.petProjectDDD.lending.values;

import co.com.sofka.domain.generic.ValueObject;
import com.sofka.petProjectDDD.section.values.Aisle;

import java.util.Objects;

public class Quantity implements ValueObject<Integer> {

    public final Integer value;

    public Quantity(Integer value) {
        this.value = Objects.requireNonNull(value);
        if (this.value < 0) {
            throw new IllegalArgumentException("The quantity cannot be a negative number");
        }
    }

    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity quantity = (Quantity) o;
        return Objects.equals(value, quantity.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
