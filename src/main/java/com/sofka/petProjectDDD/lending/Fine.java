package com.sofka.petProjectDDD.lending;

import co.com.sofka.domain.generic.Entity;
import com.sofka.petProjectDDD.lending.values.Cost;
import com.sofka.petProjectDDD.lending.values.FineId;
import com.sofka.petProjectDDD.lending.values.Reason;

public class Fine extends Entity<FineId> {
    private Reason reason;
    private Cost cost;

    public Fine(FineId entityId, Reason reason, Cost cost) {
        super(entityId);
        this.reason = reason;
        this.cost = cost;
    }

    public void changeCost(Cost cost){
        this.cost = cost;
    }

    public Reason Reason() {
        return reason;
    }

    public Cost Cost() {
        return cost;
    }
}
