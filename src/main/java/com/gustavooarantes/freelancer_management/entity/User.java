package com.gustavooarantes.freelancer_management.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.gustavooarantes.freelancer_management.enums.Role;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @CreationTimestamp
  @Column(name = "created_at", nullable = false, updatable = false)
  private LocalDateTime createdAt;

  @UpdateTimestamp
  @Column(name = "updated_at")
  private LocalDateTime updatedAt;

  @Column(name = "fullname", nullable = false)
  private String fullName;

  @Column(name = "user_password", nullable = false, updatable = true)
  private String password;

  @Column(name = "email", nullable = false, updatable = true)
  private String email;

  @Column(name = "cpf", nullable = false, updatable = false, unique = true)
  private String cpf;

  @Column(name = "cnpj", nullable = true, updatable = true, unique = true)
  private String cnpj;

  @Enumerated(EnumType.STRING)
  @Column(name = "user_role", nullable = false, updatable = true)
  private Role role;
}
