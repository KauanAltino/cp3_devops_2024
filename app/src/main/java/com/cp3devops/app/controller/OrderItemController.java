package com.cp3devops.app.controller;
import org.springframework.web.bind.annotation.*;
import com.cp3devops.app.model.OrderItem;
import com.cp3devops.app.service.OrderItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/orderItems")
public class OrderItemController {
    private final OrderItemService orderItemService = new OrderItemService();

    @PostMapping
    public ResponseEntity<OrderItem> createOrderItem(@RequestBody OrderItem orderItem) {
        OrderItem createdOrderItem = orderItemService.createOrderItem(orderItem);
        return new ResponseEntity<>(createdOrderItem, HttpStatus.CREATED);
    }

    // Outros endpoints para buscar, atualizar e deletar itens de pedido
}