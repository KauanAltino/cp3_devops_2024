package com.cp3devops.app.service;
import org.springframework.stereotype.Service;
import com.cp3devops.app.model.OrderItem;
import com.cp3devops.app.repository.OrderItemRepository;

import jakarta.transaction.Transactional;

@Service
public class OrderItemService {
    private final OrderItemRepository orderItemRepository = null;

    @Transactional
    public OrderItem createOrderItem(OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }

    // Outros métodos para buscar, atualizar e deletar itens de pedido
}