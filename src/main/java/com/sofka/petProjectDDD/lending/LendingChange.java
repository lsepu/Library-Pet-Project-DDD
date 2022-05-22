package com.sofka.petProjectDDD.lending;

import co.com.sofka.domain.generic.EventChange;
import com.sofka.petProjectDDD.lending.events.*;
import com.sofka.petProjectDDD.lending.values.Cost;

import java.util.HashSet;

public class LendingChange extends EventChange {
    public LendingChange(Lending lending){

        apply((LendingCreated event) -> {
            lending.devolutionDate = event.getDevolutionDate();
            lending.lendingDate = event.getLendingDate();
            lending.fine.changeCost(new Cost(0.0));
            lending.items = new HashSet<>();
        });

        apply((FineAdded event) -> {
            lending.fine = new Fine(event.getFineId(), event.getReason(), event.getCost());
        });

        apply((ItemAdded event) -> {
            lending.items.add(new Item(event.getItemId(), event.getQuantity(), event.getTitle()));
        });

        apply((DevolutionDateChanged event) -> {
            lending.devolutionDate = event.getDevolutionDate();
        });

        apply((FineCostChanged event) -> {
            lending.fine.changeCost(event.getCost());
        });

        apply((ItemQuantityUpdated event) -> {
            var item = lending.getItemById(event.getItemId())
                    .orElseThrow(() -> new IllegalArgumentException("The item was not found"));
            item.updateQuantity(event.getQuantity());
        });

        apply((FineRemoved event) ->{
            lending.fine.changeCost(new Cost(0.0));
        });

        apply((ItemRemoved event) ->{
            lending.items.removeIf(item -> item.identity().equals(event.getItemId()));
        });

    }

}
