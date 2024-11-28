package com.example.demo.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor 
@NoArgsConstructor  
@Getter             
@Setter
public class UsuarioInfoDTO {
	 private Long idUsuario;
	    private String nombreCompleto;
	    private String nombre;
	    private String apellido;
	    private String email;
	    private String username;
	    private String dni;
	    private List<String> roles;
}
