package com.example.com.compliant_examples.open_closed;

public class CreditOrder implements Order {
    protected final String ORDER_TYPE = "credit";

    @Override
    public String getOrderType() {
        return ORDER_TYPE;
    }

    @Override
    public Object perfomCalculation() {
        //TODO: Make the required calculation
        return true;
    }
}
