package com.cp3devops.app.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cp3devops.app.model.AppUser; // Altera para AppUser
import com.cp3devops.app.repository.AppUserRepository; // Altera para AppUserRepository
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class AppUserService { // Altera para AppUserService

    private final AppUserRepository appUserRepository; // Altera para AppUserRepository

    // Injeção de dependência via construtor
    @Autowired
    public AppUserService(AppUserRepository appUserRepository) { // Altera para AppUserRepository
        this.appUserRepository = appUserRepository;
    }

    @Transactional
    public AppUser createUser(AppUser appUser) { // Altera para AppUser
        return appUserRepository.save(appUser);
    }

    public List<AppUser> getAllUsers() { // Altera para AppUser
        return appUserRepository.findAll();
    }

    public AppUser getUserById(Long id) {
        return appUserRepository.findById(id).orElse(null);
    }

    @Transactional
    public AppUser updateUser(AppUser appUser) { // Altera para AppUser
        return appUserRepository.save(appUser);
    }

    @Transactional
    public void deleteUser(Long id) {
        appUserRepository.deleteById(id);
    }
}
