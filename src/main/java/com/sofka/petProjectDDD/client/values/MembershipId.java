package com.sofka.petProjectDDD.client.values;

import co.com.sofka.domain.generic.Identity;

public class MembershipId extends Identity {

    public MembershipId(){

    }

    private MembershipId(String id){
        super(id);
    }

    public static MembershipId of (String id){
        return new MembershipId(id);
    }


}
