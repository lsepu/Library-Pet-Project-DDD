package com.sofka.petProjectDDD.lending.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.petProjectDDD.lending.values.ItemId;

public class RemoveItem extends Command {

    private final ItemId itemId;

    public RemoveItem(ItemId itemId) {
        this.itemId = itemId;
    }

    public ItemId getItemId() {
        return itemId;
    }
}
