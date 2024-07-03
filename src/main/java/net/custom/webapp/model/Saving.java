package net.custom.webapp.model;

import javax.persistence.*;

@Entity
@Table(name = "Saving")
public class Saving
{
    @Id
    private Long Id;
    @ManyToOne
    @JoinColumn(name = "customerNumber", nullable = false)
    private AccountEntity account;
    private String accountType;
    private Integer availableBalance;

    public Saving(AccountEntity account, String accountType, Integer availableBalance)
    {
        this.account = account;
        this.accountType = accountType;
        this.availableBalance = availableBalance;
    }

    public AccountEntity getAccount()
    {
        return account;
    }

    public String getAccountType()
    {
        return accountType;
    }

    public Integer getAvailableBalance()
    {
        return availableBalance;
    }
}
