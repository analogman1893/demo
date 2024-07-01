package net.custom.webapp.model;

public class Account
{
    private String customerName;
    private String customermobile;
    private String customerEmail;
    private String address1;
    private String address2;
    private String accountType;

    public Account(String customerName,
                   String customermobile,
                   String customerEmail,
                   String address1,
                   String address2,
                   String accountType)
    {
        this.customerName = customerName;
        this.customermobile = customermobile;
        this.customerEmail = customerEmail;
        this.address1 = address1;
        this.address2 = address2;
        this.accountType = accountType;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public String getCustomermobile()
    {
        return customermobile;
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

    public String getAccountType()
    {
        return accountType;
    }
}
