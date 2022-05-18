package com.sofka.petProjectDDD.lending.values;

import co.com.sofka.domain.generic.Identity;
import com.sofka.petProjectDDD.section.values.SectionId;

public class FineId extends Identity {

    public FineId(){

    }

    private FineId(String id){
        super(id);
    }

    public static FineId of (String id){
        return new FineId(id);
    }




}
