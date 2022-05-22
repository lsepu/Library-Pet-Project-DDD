package com.sofka.petProjectDDD.lending.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.petProjectDDD.lending.values.ItemId;
import com.sofka.petProjectDDD.lending.values.LendingId;
import com.sofka.petProjectDDD.lending.values.Quantity;
import com.sofka.petProjectDDD.lending.values.Title;

public class AddItem extends Command {

    private final LendingId lendingId;
    private final ItemId itemId;
    private final Quantity quantity;
    private final Title title;

    public AddItem(LendingId lendingId, ItemId itemId, Quantity quantity, Title title) {
        this.lendingId = lendingId;
        this.itemId = itemId;
        this.quantity = quantity;
        this.title = title;
    }

    public LendingId getLendingId() {
        return lendingId;
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
