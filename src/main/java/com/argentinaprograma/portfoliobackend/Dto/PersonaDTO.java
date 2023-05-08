/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.portfoliobackend.Dto;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author gonza
 */
@Getter @Setter
public class PersonaDTO {
    private Long idPersona;
    private String nombreCompleto;
    private Date nacimiento;
    private String profesion;
    private String descripcion;
    private String urlFoto;
    private String urlBanner;

    public PersonaDTO(Long idPersona, String nombreCompleto, Date nacimiento, String profesion, String descripcion, String urlFoto, String urlBanner) {
        this.idPersona = idPersona;
        this.nombreCompleto = nombreCompleto;
        this.nacimiento = nacimiento;
        this.profesion = profesion;
        this.descripcion = descripcion;
        this.urlFoto = urlFoto;
        this.urlBanner = urlBanner;
    }

    public PersonaDTO() {
    }
    
    
}
