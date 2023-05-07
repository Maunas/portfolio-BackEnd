/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.portfoliobackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author gonza
 */
@Entity
@Getter @Setter
public class Contacto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idContacto;
    private String nombreContacto;
    private String urlContacto;

    public Contacto() {
    }

    public Contacto(Long idContacto, String nombreContacto, String urlContacto) {
        this.idContacto = idContacto;
        this.nombreContacto = nombreContacto;
        this.urlContacto = urlContacto;
    }
    
    
    
}
