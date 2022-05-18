package com.sofka.petProjectDDD.lending.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.petProjectDDD.lending.values.Cost;
import com.sofka.petProjectDDD.lending.values.FineId;

public class ChangeFineCost extends Command {

    private final FineId fineId;
    private final Cost cost;

    public ChangeFineCost(FineId fineId, Cost cost) {
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
