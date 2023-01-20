package com.driver;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class OrderRepository {

    private HashMap<String, Order> OrderDb = new HashMap<>();
    private HashMap<String,Order> unassignedOrderDb= new HashMap<>();


    // 1. Add Order
    void addOrder(Order order) {
        String id = order.getId();
        OrderDb.put(id, order);
        unassignedOrderDb.put(id, order);
    }


}
