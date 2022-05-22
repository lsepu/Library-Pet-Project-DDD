package com.sofka.petProjectDDD.lending.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.petProjectDDD.lending.Item;
import com.sofka.petProjectDDD.lending.values.DevolutionDate;
import com.sofka.petProjectDDD.lending.values.LendingDate;
import com.sofka.petProjectDDD.lending.values.LendingId;

import java.util.Set;

public class CreateLending extends Command {

    private final Set<Item> items;
    private final LendingDate lendingDate;
    private final DevolutionDate devolutionDate;

    public CreateLending(Set<Item> items, LendingDate lendingDate, DevolutionDate devolutionDate) {
        this.items = items;
        this.lendingDate = lendingDate;
        this.devolutionDate = devolutionDate;
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
