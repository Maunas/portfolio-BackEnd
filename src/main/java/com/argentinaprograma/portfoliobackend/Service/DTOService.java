/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.portfoliobackend.Service;

import com.argentinaprograma.portfoliobackend.Dto.*;
import com.argentinaprograma.portfoliobackend.Model.*;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author gonza
 */
@Service
public class DTOService {

    //Encargado de conversiones entre Model y DTO
    
    public PortfolioDTO crearDTOPortfolio(
            Persona pers,
            List<Experiencia> exp,
            List<Formacion> form,
            List<Habilidad> skill,
            List<Contacto> cont,
            List<Proyecto> proy) {

        return new PortfolioDTO(
                crearDTOPersona(pers),
                crearDTOContacto(cont),
                crearDTOExperiencia(exp),
                crearDTOFormacion(form),
                crearDTOHabilidad(skill),
                crearDTOProyecto(proy)
        );
    }

    public PersonaDTO crearDTOPersona(Persona pers){

        PersonaDTO persDto = new PersonaDTO();
        persDto.setIdPersona(pers.getIdPersona());
        persDto.setNombreCompleto(pers.getNombreCompleto());
        persDto.setDescripcion(pers.getDescripcion());
        persDto.setNacimiento(pers.getNacimiento());
        persDto.setProfesion(pers.getProfesion());
        persDto.setUrlFoto(pers.getUrlFoto());
        persDto.setUrlBanner(pers.getUrlBanner());
        return persDto;
    }

    public List<ExperienciaDTO> crearDTOExperiencia(List<Experiencia> exp) {
        List<ExperienciaDTO> listaExpDto = new ArrayList<>();
        for (Experiencia experiencia : exp) {
            ExperienciaDTO expDto = new ExperienciaDTO();
            expDto.setIdExperiencia(experiencia.getIdExperiencia());
            expDto.setPuesto(experiencia.getPuesto());
            expDto.setInstitucion(experiencia.getInstitucion());
            expDto.setUrlImagen(experiencia.getUrlImagen());
            expDto.setFechaDesde(experiencia.getFechaDesde());
            expDto.setFechaHasta(experiencia.getFechaHasta());
            listaExpDto.add(expDto);
        }
        return listaExpDto;
    }

    public List<FormacionDTO> crearDTOFormacion(List<Formacion> form) {
        List<FormacionDTO> listaFormDto = new ArrayList<>();
        for (Formacion formacion : form) {
            FormacionDTO formDto = new FormacionDTO();
            formDto.setIdFormacion(formacion.getIdFormacion());
            formDto.setCarrera(formacion.getCarrera());
            formDto.setInstitucion(formacion.getInstitucion());
            formDto.setUrlImagen(formacion.getUrlImagen());
            formDto.setFechaFin(formacion.getFechaFin());
            listaFormDto.add(formDto);
        }
        return listaFormDto;
    }

    public List<HabilidadDTO> crearDTOHabilidad(List<Habilidad> skill) {
        List<HabilidadDTO> listaSkillDto = new ArrayList<>();
        for (Habilidad habilidad : skill) {
            HabilidadDTO skillDto = new HabilidadDTO();
            skillDto.setIdHabilidad(habilidad.getIdHabilidad());
            skillDto.setNombreHabilidad(habilidad.getNombreHabilidad());
            skillDto.setValorMax(habilidad.getValorMax());
            skillDto.setNivelHabilidad(habilidad.getNivelHabilidad());
            skillDto.setTipoSkill(habilidad.getTipoSkill());
            listaSkillDto.add(skillDto);
        }
        return listaSkillDto;
    }

    public List<ContactoDTO> crearDTOContacto(List<Contacto> cont) {
        List<ContactoDTO> listaContDto = new ArrayList<>();
        for (Contacto contacto : cont) {
            ContactoDTO contDto = new ContactoDTO();
            contDto.setId(contacto.getIdContacto());
            contDto.setNombreContacto(contacto.getNombreContacto());
            contDto.setUrlContacto(contacto.getUrlContacto());
            listaContDto.add(contDto);
        }
        return listaContDto;
    }

    public List<ProyectoDTO> crearDTOProyecto(List<Proyecto> proy) {
        List<ProyectoDTO> listaProyDto = new ArrayList<>();
        for (Proyecto proyecto : proy) {
            ProyectoDTO proyDto = new ProyectoDTO();
            proyDto.setIdProyecto(proyecto.getIdProyecto());
            proyDto.setTituloProyecto(proyecto.getTituloProyecto());
            proyDto.setDescripcion(proyecto.getDescripcion());
            proyDto.setUrlProyecto(proyecto.getUrlProyecto());
            listaProyDto.add(proyDto);
        }
        return listaProyDto;
    }

    public Persona recuperarPersona(Persona persona, PersonaDTO persDto){
        persona.setNombreCompleto(persDto.getNombreCompleto());
        persona.setDescripcion(persDto.getDescripcion());
        persona.setNacimiento(persDto.getNacimiento());
        persona.setProfesion(persDto.getProfesion());
        persona.setUrlFoto(persDto.getUrlFoto());
        persona.setUrlBanner(persDto.getUrlBanner());
        return persona;
    }

    public Experiencia recuperarExperiencia(Experiencia exp, ExperienciaDTO expDto) {
        exp.setPuesto(expDto.getPuesto());
        exp.setInstitucion(expDto.getInstitucion());
        exp.setUrlImagen(expDto.getUrlImagen());
        exp.setFechaDesde(expDto.getFechaDesde());
        exp.setFechaHasta(expDto.getFechaHasta());
        return exp;
    }

    public Formacion recuperarFormacion(Formacion form, FormacionDTO formDto) {
        form.setCarrera(formDto.getCarrera());
        form.setInstitucion(formDto.getInstitucion());
        form.setUrlImagen(formDto.getUrlImagen());
        form.setFechaFin(formDto.getFechaFin());
        return form;
    }

    public Habilidad recuperarHabilidad(Habilidad skill, HabilidadDTO skillDto) {
        skill.setNombreHabilidad(skillDto.getNombreHabilidad());
        skill.setValorMax(skillDto.getValorMax());
        skill.setNivelHabilidad(skillDto.getNivelHabilidad());
        skill.setTipoSkill(skillDto.getTipoSkill());
        return skill;
    }

    public Proyecto recuperarProyecto(Proyecto proy, ProyectoDTO proyCont) {
        proy.setTituloProyecto(proyCont.getTituloProyecto());
        proy.setDescripcion(proyCont.getDescripcion());
        proy.setUrlProyecto(proyCont.getUrlProyecto());
        return proy;
    }

    public Contacto recuperarContacto(Contacto cont, ContactoDTO contDto) {
        cont.setNombreContacto(contDto.getNombreContacto());
        cont.setUrlContacto(contDto.getUrlContacto());
        return cont;
    }
    
}
