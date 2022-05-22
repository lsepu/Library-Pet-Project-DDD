package com.sofka.petProjectDDD.lending.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.petProjectDDD.lending.Item;
import com.sofka.petProjectDDD.lending.values.DevolutionDate;
import com.sofka.petProjectDDD.lending.values.LendingDate;
import com.sofka.petProjectDDD.lending.values.LendingId;

import java.util.Set;

public class LendingCreated extends DomainEvent {

    private final Set<Item> items;
    private final LendingDate lendingDate;
    private final DevolutionDate devolutionDate;

    public LendingCreated(Set<Item> items, DevolutionDate devolutionDate, LendingDate lendingDate) {
        super("com.sofka.petProjectDDD.lending.lendingadded");
        this.items = items;
        this.devolutionDate = devolutionDate;
        this.lendingDate = lendingDate;
    }


    public Set<Item> getItems() {
        return items;
    }

    public DevolutionDate getDevolutionDate() {
        return devolutionDate;
    }

    public LendingDate getLendingDate() {
        return lendingDate;
    }
}
