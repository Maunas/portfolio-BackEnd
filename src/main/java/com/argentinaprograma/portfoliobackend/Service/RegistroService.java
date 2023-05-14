/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.portfoliobackend.Service;

import com.argentinaprograma.portfoliobackend.Dto.UsuarioDTO;
import com.argentinaprograma.portfoliobackend.Model.Usuario;
import com.argentinaprograma.portfoliobackend.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author gonza
 */
@Service
public class RegistroService {
    
    	@Autowired
	private UsuarioRepository userRepo;
	@Autowired
	private PasswordEncoder bcryptEncoder;
        
        
        //Registra un nuevo usuario en la BD
        public Usuario crearUsuario(UsuarioDTO usuarioDto) {
		Usuario nuevoUsuario = new Usuario();
		nuevoUsuario.setUsername(usuarioDto.getUsername());
		nuevoUsuario.setPassword(bcryptEncoder.encode(usuarioDto.getPassword()));
		return userRepo.save(nuevoUsuario);
	}
}
