package com.sofka.petProjectDDD.client.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.petProjectDDD.lending.values.LendingId;

public class AddLendingToClient extends Command {

    private final LendingId lendingId;

    public AddLendingToClient(LendingId lendingId) {
        this.lendingId = lendingId;
    }

    public LendingId getLendingId() {
        return lendingId;
    }
}
