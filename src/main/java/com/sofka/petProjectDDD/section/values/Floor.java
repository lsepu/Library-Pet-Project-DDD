package com.sofka.petProjectDDD.section.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Floor implements ValueObject<Integer> {

    public final Integer value;

    public Floor(Integer value) {
        this.value = Objects.requireNonNull(value);
        if(this.value < 0){
            throw new IllegalArgumentException("The floor cannot be a negative number");
        }
    }

    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Floor floor = (Floor) o;
        return Objects.equals(value, floor.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
