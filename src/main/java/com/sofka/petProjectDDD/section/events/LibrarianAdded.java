package com.sofka.petProjectDDD.section.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.petProjectDDD.section.values.LibrarianId;
import com.sofka.petProjectDDD.section.values.Name;

public class LibrarianAdded extends DomainEvent {

    private final LibrarianId librarianId;
    private final Name name;

    public LibrarianAdded(LibrarianId librarianId, Name name) {
        super("com.sofka.perProjectDDD.events");
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
