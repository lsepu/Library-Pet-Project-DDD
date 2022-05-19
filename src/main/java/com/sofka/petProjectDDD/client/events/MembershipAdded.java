package com.sofka.petProjectDDD.client.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.petProjectDDD.client.values.ExpirationDate;
import com.sofka.petProjectDDD.client.values.MembershipId;
import com.sofka.petProjectDDD.client.values.MembershipType;

public class MembershipAdded extends DomainEvent {

    private final MembershipId membershipId;
    private final MembershipType membershipType;
    private final ExpirationDate expirationDate;

    public MembershipAdded(MembershipId membershipId, MembershipType membershipType, ExpirationDate expirationDate) {
        super("com.sofka.petProjectDDD.events");
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
