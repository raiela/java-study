package com.educandoweb.course.repositories;

import com.educandoweb.course.entitites.OrderItem;
import com.educandoweb.course.entitites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
