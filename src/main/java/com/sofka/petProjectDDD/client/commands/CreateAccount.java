package com.sofka.petProjectDDD.client.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.petProjectDDD.client.values.AccountId;
import com.sofka.petProjectDDD.client.values.Email;
import com.sofka.petProjectDDD.client.values.Password;

public class CreateAccount extends Command {

    private final AccountId accountId;
    private final Email email;
    private final Password password;

    public CreateAccount(AccountId accountId, Email email, Password password) {
        this.accountId = accountId;
        this.email = email;
        this.password = password;
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
