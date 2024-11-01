package com.cp3devops.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cp3devops.app.model.CustomerOrder; // Atualizado para CustomerOrder
import com.cp3devops.app.repository.CustomerOrderRepository; // Atualizado para CustomerOrderRepository

import java.util.List;

@Service
public class CustomerOrderService { // Renomeado de OrderService para CustomerOrderService
    private final CustomerOrderRepository customerOrderRepository; // Atualizado para CustomerOrderRepository

    @Autowired
    public CustomerOrderService(CustomerOrderRepository customerOrderRepository) {
        this.customerOrderRepository = customerOrderRepository; // Atualizado
    }

    @Transactional
    public CustomerOrder createOrder(CustomerOrder order) {
        return customerOrderRepository.save(order);
    }

    public List<CustomerOrder> getAllOrders() { // Implementação do método getAllOrders
        return customerOrderRepository.findAll();
    }

    public CustomerOrder getOrderById(Long id) {
        return customerOrderRepository.findById(id).orElse(null);
    }

    @Transactional
    public CustomerOrder updateOrder(CustomerOrder order) {
        return customerOrderRepository.save(order);
    }

    @Transactional
    public void deleteOrder(Long id) {
        customerOrderRepository.deleteById(id);
    }
}
