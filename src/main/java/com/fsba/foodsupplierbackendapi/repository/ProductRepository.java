package com.fsba.foodsupplierbackendapi.repository;

import com.fsba.foodsupplierbackendapi.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
