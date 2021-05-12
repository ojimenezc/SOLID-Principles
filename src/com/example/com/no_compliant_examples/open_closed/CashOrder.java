package com.example.com.no_compliant_examples.open_closed;

public class CashOrder implements Order {
    protected final String ORDER_TYPE = "cash";

    @Override
    public String getOrderType() {
        return ORDER_TYPE;
    }
}
