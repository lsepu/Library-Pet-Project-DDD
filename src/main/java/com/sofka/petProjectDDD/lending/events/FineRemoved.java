package com.sofka.petProjectDDD.lending.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.petProjectDDD.lending.values.FineId;

public class FineRemoved extends DomainEvent {

    private final FineId fineId;

    public FineRemoved(FineId fineId) {
        super("com.sofka.petProjectDDD.events");
        this.fineId = fineId;
    }

    public FineId getFineId() {
        return fineId;
    }
}
