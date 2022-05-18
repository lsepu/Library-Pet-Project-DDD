package com.sofka.petProjectDDD.section.values;

import co.com.sofka.domain.generic.Identity;

public class LibrarianId extends Identity {

    public LibrarianId(){

    }

    private LibrarianId(String id){
        super(id);
    }

    public static LibrarianId of (String id){
        return new LibrarianId(id);
    }


}
