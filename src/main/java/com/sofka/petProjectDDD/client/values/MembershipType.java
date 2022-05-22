package com.sofka.petProjectDDD.client.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class MembershipType implements ValueObject<MembershipType.MembershipTypes> {

    private final MembershipTypes value;

    public MembershipType(MembershipTypes value){
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public MembershipTypes value(){
        return value;
    }

    public enum MembershipTypes {
        SILVER, GOLD, PLATINUM
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MembershipType that = (MembershipType) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
