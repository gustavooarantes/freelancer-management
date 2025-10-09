package com.gustavooarantes.freelancer_management.dto;

import java.util.Optional;

import com.gustavooarantes.freelancer_management.enums.Role;

public record UserRequestDto(
		Long id,
		String fullName,
		String cpf,
		String cnpj,
		Role role) {

	public Optional<String> fullNameOpt() {
		return Optional.ofNullable(fullName);
	}

	public Optional<String> cpfOpt() {
		return Optional.ofNullable(cpf);
	}

	public Optional<String> cnpjOpt() {
		return Optional.ofNullable(cnpj);
	}

	public Optional<Role> roleOpt() {
		return Optional.ofNullable(role);
	}
}
