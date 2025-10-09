package com.gustavooarantes.freelancer_management.service;

import java.util.List;

import com.gustavooarantes.freelancer_management.entity.User;
import com.gustavooarantes.freelancer_management.enums.Role;

public interface UserService {

	List<User> findAllByRole(Role role);

	User findUserById(Long id);

	User findUserByFullName(String fullName);
}
