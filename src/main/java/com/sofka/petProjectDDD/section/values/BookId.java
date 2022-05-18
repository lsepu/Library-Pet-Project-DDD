package com.sofka.petProjectDDD.section.values;

import co.com.sofka.domain.generic.Identity;

public class BookId extends Identity {

    public BookId(){

    }

    private BookId(String id){
        super(id);
    }

    public static BookId of (String id){
        return new BookId(id);
    }

}
