package com.sofka.petProjectDDD.client.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.petProjectDDD.client.values.MembershipId;
import com.sofka.petProjectDDD.client.values.MembershipType;

public class MembershipTypeChanged extends DomainEvent {
    private final MembershipId membershipId;
    private final MembershipType membershipType;

    public MembershipTypeChanged( MembershipId membershipId, MembershipType membershipType) {
        super("com.sofka.petProjectDDD.client.membershiptypechanged");
        this.membershipId = membershipId;
        this.membershipType = membershipType;
    }

    public MembershipId getMembershipId() {
        return membershipId;
    }

    public MembershipType getMembershipType() {
        return membershipType;
    }
}
