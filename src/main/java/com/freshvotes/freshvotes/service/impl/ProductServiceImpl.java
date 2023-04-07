package com.freshvotes.freshvotes.service.impl;

import com.freshvotes.freshvotes.domain.Product;
import com.freshvotes.freshvotes.repository.ProductRepository;
import com.freshvotes.freshvotes.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}