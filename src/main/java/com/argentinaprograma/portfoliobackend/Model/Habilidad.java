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
public class Habilidad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idHabilidad;
    private String nombreHabilidad;
    private int valorMax;
    private int nivelHabilidad;
    private String tipoSkill;

    public Habilidad() {
    }

    public Habilidad(Long idHabilidad, String nombreHabilidad, int valorMax, int nivelHabilidad, String tipoSkill) {
        this.idHabilidad = idHabilidad;
        this.nombreHabilidad = nombreHabilidad;
        this.valorMax = valorMax;
        this.nivelHabilidad = nivelHabilidad;
        this.tipoSkill = tipoSkill;
    }
    
    
    
}
