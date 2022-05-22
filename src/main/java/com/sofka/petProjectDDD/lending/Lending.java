package com.sofka.petProjectDDD.lending;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.petProjectDDD.lending.events.LendingCreated;
import com.sofka.petProjectDDD.lending.events.*;
import com.sofka.petProjectDDD.lending.values.*;
import com.sofka.petProjectDDD.lending.values.Title;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Lending extends AggregateEvent<LendingId> {

    protected Set<Item> items;
    protected Fine fine;
    protected LendingDate lendingDate;
    protected DevolutionDate devolutionDate;

    public Lending(LendingId entityId, LendingDate lendingDate, DevolutionDate devolutionDate, Set<Item> items) {
        super(entityId);
        appendChange(new LendingCreated(items, devolutionDate, lendingDate));
        subscribe(new LendingChange(this));
    }

    private Lending(LendingId entityId) {
        super(entityId);
        subscribe(new LendingChange(this));
    }

    public static Lending from(LendingId sectionId, List<DomainEvent> events) {
        var lending = new Lending(sectionId);
        events.forEach(lending::applyEvent);
        return lending;
    }

    //behaviors

    public void addFine(FineId fineId, Reason reason, Cost cost) {
        Objects.requireNonNull(fineId);
        Objects.requireNonNull(reason);
        Objects.requireNonNull(cost);

        appendChange(new FineAdded(fineId, reason, cost)).apply();
    }

    public void addItem(ItemId itemId, Quantity quantity, Title title) {
        Objects.requireNonNull(itemId);
        Objects.requireNonNull(quantity);
        Objects.requireNonNull(title);

        appendChange(new ItemAdded(itemId, quantity, title));
    }

    public void changeDevolutionDate(DevolutionDate devolutionDate) {
        Objects.requireNonNull(devolutionDate);

        appendChange(new DevolutionDateChanged(devolutionDate)).apply();
    }

    public void changeFineCost(FineId fineId, Cost cost) {
        Objects.requireNonNull(fineId);
        Objects.requireNonNull(cost);

        appendChange(new FineCostChanged(fineId, cost)).apply();
    }

    public void removeFine(FineId fineId) {
        Objects.requireNonNull(fineId);

        appendChange(new FineRemoved(fineId)).apply();
    }

    public void removeItem(ItemId itemId) {
        Objects.requireNonNull(itemId);

        appendChange(new ItemRemoved(itemId)).apply();
    }

    public void updateItemQuantity(ItemId itemId, Quantity quantity) {
        Objects.requireNonNull(itemId);
        Objects.requireNonNull(quantity);

        appendChange(new ItemQuantityUpdated(itemId, quantity));
    }

    protected Optional<Item> getItemById(ItemId itemId) {
        return items
                .stream()
                .filter(item -> item.identity().equals(itemId))
                .findFirst();
    }


}
