/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.portfoliobackend.Model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author gonza
 */
@Entity
@Getter @Setter
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idPersona;
    private String nombreCompleto;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date nacimiento;
    private String profesion;
    private String descripcion;
    private String urlFoto;
    private String urlBanner;

    public Persona() {
    }

    public Persona(Long idPersona, String nombreCompleto, Date nacimiento, String profesion, String descripcion, String urlFoto, String urlBanner) {
        this.idPersona = idPersona;
        this.nombreCompleto = nombreCompleto;
        this.nacimiento = nacimiento;
        this.profesion = profesion;
        this.descripcion = descripcion;
        this.urlFoto = urlFoto;
        this.urlBanner = urlBanner;
    }
    
    
    
}
