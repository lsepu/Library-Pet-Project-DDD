package com.sofka.petProjectDDD.client.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.petProjectDDD.client.values.ExpirationDate;
import com.sofka.petProjectDDD.client.values.MembershipId;

public class ChangeMembershipExpirationDate extends Command {

    private final MembershipId membershipId;
    private final ExpirationDate expirationDate;

    public ChangeMembershipExpirationDate(MembershipId membershipId, ExpirationDate expirationDate) {
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
