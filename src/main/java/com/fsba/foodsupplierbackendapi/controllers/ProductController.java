package com.fsba.foodsupplierbackendapi.controllers;

import com.fsba.foodsupplierbackendapi.models.Product;
import com.fsba.foodsupplierbackendapi.repository.ProductRepository;
import com.fsba.foodsupplierbackendapi.services.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class ProductController {

    private final ProductRepository productRepository;
    private final ProductService productService;
    @Operation(
            description = "GET endpoint for products",
            summary = "GEt endpoint to look for any product"

    )
    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable Long id) {
        Product product;
        product = productService.findProductById(id);
        return new ResponseEntity<Product>(product, HttpStatus.OK);
    }

    @Operation(
            description = "GET endpoint for products",
            summary = "GEt endpoint to look for specific product (ById)"

    )
    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts() {
        List<Product> products;
        products = productService.findAll();
        return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
    }

}
