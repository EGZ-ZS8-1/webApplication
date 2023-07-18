package com.example.WebApplication.controllers;

import com.example.WebApplication.models.Products;
import com.example.WebApplication.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

//    public ProductController(ProductService productService) {
//        this.productService = productService;
//    }

    @GetMapping("/")
    public String products(Model model) {
        model.addAllAttributes("products", productService.listProducts);
        return "products";
    }
    @PostMapping("/product/create")
    public String createProduct(Products product) {
     productService.saveProduct(product);
     return "redirect:/";
    }
    public


}
