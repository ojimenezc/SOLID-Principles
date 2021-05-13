package com.example.com.no_compliant_examples.open_closed;

public final class OrdersProcessor {

    public Order getOrderBreakdown(Order order) {
        switch (order.getOrderType()) {
            case "cash":
                //TODO: Do some order calculation logic
                return order;
            case "credit":
                //TODO: Do some order calculation logic
                return order;
            default:
                return order;
        }
    }
}
