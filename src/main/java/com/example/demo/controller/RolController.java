package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import com.example.demo.entity.Rol;
import com.example.demo.service.RolService;

@RestController
@RequestMapping("/api/rol")
@CrossOrigin(origins = "http://localhost:4200")
public class RolController {


    private final RolService rolService;

    @Autowired
    public RolController(RolService rolService) {
        this.rolService = rolService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> createRol(@RequestBody Rol rol) {
        try {
            Rol newRol = rolService.create(rol);
            return ResponseEntity.ok(newRol);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateRol(@RequestBody Rol rol) {
        try {
            Rol updatedRol = rolService.update(rol);
            return ResponseEntity.ok(updatedRol);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteRol(@PathVariable Long id) {
        try {
            rolService.delete(id);
            return ResponseEntity.ok().build();
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/read/{id}")
    public ResponseEntity<?> readRol(@PathVariable Long id) {
        Optional<Rol> rol = rolService.read(id);
        if (rol.isPresent()) {
            return ResponseEntity.ok(rol.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/readAll")
    public List<Rol> getAllRoles() {
        return rolService.readAll();
    }
}