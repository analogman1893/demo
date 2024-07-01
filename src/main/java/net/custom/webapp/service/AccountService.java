package net.custom.webapp.service;

import net.custom.webapp.model.Account;
import net.custom.webapp.model.AccountEntity;
import net.custom.webapp.model.AccountReturn;
import net.custom.webapp.model.AccountSavingReturn;

import java.util.List;

public interface AccountService
{
    List<Account> getAccounts();

    AccountSavingReturn getAccount(String id);

    AccountReturn saveAccount(Account account);

    void deleteAccount(String id);

    AccountEntity updateAccount(String id);

}
