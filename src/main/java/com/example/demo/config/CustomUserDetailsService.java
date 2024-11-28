package com.example.demo.config;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Usuario;
import com.example.demo.service.UsuarioService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioService.findByUsuario(username);

        List<GrantedAuthority> authorities = usuario.getUsuarioRoles()
        	    .stream()
        	    .map(ur -> new SimpleGrantedAuthority(ur.getRol().getNombre()))
        	    .collect(Collectors.toList());

        return new org.springframework.security.core.userdetails.User(
            usuario.getUsuario(),
            usuario.getClave(),
            authorities
        );
    }
}
