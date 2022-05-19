package com.sofka.petProjectDDD.client.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.petProjectDDD.client.values.AccountId;
import com.sofka.petProjectDDD.client.values.Email;
import com.sofka.petProjectDDD.client.values.Password;

public class AccountCreated extends DomainEvent {

    private final AccountId accountId;
    private final Email email;
    private final Password password;

    public AccountCreated(String type, AccountId accountId, Email email, Password password) {
        super("com.sofka.petProjectDDD.client.accountcreated");
        this.accountId = accountId;
        this.email = email;
        this.password = password;
    }
    public AccountId getAccountId() {
        return accountId;
    }
}
