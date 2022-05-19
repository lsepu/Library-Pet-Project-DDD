package com.sofka.petProjectDDD.client.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.petProjectDDD.client.values.MembershipId;
import com.sofka.petProjectDDD.client.values.MembershipType;

public class ChangeMembershipType extends Command {
    private final MembershipId membershipId;
    private final MembershipType membershipType;

    public ChangeMembershipType(MembershipId membershipId, MembershipType membershipType) {
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
