package com.dungeonsedragons.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dungeonsedragons.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
