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
public class Formacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idFormacion;
    private String institucion;
    private String carrera;
    private String urlImagen;
        @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFin;

    public Formacion() {
    }

    public Formacion(Long idFormacion, String institucion, String carrera, String urlImagen, Date fechaFin) {
        this.idFormacion = idFormacion;
        this.institucion = institucion;
        this.carrera = carrera;
        this.urlImagen = urlImagen;
        this.fechaFin = fechaFin;
    }
    
    

}
