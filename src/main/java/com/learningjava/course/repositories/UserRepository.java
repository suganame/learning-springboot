package com.learningjava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learningjava.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
