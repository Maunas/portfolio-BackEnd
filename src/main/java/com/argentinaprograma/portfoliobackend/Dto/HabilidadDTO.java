/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.portfoliobackend.Dto;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author gonza
 */
@Getter @Setter
public class HabilidadDTO {
    private Long idHabilidad;
    private String nombreHabilidad;
    private int valorMax;
    private int nivelHabilidad;
    private String tipoSkill;

    public HabilidadDTO() {
    }

    public HabilidadDTO(Long idHabilidad, String nombreHabilidad, int valorMax, int nivelHabilidad, String tipoSkill) {
        this.idHabilidad = idHabilidad;
        this.nombreHabilidad = nombreHabilidad;
        this.valorMax = valorMax;
        this.nivelHabilidad = nivelHabilidad;
        this.tipoSkill = tipoSkill;
    }
    
    
    
}
