package com.gustavooarantes.freelancer_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavooarantes.freelancer_management.entity.User;
import com.gustavooarantes.freelancer_management.enums.Role;

public interface UserRepository extends JpaRepository<User, Long> {

	User findUserByRole(Role role);

	User findUserByFullName(String fullName);

}
