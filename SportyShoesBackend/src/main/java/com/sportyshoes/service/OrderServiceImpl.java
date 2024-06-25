package com.sportyshoes.service;

import com.sportyshoes.model.Order;
import com.sportyshoes.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    @Override
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order updateOrder(Long id, Order orderDetails) {
        Order order = orderRepository.findById(id).orElse(null);
        if (order != null) {
            order.setUser(orderDetails.getUser());
            order.setProducts(orderDetails.getProducts());
            order.setTotalAmount(orderDetails.getTotalAmount());
            order.setOrderDate(orderDetails.getOrderDate());
            return orderRepository.save(order);
        } else {
            return null;
        }
    }

    @Override
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
