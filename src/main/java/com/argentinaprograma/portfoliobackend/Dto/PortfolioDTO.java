/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.portfoliobackend.Dto;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author gonza
 */
@Getter @Setter
public class PortfolioDTO {
    
    private PersonaDTO persona;
    private List<ContactoDTO> contacto;
    private List<ExperienciaDTO> experiencia;
    private List<FormacionDTO> formacion;
    private List<HabilidadDTO> habilidad;
    private List<ProyectoDTO> proyecto;

    public PortfolioDTO() {
    }

    public PortfolioDTO(PersonaDTO persona, List<ContactoDTO> contacto, List<ExperienciaDTO> experiencia, List<FormacionDTO> formacion, List<HabilidadDTO> habilidad, List<ProyectoDTO> proyecto) {
        this.persona = persona;
        this.contacto = contacto;
        this.experiencia = experiencia;
        this.formacion = formacion;
        this.habilidad = habilidad;
        this.proyecto = proyecto;
    }
    
    
    
}
