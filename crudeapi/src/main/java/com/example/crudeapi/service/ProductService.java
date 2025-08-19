package com.example.crudeapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudeapi.entity.Product;
import com.example.crudeapi.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
       return productRepository.findAll();
    }

    public void addProducts(Product product) {
        productRepository.save(product);
    }

    public void updateProducts(Product product) {
        productRepository.save(product);
    }

    public void deleteProductById(int productId) {
        productRepository.deleteById(productId);
    }


}
