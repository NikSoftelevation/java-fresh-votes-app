package com.freshvotes.freshvotes.controller;

import com.freshvotes.freshvotes.domain.Product;
import com.freshvotes.freshvotes.domain.User;
import com.freshvotes.freshvotes.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DashboardController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/")
    public String rootView() {
        return "index";
    }

    @GetMapping("/dashboard")
    public String dashboard(@AuthenticationPrincipal User user, ModelMap model) {
        List<Product> products = productRepository.findByUser(user);
        model.put("products", products);
        return "dashboard";
    }

}