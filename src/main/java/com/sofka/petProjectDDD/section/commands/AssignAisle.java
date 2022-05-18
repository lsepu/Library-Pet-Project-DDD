package com.sofka.petProjectDDD.section.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.petProjectDDD.section.values.Aisle;

public class AssignAisle extends Command {

    private final Aisle aisle;

    public Aisle getAisle() {
        return aisle;
    }

    public AssignAisle(Aisle aisle) {
        this.aisle = aisle;
    }
}
