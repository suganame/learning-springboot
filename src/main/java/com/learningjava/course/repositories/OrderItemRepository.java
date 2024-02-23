package com.learningjava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learningjava.course.entities.OrderItem;
import com.learningjava.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
