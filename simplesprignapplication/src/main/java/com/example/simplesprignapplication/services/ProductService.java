package com.example.simplesprignapplication.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.simplesprignapplication.model.Product;

@Service
public class ProductService {
    List<Product> productList=new ArrayList<>( Arrays.asList(
        new Product(1,"mobile",100),
        new Product(2,"laptop",5000)));
    public List<Product> getProductList(){
        
        return productList;
    }

    public Product getProductById(int productId) {
    
        return productList.stream().filter(p -> p.getProductId() == productId)
        .findFirst().get();
    }

    public void addProduct(Product product) {
       
       productList.add(product);
    }

}
