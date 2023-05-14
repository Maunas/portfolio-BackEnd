/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.portfoliobackend.Controller;

import com.argentinaprograma.portfoliobackend.Config.JwtTokenUtil;
import com.argentinaprograma.portfoliobackend.Dto.JwtResponse;
import com.argentinaprograma.portfoliobackend.Dto.UsuarioDTO;
import com.argentinaprograma.portfoliobackend.Service.JwtUserDetailsService;
import com.argentinaprograma.portfoliobackend.Service.RegistroService;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gonza
 */
@RestController
@CrossOrigin
public class LoginController {
    
    @Autowired
    private AuthenticationManager authManager;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private JwtUserDetailsService userDetailsService;
        @Autowired
    private RegistroService regService;
    
    @PostMapping("/login")
    public ResponseEntity<?> crearJwtToken(
        @RequestBody UsuarioDTO peticionJwt) throws Exception{
        
        authenticate(peticionJwt.getUsername(), peticionJwt.getPassword());
        
        //Crea el token
        final UserDetails userDetails = userDetailsService.loadUserByUsername(peticionJwt.getUsername());
        final String jwt = jwtTokenUtil.generateToken(userDetails); 
        
        return ResponseEntity.ok(new JwtResponse(jwt));
    } 
    
            //autentica los datos recibidos
    	private void authenticate(String username, String password) throws Exception {
            	Objects.requireNonNull(username);
		Objects.requireNonNull(password);
		try {
			authManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		} catch (DisabledException e) {
			throw new Exception("Usuario Deshabilitado", e);
		} catch (BadCredentialsException e) {
			throw new Exception("Credenciales Inválidas", e);
		}
	}
    
@PostMapping("/register")
    public ResponseEntity<?> registrarCuenta(
            @RequestBody UsuarioDTO usuarioDto) throws Exception{
        
        regService.crearUsuario(usuarioDto);
        
        return ResponseEntity.ok(usuarioDto);
    }
    
}
