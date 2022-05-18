package com.sofka.petProjectDDD.lending.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.petProjectDDD.lending.values.Cost;
import com.sofka.petProjectDDD.lending.values.FineId;
import com.sofka.petProjectDDD.lending.values.Reason;

public class AddFine extends Command {

    private final FineId fineId;
    private final Reason reason;
    private final Cost cost;

    public AddFine(FineId fineId, Reason reason, Cost cost) {
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
