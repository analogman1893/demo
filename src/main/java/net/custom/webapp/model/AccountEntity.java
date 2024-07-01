package net.custom.webapp.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Account")
public class AccountEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerNumber;
    @Embedded
    private Account account;

   /* @OneToMany(mappedBy = "account")
    private Set<Saving> savings;*/

    public AccountEntity()
    {
    }

    public AccountEntity(Account account)
    {
        this.account = account;
    }

    public Long getCustomerNumber()
    {
        return customerNumber;
    }

    public Account getAccount()
    {
        return account;
    }

 /*   public Set<Saving> getSavings()
    {
        return savings;
    }*/
}
