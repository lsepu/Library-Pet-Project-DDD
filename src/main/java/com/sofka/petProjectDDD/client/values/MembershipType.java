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

}
