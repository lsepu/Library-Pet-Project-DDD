package com.sofka.petProjectDDD.client.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.petProjectDDD.client.Account;
import com.sofka.petProjectDDD.client.values.Address;
import com.sofka.petProjectDDD.client.values.IdentificationCard;
import com.sofka.petProjectDDD.client.values.Name;
import com.sofka.petProjectDDD.client.values.PhoneNumber;
import com.sofka.petProjectDDD.lending.values.LendingId;

public class ClientAdded extends DomainEvent {

    private final LendingId lendingId;
    private final Name name;
    private final Address address;
    private final PhoneNumber phoneNumber;
    private final IdentificationCard identificationCard;
    private final Account account;

    public ClientAdded(LendingId lendingId, Name name, Address address, PhoneNumber phoneNumber, IdentificationCard identificationCard, Account account) {
        super("com.sofka.petProjectDDD.client.clientadded");
        this.lendingId = lendingId;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.identificationCard = identificationCard;
        this.account = account;
    }

    public LendingId getLendingId() {
        return lendingId;
    }

    public Name getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public IdentificationCard getIdentificationCard() {
        return identificationCard;
    }

    public Account getAccount() {
        return account;
    }
}
