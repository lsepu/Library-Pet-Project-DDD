package com.sofka.petProjectDDD.section.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.petProjectDDD.section.values.LibrarianId;

import javax.naming.Name;

public class UpdateLibrarianName extends Command {

    private final LibrarianId librarianid;
    private final Name librarianName;

    public UpdateLibrarianName(LibrarianId librarianid, Name librarianName) {
        this.librarianid = librarianid;
        this.librarianName = librarianName;
    }

    public LibrarianId getLibrarianid() {
        return librarianid;
    }

    public Name getLibrarianName() {
        return librarianName;
    }
}
