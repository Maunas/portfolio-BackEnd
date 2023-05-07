/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.portfoliobackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
    @ManyToOne
    TipoSkill tipoSkill;

    public Habilidad() {
    }

    public Habilidad(Long idHabilidad, String nombreHabilidad, int valorMax, int nivelHabilidad, TipoSkill tipoSkill) {
        this.idHabilidad = idHabilidad;
        this.nombreHabilidad = nombreHabilidad;
        this.valorMax = valorMax;
        this.nivelHabilidad = nivelHabilidad;
        this.tipoSkill = tipoSkill;
    }
    
    
    
}
