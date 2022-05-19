package com.sofka.petProjectDDD.client.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.petProjectDDD.client.Account;
import com.sofka.petProjectDDD.client.values.Address;
import com.sofka.petProjectDDD.client.values.IdentificationCard;
import com.sofka.petProjectDDD.client.values.Name;
import com.sofka.petProjectDDD.client.values.PhoneNumber;
import com.sofka.petProjectDDD.lending.values.LendingId;

public class AddClient extends Command {

    private final Name name;
    private final LendingId lendingId;
    private final Address address;
    private final PhoneNumber phoneNumber;
    private final IdentificationCard identificationCard;
    private final Account account;

    public AddClient(Name name, LendingId lendingId, Address address, PhoneNumber phoneNumber, IdentificationCard identificationCard, Account account) {
        this.name = name;
        this.lendingId = lendingId;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.identificationCard = identificationCard;
        this.account = account;
    }

    public Name getName() {
        return name;
    }

    public LendingId getLendingId() {
        return lendingId;
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
