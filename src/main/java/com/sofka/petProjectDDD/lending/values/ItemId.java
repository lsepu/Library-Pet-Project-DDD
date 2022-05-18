package com.sofka.petProjectDDD.lending.values;

import co.com.sofka.domain.generic.Identity;

public class ItemId extends Identity {

    public ItemId(){

    }

    private ItemId(String id){
        super(id);
    }

    public static FineId of (String id){
        return new FineId(id);
    }


}
