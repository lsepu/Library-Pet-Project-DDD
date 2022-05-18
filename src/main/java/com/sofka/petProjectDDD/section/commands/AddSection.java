package com.sofka.petProjectDDD.section.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.petProjectDDD.section.Book;
import com.sofka.petProjectDDD.section.Librarian;
import com.sofka.petProjectDDD.section.values.Aisle;
import com.sofka.petProjectDDD.section.values.Floor;
import com.sofka.petProjectDDD.section.values.Name;
import com.sofka.petProjectDDD.section.values.SectionId;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class AddSection extends Command {

    private final SectionId sectionId;
    private final Name name;
    private final Aisle aisle;
    private final Floor floor;
    private final Librarian librarian;

    public AddSection(SectionId sectionId, Name name, Aisle aisle, Floor floor, Librarian librarian) {
        this.sectionId = sectionId;
        this.name = name;
        this.aisle = aisle;
        this.floor = floor;
        this.librarian = librarian;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public SectionId getSectionId() {
        return sectionId;
    }

    public Name getName() {
        return name;
    }

    public Aisle getAisle() {
        return aisle;
    }

    public Floor getFloor() {
        return floor;
    }
}
