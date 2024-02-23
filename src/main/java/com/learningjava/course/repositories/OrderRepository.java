package com.learningjava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learningjava.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
