package com.sofka.petProjectDDD.client.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.petProjectDDD.client.Account;
import com.sofka.petProjectDDD.client.values.Address;
import com.sofka.petProjectDDD.client.values.IdentificationCard;
import com.sofka.petProjectDDD.client.values.Name;
import com.sofka.petProjectDDD.client.values.PhoneNumber;

public class CreateClient extends Command {

    private final Name name;
    private final Address address;
    private final PhoneNumber phoneNumber;
    private final IdentificationCard identificationCard;
    private final Account account;

    public CreateClient(Name name, Address address, PhoneNumber phoneNumber, IdentificationCard identificationCard, Account account) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.identificationCard = identificationCard;
        this.account = account;
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
