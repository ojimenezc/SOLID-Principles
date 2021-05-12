package com.example.com.no_compliant_examples.open_closed;

public class CreditOrder implements Order {
    protected final String ORDER_TYPE = "credit";

    @Override
    public String getOrderType() {
        return ORDER_TYPE;
    }
}
