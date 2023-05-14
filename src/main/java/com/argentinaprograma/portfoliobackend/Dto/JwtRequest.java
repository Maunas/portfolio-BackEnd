/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.portfoliobackend.Dto;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author gonza
 */
@Getter @Setter
    public class JwtRequest implements Serializable {

	private static final long serialVersionUID = 5926468583005150707L;

	private String usuario;
	private String contrasena;

	//default constructor for JSON Parsing
	public JwtRequest()
	{
	}

	public JwtRequest(String usuario, String contrasena) {
		this.setUsuario(usuario);
		this.setContrasena(contrasena);
	}
}
