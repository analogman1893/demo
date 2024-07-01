package net.custom.webapp.model;

public class AccountType
{
    private Account account;
    private String accountType;

    public AccountType(Account account,
                       String accountType)
    {
        this.account = account;
        this.accountType = accountType;
    }

    public Account getAccount()
    {
        return account;
    }

    public String getAccountType()
    {
        return accountType;
    }
}
