package com.sofka.petProjectDDD.lending.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.petProjectDDD.lending.values.FineId;

public class RemoveFine extends Command {

    private final FineId fineId;

    public RemoveFine(FineId fineId) {
        this.fineId = fineId;
    }

    public FineId getFineId() {
        return fineId;
    }
}
