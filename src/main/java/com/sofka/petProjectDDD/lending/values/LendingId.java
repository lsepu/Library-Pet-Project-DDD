package com.sofka.petProjectDDD.lending.values;

import co.com.sofka.domain.generic.Identity;

public class LendingId extends Identity {

    public LendingId(){

    }

    private LendingId(String id){
        super(id);
    }

    public static LendingId of (String id){
        return new LendingId(id);
    }


}
