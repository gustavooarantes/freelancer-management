package com.gustavooarantes.freelancer_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavooarantes.freelancer_management.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
