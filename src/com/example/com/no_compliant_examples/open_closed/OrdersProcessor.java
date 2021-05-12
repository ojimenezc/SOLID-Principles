package com.example.com.no_compliant_examples.open_closed;

public final class OrdersProcessor {

    public boolean getOrderBreakdown(Order order) {
        switch (order.getOrderType()) {
            case "cash":
                //TODO: Do some order calculation logic
                return true;
            case "credit":
                //TODO: Do some order calculation logic
                return true;
            default:
                return false;
        }
    }
}
