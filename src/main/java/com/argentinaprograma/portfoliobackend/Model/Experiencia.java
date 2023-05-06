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
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author gonza
 */
@Entity
@Getter @Setter
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idExperiencia;
    private String puesto;
    private String institución;
    private String urlImagen;
    private Date fechaDesde;
    private Date fechaHasta;

    public Experiencia() {
    }

    public Experiencia(Long idExperiencia, String puesto, String institución, String urlImagen, Date fechaDesde, Date fechaHasta) {
        this.idExperiencia = idExperiencia;
        this.puesto = puesto;
        this.institución = institución;
        this.urlImagen = urlImagen;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
    }
    
    
    
}
