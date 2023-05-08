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

    public PortfolioDTO crearDTOPortfolio(
            Persona pers,
            List<Experiencia> exp,
            List<Formacion> form,
            List<Habilidad> skill,
            List<Contacto> cont,
            List<Proyecto> proy,
            List<TipoSkill> tSkill) {

        return new PortfolioDTO(
                crearDTOPersona(pers),
                crearDTOContacto(cont),
                crearDTOExperiencia(exp),
                crearDTOFormacion(form),
                crearDTOHabilidad(skill),
                crearDTOProyecto(proy),
                crearDTOTipoSkill(tSkill)
        );
    }

    public PersonaDTO crearDTOPersona(Persona pers) {

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
            skillDto.setTipoSkill(habilidad.getTipoSkill().getNombreTipoSkill());
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
            proyDto.setOrdenProyecto(proyecto.getOrdenProyecto());
            proyDto.setTituloProyecto(proyecto.getTituloProyecto());
            proyDto.setDescripcion(proyecto.getDescripcion());
            proyDto.setUrlProyecto(proyecto.getUrlProyecto());
            listaProyDto.add(proyDto);
        }
        return listaProyDto;
    }

    public List<TipoSkillDTO> crearDTOTipoSkill(List<TipoSkill> tSkill) {
        List<TipoSkillDTO> listaTSkillDto = new ArrayList<>();
        for (TipoSkill tipoSkill : tSkill) {
            TipoSkillDTO tSkillDto = new TipoSkillDTO();
            tSkillDto.setIdTipoSkill(tipoSkill.getIdTipoSkill());
            tSkillDto.setNombreTipoSkill(tipoSkill.getNombreTipoSkill());
            listaTSkillDto.add(tSkillDto);
        }
        return listaTSkillDto;
    }
}
