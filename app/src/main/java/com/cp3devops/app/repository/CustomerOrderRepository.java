package com.cp3devops.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cp3devops.app.model.CustomerOrder; // Atualizado para CustomerOrder

public interface CustomerOrderRepository extends JpaRepository<CustomerOrder, Long> { // Atualizado para CustomerOrder
    // Métodos personalizados, se necessário
}
