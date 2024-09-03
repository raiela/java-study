package com.educandoweb.course.repositories;


import com.educandoweb.course.entitites.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
