package com.cp3devops.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.cp3devops.app.model.CustomerOrder; // Atualizado para CustomerOrder
import com.cp3devops.app.service.CustomerOrderService; // Atualizado para CustomerOrderService

@RestController
@RequestMapping("/orders") // Este endpoint pode permanecer o mesmo
public class CustomerOrderController { // Renomeado de OrderController para CustomerOrderController
    private final CustomerOrderService customerOrderService; // Atualizado para CustomerOrderService

    @Autowired
    public CustomerOrderController(CustomerOrderService customerOrderService) {
        this.customerOrderService = customerOrderService; // Atualizado
    }

    @GetMapping
    public ResponseEntity<List<CustomerOrder>> getAllOrders() { // Atualizado para CustomerOrder
        List<CustomerOrder> orders = customerOrderService.getAllOrders(); // Atualizado
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CustomerOrder> createOrder(@RequestBody CustomerOrder order) { // Atualizado para CustomerOrder
        CustomerOrder createdOrder = customerOrderService.createOrder(order); // Atualizado
        return new ResponseEntity<>(createdOrder, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerOrder> getOrderById(@PathVariable Long id) { // Atualizado para CustomerOrder
        CustomerOrder order = customerOrderService.getOrderById(id); // Atualizado
        return ResponseEntity.of(Optional.ofNullable(order));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomerOrder> updateOrder(@PathVariable Long id, @RequestBody CustomerOrder order) { // Atualizado para CustomerOrder
        order.setId(id);
        CustomerOrder updatedOrder = customerOrderService.updateOrder(order); // Atualizado
        return new ResponseEntity<>(updatedOrder, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable Long id) {
        customerOrderService.deleteOrder(id); // Atualizado
        return ResponseEntity.noContent().build();
    }
}
