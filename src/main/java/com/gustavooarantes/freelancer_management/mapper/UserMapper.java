package com.gustavooarantes.freelancer_management.mapper;

import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.gustavooarantes.freelancer_management.dto.UserResponseDto;
import com.gustavooarantes.freelancer_management.entity.User;

public interface UserMapper {

	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

	@Mapping(source = "id", target = "id")
	@Mapping(source = "fullName", target = "fullName")
	@Mapping(source = "email", target = "email")
	@Mapping(source = "role", target = "role")
	UserResponseDto toFindUserResponseDto(User user);

	User toUser(UserResponseDto dto);
}
