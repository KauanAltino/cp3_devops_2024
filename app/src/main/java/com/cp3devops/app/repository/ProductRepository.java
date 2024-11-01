package com.cp3devops.app.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cp3devops.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Método para buscar produtos que contêm uma parte do nome
    List<Product> findByNameContaining(String name);
}
