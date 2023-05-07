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
public class TipoSkill {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idTipoSkill;
    private String nombreTipoSkill;

    public TipoSkill() {
    }

    public TipoSkill(Long idTipoSkill, String nombreTipoSkill) {
        this.idTipoSkill = idTipoSkill;
        this.nombreTipoSkill = nombreTipoSkill;
    }
    
    
    
}
