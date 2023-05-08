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
public class ProyectoDTO {
    private Long idProyecto;
    private int ordenProyecto;
    private String tituloProyecto;
    private String urlProyecto;
    private String descripcion;

    public ProyectoDTO() {
    }

    public ProyectoDTO(Long idProyecto, int ordenProyecto, String tituloProyecto, String urlProyecto, String descripcion) {
        this.idProyecto = idProyecto;
        this.ordenProyecto = ordenProyecto;
        this.tituloProyecto = tituloProyecto;
        this.urlProyecto = urlProyecto;
        this.descripcion = descripcion;
    }
    
}
