package com.modUp.beta.service;

import com.modUp.beta.model.Products;
import com.modUp.beta.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductsService {

    @Autowired
    private ProductsRepository repository;


    public Products save(Products product){
        return repository.save(product);
    }

    public Products findById(Long id){
        return repository.findById(id).orElse(null);
    }

    public List<Products> findAllProducts(){
        return repository.findAll();
    }
}
