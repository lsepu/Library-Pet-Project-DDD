package com.sofka.petProjectDDD.section;

import co.com.sofka.domain.generic.Entity;
import com.sofka.petProjectDDD.section.values.LibrarianId;
import com.sofka.petProjectDDD.section.values.Name;

public class Librarian extends Entity<LibrarianId> {

    private Name name;

    public Librarian(LibrarianId entityId, Name name) {
        super(entityId);
        this.name = name;
    }

    public void updateName(Name name){
        this.name = name;
    }

    public Name Name() {
        return name;
    }
}
