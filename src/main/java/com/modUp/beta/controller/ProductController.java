package com.modUp.beta.controller;


import com.modUp.beta.model.Products;
import com.modUp.beta.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductsService service;

    public ProductController(ProductsService service) {
        this.service = service;
    }

    @PostMapping(value = "/save")
    public ResponseEntity<Products> saveProduct(@RequestBody Products nome){
        nome = service.save(nome);
        return ResponseEntity.ok().body(nome);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Products> findById(@PathVariable Products id){
        Products products = service.findById(id.getId());

        return ResponseEntity.ok().body(products);
    }


    @GetMapping(value = "/findall")
    public ResponseEntity<List<Products>> findByAll(){
        List<Products> products = service.findAllProducts();

        return ResponseEntity.ok().body(products);
    }
}
