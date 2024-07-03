package net.custom.webapp.model;

import javax.persistence.Embedded;
import java.util.Set;

public class AccountSavingReturn
{
    private String customerName;
    private String customerMobile;
    private Long customerNumber;
    private String customerEmail;
    private String address1;
    private String address2;
    private Set<Saving> savings;
    @Embedded
    private TransactionReturn transactionReturn;

    public AccountSavingReturn(AccountEntity account, TransactionReturn transactionReturn)
    {
        this.customerNumber = account.getCustomerNumber();
        this.customerName = account.getAccount().getCustomerName();
        this.customerMobile = account.getAccount().getCustomerMobile();
        this.customerEmail = account.getAccount().getCustomerEmail();
        this.address1 = account.getAccount().getAddress1();
        this.address2 = account.getAccount().getAddress2();
        this.savings = account.getSavings();
        this.transactionReturn = transactionReturn;
    }

    public AccountSavingReturn(TransactionReturn transactionReturn)
    {
        this.transactionReturn = transactionReturn;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public String getCustomerMobile()
    {
        return customerMobile;
    }

    public Long getCustomerNumber()
    {
        return customerNumber;
    }

    public String getCustomerEmail()
    {
        return customerEmail;
    }

    public String getAddress1()
    {
        return address1;
    }

    public String getAddress2()
    {
        return address2;
    }

    public Set<Saving> getSavings()
    {
        return savings;
    }

    public TransactionReturn getTransactionReturn()
    {
        return transactionReturn;
    }
}
