package com.example.crudeapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudeapi.entity.Product;
import com.example.crudeapi.service.ProductService;

@RestController
public class Controller {
    
    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String home(){
        return "Hello World";
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @PostMapping("products")
    public void addProducts(@RequestBody Product product){
        productService.addProducts(product);
    }

    @PutMapping("/update")
    public void updateProduct(@RequestBody Product product){
        productService.updateProducts(product);
    }

    @DeleteMapping("/delete/{productId}")
    public void deleteProductById(@PathVariable int productId){
        productService.deleteProductById(productId);
    }
}
