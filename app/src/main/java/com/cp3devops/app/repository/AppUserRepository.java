package com.cp3devops.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cp3devops.app.model.AppUser; // Atualizado para AppUser

public interface AppUserRepository extends JpaRepository<AppUser, Long> { // Atualizado para AppUser
    // Métodos personalizados, se necessário
    // Por exemplo, para buscar um usuário por email:
    AppUser findByEmail(String email); // Atualizado para AppUser
}
