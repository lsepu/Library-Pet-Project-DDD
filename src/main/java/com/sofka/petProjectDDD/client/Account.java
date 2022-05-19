package com.sofka.petProjectDDD.client;

import co.com.sofka.domain.generic.Entity;
import com.sofka.petProjectDDD.client.values.AccountId;
import com.sofka.petProjectDDD.client.values.Email;
import com.sofka.petProjectDDD.client.values.Password;

public class Account extends Entity<AccountId> {

    private Email email;
    private Password password;

    public Account(AccountId entityId, Email email, Password password) {
        super(entityId);
        this.email = email;
        this.password = password;
    }

    public Email getEmail() {
        return email;
    }

}
