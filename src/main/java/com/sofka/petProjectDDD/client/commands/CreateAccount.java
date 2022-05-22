package com.sofka.petProjectDDD.client.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.petProjectDDD.client.values.AccountId;
import com.sofka.petProjectDDD.client.values.ClientId;
import com.sofka.petProjectDDD.client.values.Email;
import com.sofka.petProjectDDD.client.values.Password;

public class CreateAccount extends Command {

    private final ClientId clientId;
    private final AccountId accountId;
    private final Email email;
    private final Password password;

    public CreateAccount(ClientId clientId, AccountId accountId, Email email, Password password) {
        this.clientId = clientId;
        this.accountId = accountId;
        this.email = email;
        this.password = password;
    }

    public ClientId getClientId() {
        return clientId;
    }

    public AccountId getAccountId() {
        return accountId;
    }

    public Email getEmail() {
        return email;
    }

    public Password getPassword() {
        return password;
    }
}
