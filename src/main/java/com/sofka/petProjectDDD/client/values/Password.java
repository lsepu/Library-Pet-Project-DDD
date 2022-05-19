package com.sofka.petProjectDDD.client.values;

import co.com.sofka.domain.generic.ValueObject;
import com.sofka.petProjectDDD.section.values.Aisle;

import java.util.Objects;

public class Password implements ValueObject<String> {

    public final String value;

    public Password(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The Password cannot be empty");
        }
        if(this.value.length() < 7){
            throw new IllegalArgumentException("The Password length can't be less than 7");
        }
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aisle aisle = (Aisle) o;
        return Objects.equals(value, aisle.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

}
