package com.cp3devops.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cp3devops.app.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // Métodos personalizados, se necessário
    // Por exemplo, para buscar um usuário por email:
    User findByEmail(String email);
}