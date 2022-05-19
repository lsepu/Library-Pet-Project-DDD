package com.sofka.petProjectDDD.client.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.petProjectDDD.lending.values.LendingId;

public class LendingAddedToClient extends DomainEvent {

    private final LendingId lendingId;

    public LendingAddedToClient(LendingId lendingId) {
        super("com.sofka.petProjectDDD.client.lendingcreated");
        this.lendingId = lendingId;
    }

    public LendingId getLendingId() {
        return lendingId;
    }
}
