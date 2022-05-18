package com.sofka.petProjectDDD.lending;

import co.com.sofka.domain.generic.Entity;
import com.sofka.petProjectDDD.lending.values.ItemId;
import com.sofka.petProjectDDD.lending.values.Quantity;
import com.sofka.petProjectDDD.lending.values.Title;

public class Item extends Entity<ItemId> {

    private Quantity quantity;
    private Title title;

    public Item(ItemId entityId, Quantity quantity, Title title) {
        super(entityId);
        this.quantity = quantity;
        this.title = title;
    }

    public void updateQuantity(Quantity quantity){
        this.quantity = quantity;
    }

    public Quantity Quantity() {
        return quantity;
    }

    public Title Title() {
        return title;
    }
}
