package com.sofka.petProjectDDD.section.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumberOfPages implements ValueObject<String> {

    public final String value;

    public NumberOfPages(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The book title cannot be empty");
        }
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumberOfPages that = (NumberOfPages) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
