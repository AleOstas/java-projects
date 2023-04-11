package com.aleostas;

public class VipCustomer {

    private String name;
    private String email;
    private double creditLimit;

    public VipCustomer() {
        this("Default Name", "default@default.com", 10.0);
        //System.out.println("This are default details");
    }

    public VipCustomer(String name, String email) {
        this(name, email, 10.0);
        //System.out.println("This are my VIP Customer account details");
    }

    public VipCustomer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
