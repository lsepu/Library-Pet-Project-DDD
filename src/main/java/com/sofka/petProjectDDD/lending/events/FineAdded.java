package com.sofka.petProjectDDD.lending.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.petProjectDDD.lending.values.Cost;
import com.sofka.petProjectDDD.lending.values.FineId;
import com.sofka.petProjectDDD.lending.values.Reason;

public class FineAdded extends DomainEvent {

    private final FineId fineId;
    private final Reason reason;
    private final Cost cost;

    public FineAdded(FineId fineId, Reason reason, Cost cost) {
        super("com.sofka.petProjectDDD.lending.fineadded");
        this.fineId = fineId;
        this.reason = reason;
        this.cost = cost;
    }

    public FineId getFineId() {
        return fineId;
    }

    public Reason getReason() {
        return reason;
    }

    public Cost getCost() {
        return cost;
    }
}
