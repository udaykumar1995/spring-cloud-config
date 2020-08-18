package com.consistentlearners.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.consistentlearners.springcloud.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
