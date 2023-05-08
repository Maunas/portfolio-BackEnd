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
public class ExperienciaDTO {
    private Long idExperiencia;
    private String puesto;
    private Date fechaDesde;
    private Date fechaHasta;
    private String institucion;
    private String urlImagen;

    public ExperienciaDTO() {
    }

    public ExperienciaDTO(Long idExperiencia, String puesto, Date fechaDesde, Date fechaHasta, String institucion, String urlImagen) {
        this.idExperiencia = idExperiencia;
        this.puesto = puesto;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.institucion = institucion;
        this.urlImagen = urlImagen;
    }
    
    
}
