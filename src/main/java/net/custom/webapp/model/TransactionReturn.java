package net.custom.webapp.model;

import javax.persistence.Embeddable;

@Embeddable
public class TransactionReturn
{
    private final String transactionStatusCode;
    private final String transactionStatusDescription;

    public TransactionReturn(String transactionStatusCode, String transactionStatusDescription)
    {
        this.transactionStatusCode = transactionStatusCode;
        this.transactionStatusDescription = transactionStatusDescription;
    }

    public String getTransactionStatusCode()
    {
        return transactionStatusCode;
    }

    public String getTransactionStatusDescription()
    {
        return transactionStatusDescription;
    }
}
