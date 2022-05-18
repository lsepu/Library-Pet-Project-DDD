package com.sofka.petProjectDDD.lending.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.petProjectDDD.lending.values.ItemId;
import com.sofka.petProjectDDD.lending.values.Quantity;

public class UpdateItemQuantity extends Command {

    private final ItemId itemId;
    private final Quantity quantity;

    public UpdateItemQuantity(ItemId itemId, Quantity quantity) {
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
