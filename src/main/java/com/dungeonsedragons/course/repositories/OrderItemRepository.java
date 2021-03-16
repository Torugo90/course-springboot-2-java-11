package com.dungeonsedragons.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dungeonsedragons.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
