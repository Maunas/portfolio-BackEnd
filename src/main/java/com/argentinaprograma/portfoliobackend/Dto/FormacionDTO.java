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
public class FormacionDTO {
    
    private Long idFormacion;
    private String institucion;
    private String carrera;
    private String urlImagen;
    private Date fechaFin;

    public FormacionDTO() {
    }

    public FormacionDTO(Long idFormacion, String institucion, String carrera, String urlImagen, Date fechaFin) {
        this.idFormacion = idFormacion;
        this.institucion = institucion;
        this.carrera = carrera;
        this.urlImagen = urlImagen;
        this.fechaFin = fechaFin;
    }
    

}
