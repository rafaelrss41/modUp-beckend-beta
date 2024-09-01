package com.modUp.beta.repository;

import com.modUp.beta.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository  extends JpaRepository<Products, Long> {

}
