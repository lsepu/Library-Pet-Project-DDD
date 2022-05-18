package com.sofka.petProjectDDD.section.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.petProjectDDD.section.values.LibrarianId;

import javax.naming.Name;

public class AddLibrarian extends Command {

    private final LibrarianId librarianId;
    private final Name name;

    public AddLibrarian(LibrarianId librarianId, Name name) {
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
