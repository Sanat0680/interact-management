package com.interact.interactManagement.payment;

public class PaymentPojo {
    private String Id;
    private long amount;
    private String currency;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
