package com.sofka.petProjectDDD.lending.values;

import co.com.sofka.domain.generic.ValueObject;
import com.sofka.petProjectDDD.section.values.Aisle;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class DevolutionDate implements ValueObject<Date> {

    public final Date value;

    public DevolutionDate(Date value) {
        this.value = Objects.requireNonNull(value);
        if(!verifyValidDate(value)){
            throw new IllegalArgumentException("The date cannot be before today");
        }
    }

    public boolean verifyValidDate(Date date){
        Date currentDate = new Date();
        if (date.before(currentDate)){
            return false;
        }
        return true;
    }


    public Date value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DevolutionDate that = (DevolutionDate) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
