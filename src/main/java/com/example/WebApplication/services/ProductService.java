package com.example.WebApplication.services;

import com.example.WebApplication.models.Products;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Products> products = new ArrayList<>();
    private long ID = 0;
    {
        products.add(new Products(++ID,"Помидоры", "Абаканские", 200, "Калининград", "Андрей"));
        products.add(new Products(++ID,"Огурцы", "Абаканские", 100, "Калининград", "Андрей"));
    }

    public List<Products> getProducts() {return products;}
    public void saveProduct(Products product){
        product.setId(++ID);
        products.add(product);
    }

    public void deleteProducts (Long id) {
        products.removeIf(product -> product.getId().equals(id));
    }

}
