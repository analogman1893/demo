package net.custom.webapp.service.impl;

import net.custom.webapp.model.*;
import net.custom.webapp.repository.AccountRepository;
import net.custom.webapp.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService
{

    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository)
    {
        this.accountRepository = accountRepository;
    }

    @Override
    public List<Account> getAccounts()
    {
        return null;
    }

    @Override
    public AccountSavingReturn getAccount(String id)
    {
        Optional<AccountEntity> optionalAccountEntity = accountRepository.findById(id);
        if (optionalAccountEntity.isPresent())
        {
            AccountEntity account = optionalAccountEntity.get();
            return new AccountSavingReturn(account, new TransactionReturn("302", "Customer Account found"));
        } else
        {
            return new AccountSavingReturn(null, new TransactionReturn("401", "Customer not found"));
        }
    }

    @Override
    public AccountReturn saveAccount(Account account)
    {
        TransactionReturn transactionReturn = validateAccount(account);
        if ("400".equalsIgnoreCase(transactionReturn.getTransactionStatusCode()))
            return new AccountReturn(transactionReturn);
        else
            try
            {
                AccountEntity accountEntity = accountRepository.save(new AccountEntity(account));
                return new AccountReturn(accountEntity.getCustomerNumber(), new TransactionReturn("201", "Customer account created"));
            } catch (Exception e)
            {
                return new AccountReturn(new TransactionReturn("400", "Error encountered during saving Account."));
            }
    }

    private TransactionReturn validateAccount(Account account)
    {
        if ("".equalsIgnoreCase(account.getAccountType()))
        {
            return new TransactionReturn("400", "Account Type is required field.");
        }
        if ("".equalsIgnoreCase(account.getAddress1()))
        {
            return new TransactionReturn("400", "Address 1 is required field.");
        }
        if ("".equalsIgnoreCase(account.getAddress2()))
        {
            return new TransactionReturn("400", "Address 2 is required field.");
        }
        if ("".equalsIgnoreCase(account.getCustomerName()))
        {
            return new TransactionReturn("400", "Customer Name is required field.");
        }
        if ("".equalsIgnoreCase(account.getCustomermobile()))
        {
            return new TransactionReturn("400", "Customer Mobile is required field.");
        }
        if ("".equalsIgnoreCase(account.getCustomerEmail()))
        {
            return new TransactionReturn("400", "Email is required field.");
        }
        return new TransactionReturn("201", "Customer account is valid");
    }

    @Override
    public void deleteAccount(String id)
    {

    }

    @Override
    public AccountEntity updateAccount(String id)
    {
        return null;
    }
}
