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

    //Encargado del ABM
    @Autowired
    private PersonaRepository persRepo;
    @Autowired
    private ExperienciaRepository expRepo;
    @Autowired
    private FormacionRepository formRepo;
    @Autowired
    private HabilidadRepository skillRepo;
    @Autowired
    private ContactoRepository contRepo;
    @Autowired
    private ProyectoRepository proyRepo;

    @Autowired
    private DTOService dtoServ;

    public PortfolioDTO obtenerPortfolio() {
        return dtoServ.crearDTOPortfolio(
                persRepo.findAll().get(0),
                expRepo.findAll(),
                formRepo.findAll(),
                skillRepo.findAll(),
                contRepo.findAll(),
                proyRepo.findAll()
        );
    }

    public PersonaDTO modificarPersona(PersonaDTO nuevoPers) {
        //Busca por Id. Si encuentra, actualiza el resto de los datos.
        Persona persona = persRepo.findById(nuevoPers.getIdPersona()).orElse(null);

        persona = dtoServ.recuperarPersona(persona, nuevoPers);
        //Al haber id, se actualiza el registro con save()
        persRepo.save(persona);
        return nuevoPers;
    }

    public ExperienciaDTO modificarExperiencia(ExperienciaDTO nuevoExp) {

        Experiencia exp = expRepo.findById(nuevoExp.getIdExperiencia()).orElse(null);
        exp = dtoServ.recuperarExperiencia(exp, nuevoExp);
        expRepo.save(exp);
        return nuevoExp;
    }

    public FormacionDTO modificarFormacion(FormacionDTO nuevoForm) {
        Formacion form = formRepo.findById(nuevoForm.getIdFormacion()).orElse(null);

        form = dtoServ.recuperarFormacion(form, nuevoForm);
        formRepo.save(form);
        return nuevoForm;

    }

    public HabilidadDTO modificarHabilidad(HabilidadDTO nuevoSkill) {
        Habilidad skill = skillRepo.findById(nuevoSkill.getIdHabilidad()).orElse(null);

        skill = dtoServ.recuperarHabilidad(skill, nuevoSkill);
        skillRepo.save(skill);
        return nuevoSkill;
    }

    public ProyectoDTO modificarProyecto(ProyectoDTO nuevoProy) {
        Proyecto proy = proyRepo.findById(nuevoProy.getIdProyecto()).orElse(null);

        proy = dtoServ.recuperarProyecto(proy, nuevoProy);
        proyRepo.save(proy);
        return nuevoProy;
    }

    public ContactoDTO modificarContacto(ContactoDTO nuevoCont) {
        Contacto cont = contRepo.findById(nuevoCont.getId()).orElse(null);

        cont = dtoServ.recuperarContacto(cont, nuevoCont);
        contRepo.save(cont);
        return nuevoCont;
    }

    public ExperienciaDTO crearExperiencia(ExperienciaDTO nuevaExp) {
        //Crea una nueva experiencia para llenar con los datos de input, excepto el Id.
        Experiencia exp = new Experiencia();
        exp = dtoServ.recuperarExperiencia(exp, nuevaExp);
        //Al no haber id, se crea el registro con save()
        expRepo.save(exp);
        return nuevaExp;
    }

    public FormacionDTO crearFormacion(FormacionDTO formDto) {
        Formacion form = new Formacion();

        form = dtoServ.recuperarFormacion(form, formDto);
        formRepo.save(form);
        return formDto;
    }

    public HabilidadDTO crearHabilidad(HabilidadDTO skillDto) {
        Habilidad skill = new Habilidad();
        skill = dtoServ.recuperarHabilidad(skill, skillDto);
        skillRepo.save(skill);
        return skillDto;
    }

    public ProyectoDTO crearProyecto(ProyectoDTO proyDto) {
        Proyecto proy = new Proyecto();

        proy = dtoServ.recuperarProyecto(proy, proyDto);
        proyRepo.save(proy);
        return proyDto;
    }

    public ContactoDTO crearContacto(ContactoDTO contDto) {
        Contacto cont = new Contacto();

        cont = dtoServ.recuperarContacto(cont, contDto);
        contRepo.save(cont);
        return contDto;
    }

    public String eliminarExperiencia(Long id) {
        Experiencia exp = expRepo.findById(id).orElse(null);
        expRepo.delete(exp);
        //indicar si fue borrado exitoso, o enviar mensaje de error
        return "Borrado Exitoso";
    }

    public String eliminarFormacion(Long id) {
        Formacion form = formRepo.findById(id).orElse(null);
        formRepo.delete(form);
        return "Borrado Exitoso";
    }

    public String eliminarHabilidad(Long id) {
        Habilidad skill = skillRepo.findById(id).orElse(null);
        skillRepo.delete(skill);
        return "Borrado Exitoso";
    }

    public String eliminarProyecto(Long id) {
        Proyecto proy = proyRepo.findById(id).orElse(null);
        proyRepo.delete(proy);
        return "Borrado Exitoso";
    }

    public String eliminarContacto(Long id) {
        Contacto cont = contRepo.findById(id).orElse(null);
        contRepo.delete(cont);
        return "Borrado Exitoso";
    }

}
