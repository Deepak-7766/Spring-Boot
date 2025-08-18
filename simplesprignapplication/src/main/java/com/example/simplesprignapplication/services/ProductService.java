package com.example.simplesprignapplication.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.simplesprignapplication.model.Product;
import com.example.simplesprignapplication.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
     private ProductRepository producRepository;

    // List<Product> productList=new ArrayList<>( Arrays.asList(
    //     new Product(1,"mobile",100),
    //     new Product(2,"laptop",5000)));
    public List<Product> getProductList(){
        
        return producRepository.findAll();
    }

    public Product getProductById(int productId) {
    
        return producRepository.findById((long) productId).orElseThrow();
    }

    public void addProduct(Product product) {
       
       producRepository.save(product);
    }

    public void updateProduct(Product product) {
       
        producRepository.save(product);
    }

    public void deleteProduct(int productId){
            producRepository.deleteById((long) productId);
    }



}