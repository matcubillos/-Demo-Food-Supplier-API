package com.fsba.foodsupplierbackendapi.services;

import com.fsba.foodsupplierbackendapi.models.Product;
import com.fsba.foodsupplierbackendapi.repository.ProductRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    @Transactional()
    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }
    @Transactional()
    public Product findProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }
}
