package com.sofka.petProjectDDD.client.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.petProjectDDD.client.values.ClientId;
import com.sofka.petProjectDDD.client.values.ExpirationDate;
import com.sofka.petProjectDDD.client.values.MembershipId;
import com.sofka.petProjectDDD.client.values.MembershipType;

public class AddMembership extends Command {

    private final ClientId clientId;
    private final MembershipId membershipId;
    private final MembershipType membershipType;
    private final ExpirationDate expirationDate;

    public AddMembership(ClientId clientId, MembershipId membershipId, MembershipType membershipType, ExpirationDate expirationDate) {
        this.clientId = clientId;
        this.membershipId = membershipId;
        this.membershipType = membershipType;
        this.expirationDate = expirationDate;
    }

    public ClientId getClientId() {
        return clientId;
    }

    public MembershipId getMembershipId() {
        return membershipId;
    }

    public MembershipType getMembershipType() {
        return membershipType;
    }

    public ExpirationDate getExpirationDate() {
        return expirationDate;
    }
}
