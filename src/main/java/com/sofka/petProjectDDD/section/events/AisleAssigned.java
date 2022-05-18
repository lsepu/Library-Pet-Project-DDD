package com.sofka.petProjectDDD.section.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.petProjectDDD.section.values.Aisle;

public class AisleAssigned extends DomainEvent {

    private final Aisle aisle;

    public AisleAssigned(Aisle aisle) {
        super("com.sofka.petProjectDDD.events");
        this.aisle = aisle;
    }

    public Aisle getAisle() {
        return aisle;
    }
}
