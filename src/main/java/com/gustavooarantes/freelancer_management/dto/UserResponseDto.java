package com.gustavooarantes.freelancer_management.dto;

import com.gustavooarantes.freelancer_management.enums.Role;

public record UserResponseDto(
		Long id, String fullName, String email, Role role) {
}
