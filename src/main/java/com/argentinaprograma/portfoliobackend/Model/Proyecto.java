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
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idProyecto;
    private int ordenProyecto;
    private String tituloProyecto;
    private String urlProyecto;
    private String descripcion;

    public Proyecto() {
    }

    public Proyecto(Long idProyecto, int ordenProyecto, String tituloProyecto, String urlProyecto, String descripcion) {
        this.idProyecto = idProyecto;
        this.ordenProyecto = ordenProyecto;
        this.tituloProyecto = tituloProyecto;
        this.urlProyecto = urlProyecto;
        this.descripcion = descripcion;
    }
    
    
 
}
