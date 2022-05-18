package com.sofka.petProjectDDD.lending.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.petProjectDDD.lending.values.DevolutionDate;

public class DevolutionDateChanged extends DomainEvent {

    private final DevolutionDate devolutionDate;

    public DevolutionDateChanged(DevolutionDate devolutionDate) {
        super("com.sofka.petProjectDDD.events");
        this.devolutionDate = devolutionDate;
    }

    public DevolutionDate getDevolutionDate() {
        return devolutionDate;
    }
}
