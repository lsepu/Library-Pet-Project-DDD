package com.sofka.petProjectDDD.section.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.petProjectDDD.section.Book;
import com.sofka.petProjectDDD.section.Librarian;
import com.sofka.petProjectDDD.section.Section;
import com.sofka.petProjectDDD.section.values.*;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class AddSection extends Command {

    private final SectionId sectionId;
    private final SectionName name;
    private final Aisle aisle;
    private final Floor floor;
    private final Librarian librarian;

    public AddSection(SectionId sectionId, SectionName name, Aisle aisle, Floor floor, Librarian librarian) {
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

    public SectionName getName() {
        return name;
    }

    public Aisle getAisle() {
        return aisle;
    }

    public Floor getFloor() {
        return floor;
    }
}
