package com.sofka.petProjectDDD.section.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.petProjectDDD.section.values.Aisle;
import com.sofka.petProjectDDD.section.values.Floor;
import com.sofka.petProjectDDD.section.values.Name;
import com.sofka.petProjectDDD.section.values.SectionId;

public class AddSection extends Command {

    private final SectionId sectionId;
    private final Name name;
    private final Aisle aisle;
    private final Floor floor;

    public AddSection(SectionId sectionId, Name name, Aisle aisle, Floor floor) {
        this.sectionId = sectionId;
        this.name = name;
        this.aisle = aisle;
        this.floor = floor;
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
