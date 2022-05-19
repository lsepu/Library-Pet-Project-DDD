package com.sofka.petProjectDDD.client;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.petProjectDDD.client.events.*;
import com.sofka.petProjectDDD.client.values.*;
import com.sofka.petProjectDDD.client.events.LendingAddedToClient;
import com.sofka.petProjectDDD.lending.values.LendingId;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Client extends AggregateEvent<ClientId> {

    protected Name name;
    protected Set<LendingId> lendings;
    protected Address address;
    protected IdentificationCard identificationCard;
    protected Account account;
    protected Membership membership;
    protected PhoneNumber phoneNumber;


    public Client(ClientId entityId, Name name, Address address, PhoneNumber phoneNumber, IdentificationCard identificationCard, Account account) {
        super(entityId);
        appendChange(new ClientAdded(name, address, phoneNumber, identificationCard, account ));
        subscribe(new ClientChange(this));
    }

    private Client(ClientId entityId){
        super(entityId);
        subscribe(new ClientChange(this));
    }

    public static Client from (ClientId sectionId, List<DomainEvent> events){
        var client = new Client(sectionId);
        events.forEach(client::applyEvent);
        return client;
    }

    //behaviors
    public void addMembership(MembershipId membershipId, MembershipType membershipType, ExpirationDate expirationDate){
        Objects.requireNonNull(membershipId);
        Objects.requireNonNull(membershipType);
        Objects.requireNonNull(expirationDate);

        appendChange(new MembershipAdded(membershipId, membershipType, expirationDate)).apply();
    }

    public void changeMembershipExpirationDate(MembershipId membershipId, ExpirationDate expirationDate){
        Objects.requireNonNull(membershipId);
        Objects.requireNonNull(expirationDate);

        appendChange(new MembershipExpirationDateChanged(membershipId, expirationDate)).apply();
    }

    public void changeMembershipType(MembershipId membershipId, MembershipType membershipType){
        Objects.requireNonNull(membershipId);
        Objects.requireNonNull(membershipType);

        appendChange(new MembershipTypeChanged(membershipId, membershipType)).apply();

    }

    public void createAccount(AccountId accountId, Email email, Password password){
        Objects.requireNonNull(accountId);
        Objects.requireNonNull(email);
        Objects.requireNonNull(password);

        appendChange(new AccountCreated(accountId, email, password));
    }

    public void AddLendingToClient(LendingId lendingId){
        Objects.requireNonNull(lendingId);
        appendChange(new LendingAddedToClient(lendingId));
    }




}
