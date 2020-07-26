package com.luv2.code.ecommerce.dao;

import com.luv2.code.ecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;
/*
 for JpaRepsoitory Product is the entity and Long is the primary key

 */

/**
 * Behind the scenes Spring will execute a query similar to this
 *   Spring Data Rest will automatically expose endpoint
 *   http://localhost:8080/api/product/search/findByCategoryId?Id=2
 *
 */
@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product,Long> {
     Page<Product> findByCategoryId(@RequestParam("id") Long id, Pageable pageable);

}
