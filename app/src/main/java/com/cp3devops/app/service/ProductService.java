package com.cp3devops.app.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cp3devops.app.model.Product;
import com.cp3devops.app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    // Injeção de dependência via construtor
    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Transactional
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    @Transactional
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
