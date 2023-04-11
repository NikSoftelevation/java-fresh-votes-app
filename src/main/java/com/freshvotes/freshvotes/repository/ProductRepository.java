package com.freshvotes.freshvotes.repository;

import com.freshvotes.freshvotes.domain.Product;
import com.freshvotes.freshvotes.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByUser(User user);
}