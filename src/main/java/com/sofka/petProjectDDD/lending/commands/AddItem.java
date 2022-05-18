package com.sofka.petProjectDDD.lending.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.petProjectDDD.lending.values.ItemId;
import com.sofka.petProjectDDD.lending.values.Quantity;
import com.sofka.petProjectDDD.lending.values.Title;

public class AddItem extends Command {

    private final ItemId itemId;
    private final Quantity quantity;
    private final Title title;

    public AddItem(ItemId itemId, Quantity quantity, Title title) {
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
