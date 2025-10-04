package com.gustavooarantes.freelancer_management.dto;

import java.time.LocalDateTime;

import com.gustavooarantes.freelancer_management.enums.Role;

public record UserResponse(
    Long id, String fullName, String email, String cpf, String cnpj, LocalDateTime createdAt, LocalDateTime updatedAt,
    Role role) {
}
