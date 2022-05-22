package com.sofka.petProjectDDD.lending.values;

import co.com.sofka.domain.generic.ValueObject;
import com.sofka.petProjectDDD.section.values.Aisle;

import java.util.Objects;

public class Cost implements ValueObject<Double> {

    public final Double value;

    public Cost(Double value) {
        this.value = Objects.requireNonNull(value);
        if (this.value < 0) {
            throw new IllegalArgumentException("The fine cost cannot be a negative number");
        }
    }

    public Double value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cost cost = (Cost) o;
        return Objects.equals(value, cost.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
