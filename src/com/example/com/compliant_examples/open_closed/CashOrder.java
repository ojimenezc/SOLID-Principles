package com.example.com.compliant_examples.open_closed;

public class CashOrder implements Order {
    protected final String ORDER_TYPE = "cash";

    @Override
    public String getOrderType() {
        return ORDER_TYPE;
    }

    @Override
    public Object perfomCalculation() {
        //TODO: Make calculations
        return true;
    }
}
