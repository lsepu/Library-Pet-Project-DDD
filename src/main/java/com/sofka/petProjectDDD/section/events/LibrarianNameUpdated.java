package com.sofka.petProjectDDD.section.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.petProjectDDD.section.values.LibrarianId;
import com.sofka.petProjectDDD.section.values.Name;

public class LibrarianNameUpdated extends DomainEvent {

    private final LibrarianId librarianId;
    private final Name name;

    public LibrarianNameUpdated(LibrarianId librarianId, Name name) {
        super("com.sofka.perProjectDDD.section.librariannameupdated");
        this.librarianId = librarianId;
        this.name = name;
    }

    public LibrarianId getLibrarianId() {
        return librarianId;
    }

    public Name getName() {
        return name;
    }
}
