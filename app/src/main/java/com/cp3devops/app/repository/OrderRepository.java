package com.cp3devops.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cp3devops.app.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    // Métodos personalizados, se necessário
}
