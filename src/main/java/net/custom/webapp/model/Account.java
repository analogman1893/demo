package net.custom.webapp.model;

public class Account
{
    private String customerName;
    private String customerMobile;
    private String customerEmail;
    private String address1;
    private String address2;

    public Account(String customerName,
                   String customerMobile,
                   String customerEmail,
                   String address1,
                   String address2)
    {
        this.customerName = customerName;
        this.customerMobile = customerMobile;
        this.customerEmail = customerEmail;
        this.address1 = address1;
        this.address2 = address2;
    }

    public Account()
    {

    }

    public String getCustomerName()
    {
        return customerName;
    }

    public String getCustomerMobile()
    {
        return customerMobile;
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

}
