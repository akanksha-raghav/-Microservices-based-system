// OrderService.java
package com.example.orderservice.service;

import com.example.orderservice.model.Order;

import java.util.List;

public interface OrderService {
    List<Order> getAllOrders();
    Order getOrderById(Long orderId);
    Order createOrder(Order order);
    List<Order> getOrdersByUserId(Long userId);
}
