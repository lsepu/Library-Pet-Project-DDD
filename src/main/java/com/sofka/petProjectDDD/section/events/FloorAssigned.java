package com.sofka.petProjectDDD.section.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.petProjectDDD.section.values.Floor;

public class FloorAssigned extends DomainEvent {

    private final Floor floor;

    public FloorAssigned(Floor floor) {
        super("com.sofka.perProjectDDD.section.floorasigned");
        this.floor = floor;
    }

    public Floor getFloor() {
        return floor;
    }
}
