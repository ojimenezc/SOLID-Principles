package com.example.com.compliant_examples.open_closed;

import java.util.List;

public final class OrdersProcessor {

    public void getOrderBreakdown(List<Order> orders) {
        orders.forEach(order -> order.perfomCalculation());
    }
}
