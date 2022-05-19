package com.sofka.petProjectDDD.client.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.petProjectDDD.client.values.ExpirationDate;
import com.sofka.petProjectDDD.client.values.MembershipId;

public class MembershipExpirationDateChanged extends DomainEvent {

    private final MembershipId membershipId;
    private final ExpirationDate expirationDate;

    public MembershipExpirationDateChanged(MembershipId membershipId, ExpirationDate expirationDate) {
        super("com.sofka.petProjectDDD.client.membershipexpirationdatechanged");
        this.membershipId = membershipId;
        this.expirationDate = expirationDate;
    }

    public MembershipId getMembershipId() {
        return membershipId;
    }

    public ExpirationDate getExpirationDate() {
        return expirationDate;
    }
}
