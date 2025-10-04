package com.gustavooarantes.freelancer_management.dto;

public record UserRequest(
    String fullName, String email, String password, String cpf, String cnpj) {
}
