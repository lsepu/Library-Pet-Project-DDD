package com.sofka.petProjectDDD.section.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.petProjectDDD.section.Librarian;
import com.sofka.petProjectDDD.section.values.Aisle;
import com.sofka.petProjectDDD.section.values.Floor;
import com.sofka.petProjectDDD.section.values.Name;
import com.sofka.petProjectDDD.section.values.SectionName;

public class SectionAdded extends DomainEvent{

    private final SectionName name;
    private final Aisle aisle;
    private final Floor floor;
    private final Librarian librarian;

    public SectionAdded( SectionName name, Aisle aisle, Floor floor, Librarian librarian) {
        super("com.sofka.perProjectDDD.section.sectionadded");
        this.name = name;
        this.aisle = aisle;
        this.floor = floor;
        this.librarian = librarian;
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

    public Librarian getLibrarian() {
        return librarian;
    }
}
