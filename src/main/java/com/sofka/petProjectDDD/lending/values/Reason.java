package com.sofka.petProjectDDD.lending.values;

import co.com.sofka.domain.generic.ValueObject;
import com.sofka.petProjectDDD.section.values.Aisle;

import java.util.Objects;

public class Reason implements ValueObject<String> {

    public final String value;

    public Reason(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The fine reason cannot be empty");
        }
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reason reason = (Reason) o;
        return Objects.equals(value, reason.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
