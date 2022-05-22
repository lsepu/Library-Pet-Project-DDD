package com.sofka.petProjectDDD.client;

import co.com.sofka.domain.generic.EventChange;
import com.sofka.petProjectDDD.client.events.*;
import com.sofka.petProjectDDD.client.events.LendingAddedToClient;

import java.util.HashSet;

public class ClientChange extends EventChange {
    public ClientChange(Client client) {

        apply((ClienCreated event) -> {
            client.name = event.getName();
            client.address = event.getAddress();
            client.phoneNumber = event.getPhoneNumber();
            client.identificationCard = event.getIdentificationCard();
            client.account = event.getAccount();
            client.lendings = new HashSet<>();
        });

        apply((MembershipAdded event) -> {
            client.membership = new Membership(event.getMembershipId(), event.getMembershipType(), event.getExpirationDate());
        });

        apply((MembershipExpirationDateChanged event) -> {
            client.membership.updateExpirationDate(event.getExpirationDate());
        });

        apply((MembershipTypeChanged event) -> {
            client.membership.changeMembershipType(event.getMembershipType());
        });

        apply((AccountCreated event) -> {
            client.account = new Account(event.getAccountId(), event.getEmail(), event.getPassword());
        });

        apply((LendingAddedToClient event) -> {
            client.lendings.add(event.getLendingId());
        });


    }
}
