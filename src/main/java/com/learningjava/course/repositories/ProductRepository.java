package com.learningjava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learningjava.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
