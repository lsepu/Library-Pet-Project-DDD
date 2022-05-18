package com.sofka.petProjectDDD.lending.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.petProjectDDD.lending.values.ItemId;
import com.sofka.petProjectDDD.lending.values.Quantity;

public class ItemQuantityUpdated extends DomainEvent {

    private final ItemId itemId;
    private final Quantity quantity;

    public ItemQuantityUpdated(ItemId itemId, Quantity quantity) {
        super("com.sofka.petProjectDDD.events");
        this.itemId = itemId;
        this.quantity = quantity;
    }

    public ItemId getItemId() {
        return itemId;
    }

    public Quantity getQuantity() {
        return quantity;
    }
}
