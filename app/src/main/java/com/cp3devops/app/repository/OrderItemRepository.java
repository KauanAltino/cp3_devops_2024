package com.cp3devops.app.repository;

import com.cp3devops.app.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    // Outros métodos personalizados podem ser adicionados aqui
}
