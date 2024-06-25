package com.sportyshoes.service;

import com.sportyshoes.model.Order;

import java.util.List;

public interface OrderService {
    Order saveOrder(Order order);
    List<Order> getAllOrder();
    List<Order> getOrderByUserId(Long userId);
    List<Order> getOrderByProductId(Long productId);
}
