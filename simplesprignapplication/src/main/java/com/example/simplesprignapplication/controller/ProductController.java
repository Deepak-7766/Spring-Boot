package com.example.simplesprignapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import com.example.simplesprignapplication.model.Product;
import com.example.simplesprignapplication.services.ProductService;

@RestController
public class ProductController {

     @Autowired
        ProductService productService;

    @GetMapping("/product")
    public List<Product> getProduct(){
       
        return productService.getProductList();

    }
    
    @GetMapping("/product/{productId}")
    public Product getProductById(@PathVariable int productId){
        return productService.getProductById(productId);
    }

    @PostMapping("/products")
    public void addProducts(@RequestBody Product product){
        System.out.println(product);
        productService.addProduct(product);
    }

}
