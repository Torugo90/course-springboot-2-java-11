package com.dungeonsedragons.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dungeonsedragons.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
