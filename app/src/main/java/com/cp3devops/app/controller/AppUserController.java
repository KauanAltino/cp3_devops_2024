package com.cp3devops.app.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.cp3devops.app.model.AppUser; // Altera para AppUser
import com.cp3devops.app.service.AppUserService; // Altera para AppUserService
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/users")
public class AppUserController { // Altera para AppUserController

    private final AppUserService appUserService; // Altera para AppUserService

    // Injeção de dependência via construtor
    @Autowired
    public AppUserController(AppUserService appUserService) { // Altera para AppUserService
        this.appUserService = appUserService;
    }

    @PostMapping
    public ResponseEntity<AppUser> createUser(@RequestBody AppUser appUser) { // Altera para AppUser
        AppUser createdUser = appUserService.createUser(appUser);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<AppUser>> getAllUsers() { // Altera para AppUser
        List<AppUser> users = appUserService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AppUser> getUserById(@PathVariable Long id) { // Altera para AppUser
        AppUser user = appUserService.getUserById(id);
        return ResponseEntity.of(Optional.ofNullable(user));
    }

    @PutMapping("/{id}")
    public ResponseEntity<AppUser> updateUser(@PathVariable Long id, @RequestBody AppUser appUser) { // Altera para AppUser
        appUser.setId(id);
        AppUser updatedUser = appUserService.updateUser(appUser);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        appUserService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}
