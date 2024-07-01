package net.custom.webapp.model;

import javax.persistence.Embedded;

public class AccountReturn
{
    private String customerNumber;
    @Embedded
    private TransactionReturn transactionReturn;

    public AccountReturn(String customerNumber, TransactionReturn transactionReturn)
    {
        this.customerNumber = customerNumber;
        this.transactionReturn = transactionReturn;
    }

    public AccountReturn(TransactionReturn transactionReturn)
    {
        this.transactionReturn = transactionReturn;
    }

    public String getCustomerNumber()
    {
        return customerNumber;
    }

    public TransactionReturn getTransactionReturn()
    {
        return transactionReturn;
    }
}
