/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.portfoliobackend.Service;


import com.argentinaprograma.portfoliobackend.Dto.*;
import com.argentinaprograma.portfoliobackend.Model.*;
import com.argentinaprograma.portfoliobackend.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gonza
 */
@Service
public class PortfolioService {
    
    @Autowired private PersonaRepository persRepo;
    @Autowired private ExperienciaRepository expRepo;
    @Autowired private FormacionRepository formRepo;
    @Autowired private HabilidadRepository skillRepo;
    @Autowired private ContactoRepository contRepo;
    @Autowired private ProyectoRepository proyRepo;
    @Autowired private TipoSkillRepository tSkillRepo;
    
    @Autowired private DTOService dtoServ;

    public PortfolioDTO obtenerPortfolio() {
        return dtoServ.crearDTOPortfolio(
                persRepo.findAll().get(0),
                expRepo.findAll(),
                formRepo.findAll(),
                skillRepo.findAll(),
                contRepo.findAll(),
                proyRepo.findAll(),
                tSkillRepo.findAll()
        );
    }

    public PersonaDTO modificarPersona(Long id, PersonaDTO nuevoPers) {
        
        Persona persona = persRepo.findById(id).orElse(null);
        
        persona.setNombreCompleto(nuevoPers.getNombreCompleto());
        persona.setDescripcion(nuevoPers.getDescripcion());
        persona.setNacimiento(nuevoPers.getNacimiento());
        persona.setProfesion(nuevoPers.getProfesion());
        persona.setUrlFoto(nuevoPers.getUrlFoto());
        persona.setUrlBanner(nuevoPers.getUrlBanner());
        persRepo.save(persona);
        return nuevoPers;
    }
    
    
}
