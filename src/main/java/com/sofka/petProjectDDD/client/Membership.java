package com.sofka.petProjectDDD.client;

import co.com.sofka.domain.generic.Entity;
import com.sofka.petProjectDDD.client.values.ExpirationDate;
import com.sofka.petProjectDDD.client.values.MembershipId;
import com.sofka.petProjectDDD.client.values.MembershipType;

public class Membership extends Entity<MembershipId> {

    private MembershipType membershipType;
    private ExpirationDate expirationDate;

    public Membership(MembershipId entityId, MembershipType membershipType, ExpirationDate expirationDate) {
        super(entityId);
        this.membershipType = membershipType;
        this.expirationDate = expirationDate;
    }

    public MembershipType getMembershipType() {
        return membershipType;
    }

    public ExpirationDate getExpirationDate() {
        return expirationDate;
    }

    public void changeMembershipType(MembershipType membershipType){
        this.membershipType = membershipType;
    }

    public void updateExpirationDate(ExpirationDate expirationDate){
        this.expirationDate = expirationDate;
    }

}
