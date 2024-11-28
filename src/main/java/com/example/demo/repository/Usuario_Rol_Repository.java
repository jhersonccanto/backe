package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.usuario_rol;


@Repository
public interface Usuario_Rol_Repository  extends JpaRepository<usuario_rol,Long>{
	 // Modificar el nombre del método para usar el nombre correcto de la propiedad 'idRol' de Rol
    List<usuario_rol> findByRol_IdRol(Long rolId);

    // El otro método parece estar bien
    Optional<usuario_rol> findByUsuario_Persona_IdPersonaAndRol_IdRol(Long personaId, Long rolId);
}