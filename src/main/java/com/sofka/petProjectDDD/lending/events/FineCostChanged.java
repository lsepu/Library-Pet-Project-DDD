package com.sofka.petProjectDDD.lending.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.petProjectDDD.lending.values.Cost;
import com.sofka.petProjectDDD.lending.values.FineId;

public class FineCostChanged extends DomainEvent {

    private final FineId fineId;
    private final Cost cost;

    public FineCostChanged(FineId fineId, Cost cost) {
        super("com.sofka.petProjectDDD.lending.finecostchanged");
        this.fineId = fineId;
        this.cost = cost;
    }

    public FineId getFineId() {
        return fineId;
    }

    public Cost getCost() {
        return cost;
    }
}
