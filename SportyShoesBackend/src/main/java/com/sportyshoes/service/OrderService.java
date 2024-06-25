package com.sportyshoes.service;

import com.sportyshoes.model.Order;

import java.util.List;

public interface OrderService {
    List<Order> getAllOrders();

    Order getOrderById(Long id);

    Order createOrder(Order order);

    Order updateOrder(Long id, Order orderDetails);

    void deleteOrder(Long id);
}
