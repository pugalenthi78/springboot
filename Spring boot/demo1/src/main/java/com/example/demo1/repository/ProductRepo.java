package com.example.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo1.model.Product;

public interface ProductRepo extends JpaRepository<Product,String> {

    
}