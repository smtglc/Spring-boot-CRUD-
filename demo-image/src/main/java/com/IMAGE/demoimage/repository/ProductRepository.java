package com.IMAGE.demoimage.repository;

import com.IMAGE.demoimage.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
