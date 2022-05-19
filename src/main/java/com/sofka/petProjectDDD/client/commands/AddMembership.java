package com.sofka.petProjectDDD.client.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.petProjectDDD.client.values.ExpirationDate;
import com.sofka.petProjectDDD.client.values.MembershipId;
import com.sofka.petProjectDDD.client.values.MembershipType;

public class AddMembership extends Command {
    private final MembershipId membershipId;
    private final MembershipType membershipType;
    private final ExpirationDate expirationDate;

    public AddMembership(MembershipId membershipId, MembershipType membershipType, ExpirationDate expirationDate) {
        this.membershipId = membershipId;
        this.membershipType = membershipType;
        this.expirationDate = expirationDate;
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
