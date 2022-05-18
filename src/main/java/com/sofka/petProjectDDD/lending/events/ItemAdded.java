package com.sofka.petProjectDDD.lending.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.petProjectDDD.lending.values.ItemId;
import com.sofka.petProjectDDD.lending.values.Quantity;
import com.sofka.petProjectDDD.lending.values.Title;

public class ItemAdded extends DomainEvent {

    private final ItemId itemId;
    private final Quantity quantity;
    private final Title title;

    public ItemAdded(ItemId itemId, Quantity quantity, Title title) {
        super("com.sofka.petProjectDDD.events");
        this.itemId = itemId;
        this.quantity = quantity;
        this.title = title;
    }

    public ItemId getItemId() {
        return itemId;
    }

    public Quantity getQuantity() {
        return quantity;
    }

    public Title getTitle() {
        return title;
    }
}
