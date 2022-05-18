package com.sofka.petProjectDDD.lending.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.petProjectDDD.lending.Fine;
import com.sofka.petProjectDDD.lending.Item;
import com.sofka.petProjectDDD.lending.values.DevolutionDate;
import com.sofka.petProjectDDD.lending.values.LendingDate;
import com.sofka.petProjectDDD.lending.values.LendingId;

import java.util.Set;

public class AddLending extends Command {

    private final LendingId lendingId;
    private final Set<Item> items;
    private final LendingDate lendingDate;
    private final DevolutionDate devolutionDate;

    public AddLending(LendingId lendingId, Set<Item> items, LendingDate lendingDate, DevolutionDate devolutionDate) {
        this.lendingId = lendingId;
        this.items = items;
        this.lendingDate = lendingDate;
        this.devolutionDate = devolutionDate;
    }

    public LendingId getLendingId() {
        return lendingId;
    }

    public Set<Item> getItems() {
        return items;
    }

    public LendingDate getLendingDate() {
        return lendingDate;
    }

    public DevolutionDate getDevolutionDate() {
        return devolutionDate;
    }
}
