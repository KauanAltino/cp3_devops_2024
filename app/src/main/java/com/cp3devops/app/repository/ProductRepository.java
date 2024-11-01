package com.cp3devops.app.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cp3devops.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
  // Métodos personalizados, se necessário
  // Por exemplo, para buscar produtos por nome:
  List<Product> findByNameContaining(String name);
}