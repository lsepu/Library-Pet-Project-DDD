package com.sofka.petProjectDDD.lending.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.petProjectDDD.lending.values.ItemId;

public class ItemRemoved extends DomainEvent {

    private final ItemId itemId;

    public ItemRemoved(ItemId itemId) {
        super("com.sofka.petProjectDDD.lending.itemremoved");
        this.itemId = itemId;
    }

    public ItemId getItemId() {
        return itemId;
    }
}
