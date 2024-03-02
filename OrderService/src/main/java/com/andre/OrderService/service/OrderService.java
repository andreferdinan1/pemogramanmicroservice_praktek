/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andre.OrderService.service;

import com.andre.OrderService.entity.Order;
import com.andre.OrderService.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author andreferdinan
 */
@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public Order updateOrder(Long id, Order updatedOrder) {
        Optional<Order> existingOrderOptional = orderRepository.findById(id);
        if (existingOrderOptional.isPresent()) {
            Order existingOrder = existingOrderOptional.get();
            existingOrder.setProductId(updatedOrder.getProductId());
            existingOrder.setJumlah(updatedOrder.getJumlah());
            existingOrder.setTanggal(updatedOrder.getTanggal());
            existingOrder.setStatus(updatedOrder.getStatus());
            existingOrder.setTotal(updatedOrder.getTotal());

            return orderRepository.save(existingOrder);
        } else {
            return null;
        }
    }

    public boolean deleteOrder(Long id) {
        Optional<Order> orderOptional = orderRepository.findById(id);
        if (orderOptional.isPresent()) {
            orderRepository.deleteById(id);
            return true;
        } else {
            return false;  
        }
    }
    
}
