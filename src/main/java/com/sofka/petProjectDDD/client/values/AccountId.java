package com.sofka.petProjectDDD.client.values;

import co.com.sofka.domain.generic.Identity;
import com.sofka.petProjectDDD.lending.values.LendingId;

public class AccountId extends Identity {

    public AccountId(){

    }

    private AccountId(String id){
        super(id);
    }

    public static AccountId of (String id){
        return new AccountId(id);
    }


}
