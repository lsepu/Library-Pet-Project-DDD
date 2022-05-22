package com.sofka.petProjectDDD.section.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Editorial implements ValueObject<String> {

    public final String value;

    public Editorial(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The Editorial cannot be empty");
        }
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Editorial editorial = (Editorial) o;
        return Objects.equals(value, editorial.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
