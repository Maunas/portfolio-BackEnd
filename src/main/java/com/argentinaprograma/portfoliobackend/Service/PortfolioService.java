/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.portfoliobackend.Service;

import com.argentinaprograma.portfoliobackend.Dto.*;
import com.argentinaprograma.portfoliobackend.Exceptions.NotFoundException;
import com.argentinaprograma.portfoliobackend.Exceptions.ValidationException;
import com.argentinaprograma.portfoliobackend.Model.*;
import com.argentinaprograma.portfoliobackend.Repository.*;
import java.util.List;
import javax.transaction.Transactional;
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
    @Autowired
    private ValidationService validServ;

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

    @Transactional
    public PersonaDTO modificarPersona(PersonaDTO nuevoPers) throws NotFoundException, ValidationException, Exception {
        try {
            validServ.validarPersona(nuevoPers);
            //Busca por Id. Si encuentra, actualiza el resto de los datos.
            Persona persona = persRepo.findById(nuevoPers.getIdPersona()).orElse(null);
            if (persona == null) {
                throw new NotFoundException("No se encontró la persona");
            }
            persona = dtoServ.recuperarPersona(persona, nuevoPers);
            //Al haber id, se actualiza el registro con save()
            persRepo.save(persona);
            return nuevoPers;

        } catch (ValidationException | NotFoundException ex) {
            throw ex;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional
    public ExperienciaDTO modificarExperiencia(ExperienciaDTO nuevoExp) throws NotFoundException, ValidationException, Exception {
        try {
            validServ.validarExperiencia(nuevoExp);
            Experiencia exp = expRepo.findById(nuevoExp.getIdExperiencia()).orElse(null);
            if (exp == null) {
                throw new NotFoundException("No se encontró la experiencia.");
            }
            exp = dtoServ.recuperarExperiencia(exp, nuevoExp);
            expRepo.save(exp);
            return nuevoExp;
        } catch (ValidationException | NotFoundException ex) {
            throw ex;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional
    public FormacionDTO modificarFormacion(FormacionDTO nuevoForm) throws ValidationException, NotFoundException, Exception {
        try {
            validServ.validarFormacion(nuevoForm);
            Formacion form = formRepo.findById(nuevoForm.getIdFormacion()).orElse(null);
            if (form == null) {
                throw new NotFoundException("No se encontró la formación.");
            }
            form = dtoServ.recuperarFormacion(form, nuevoForm);
            formRepo.save(form);
            return nuevoForm;

        } catch (ValidationException | NotFoundException ex) {
            throw ex;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional
    public HabilidadDTO modificarHabilidad(HabilidadDTO nuevoSkill) throws ValidationException, NotFoundException, Exception {
        try {
            validServ.validarHabilidad(nuevoSkill);
            Habilidad skill = skillRepo.findById(nuevoSkill.getIdHabilidad()).orElse(null);
            if (skill == null) {
                throw new NotFoundException("No se encontró la habilidad.");
            }
            skill = dtoServ.recuperarHabilidad(skill, nuevoSkill);
            skillRepo.save(skill);
            return nuevoSkill;

        } catch (ValidationException | NotFoundException ex) {
            throw ex;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional
    public ProyectoDTO modificarProyecto(ProyectoDTO nuevoProy) throws ValidationException, NotFoundException, Exception {
        try {
            validServ.validarProyecto(nuevoProy);
            Proyecto proy = proyRepo.findById(nuevoProy.getIdProyecto()).orElse(null);
            if (proy == null) {
                throw new NotFoundException("No se encontró el proyecto.");
            }
            proy = dtoServ.recuperarProyecto(proy, nuevoProy);
            proyRepo.save(proy);
            return nuevoProy;

        } catch (ValidationException | NotFoundException ex) {
            throw ex;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional
    public ContactoDTO modificarContacto(ContactoDTO nuevoCont) throws ValidationException, NotFoundException, Exception {
        try {
            validServ.validarContacto(nuevoCont);
            Contacto cont = contRepo.findById(nuevoCont.getId()).orElse(null);
            if (cont == null) {
                throw new NotFoundException("No se encontró el contacto.");
            }
            cont = dtoServ.recuperarContacto(cont, nuevoCont);
            contRepo.save(cont);
            return nuevoCont;

        } catch (ValidationException | NotFoundException ex) {
            throw ex;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional
    public ExperienciaDTO crearExperiencia(ExperienciaDTO nuevaExp) throws ValidationException, Exception {
        try {
            validServ.validarExperiencia(nuevaExp);
            //Crea una nueva experiencia para llenar con los datos de input, excepto el Id.
            Experiencia exp = new Experiencia();
            exp = dtoServ.recuperarExperiencia(exp, nuevaExp);
            //Al no haber id, se crea el registro con save()
            expRepo.save(exp);
            return nuevaExp;
        } catch (ValidationException ex) {
            throw ex;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional
    public FormacionDTO crearFormacion(FormacionDTO formDto) throws ValidationException, Exception {
        try {
            validServ.validarFormacion(formDto);
            Formacion form = new Formacion();

            form = dtoServ.recuperarFormacion(form, formDto);
            formRepo.save(form);
            return formDto;
        } catch (ValidationException ex) {
            throw ex;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional
    public HabilidadDTO crearHabilidad(HabilidadDTO skillDto) throws ValidationException, Exception {
        try {
            validServ.validarHabilidad(skillDto);
            Habilidad skill = new Habilidad();
            skill = dtoServ.recuperarHabilidad(skill, skillDto);
            skillRepo.save(skill);
            return skillDto;
        } catch (ValidationException ex) {
            throw ex;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional
    public ProyectoDTO crearProyecto(ProyectoDTO proyDto) throws ValidationException, Exception {
        try {
            validServ.validarProyecto(proyDto);
            Proyecto proy = new Proyecto();

            proy = dtoServ.recuperarProyecto(proy, proyDto);
            proyRepo.save(proy);
            return proyDto;
        } catch (ValidationException ex) {
            throw ex;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional
    public ContactoDTO crearContacto(ContactoDTO contDto) throws ValidationException, Exception {
        try {
            validServ.validarContacto(contDto);
            Contacto cont = new Contacto();

            cont = dtoServ.recuperarContacto(cont, contDto);
            contRepo.save(cont);
            return contDto;
        } catch (ValidationException ex) {
            throw ex;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional
    public PersonaDTO crearPersona(PersonaDTO persDto) throws ValidationException, Exception {
        try {
            validServ.validarPersona(persDto);
            List<Persona> listaPers = persRepo.findAll();
            //Comprueba que no hayan personas guardadas
            if (!listaPers.isEmpty()) {
                throw new ValidationException("Ya existe una persona ingresada");
            }
            Persona pers = new Persona();
            pers = dtoServ.recuperarPersona(pers, persDto);
            persRepo.save(pers);
            return persDto;
        } catch (ValidationException ex) {
            throw ex;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional
    public String eliminarExperiencia(Long id) throws NotFoundException, Exception {
        try {
            Experiencia exp = expRepo.findById(id).orElse(null);
            if (exp == null) {
                throw new NotFoundException("No se encontró la experiencia.");
            }
            expRepo.delete(exp);
            //indicar si fue borrado exitoso, o enviar mensaje de error
            return "Borrado Exitoso";
        } catch (NotFoundException e) {
            throw e;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional
    public String eliminarFormacion(Long id) throws NotFoundException, Exception {
        try {
            Formacion form = formRepo.findById(id).orElse(null);
            if (form == null) {
                throw new NotFoundException("No se encontró la formación.");
            }
            formRepo.delete(form);
            return "Borrado Exitoso";
        } catch (NotFoundException e) {
            throw e;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional
    public String eliminarHabilidad(Long id) throws NotFoundException, Exception {
        try {
            Habilidad skill = skillRepo.findById(id).orElse(null);
            if (skill == null) {
                throw new NotFoundException("No se encontró la habilidad.");
            }
            skillRepo.delete(skill);
            return "Borrado Exitoso";
        } catch (NotFoundException e) {
            throw e;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional
    public String eliminarProyecto(Long id) throws NotFoundException, Exception {
        try {
            Proyecto proy = proyRepo.findById(id).orElse(null);
            if (proy == null) {
                throw new NotFoundException("No se encontró el proyecto.");
            }
            proyRepo.delete(proy);
            return "Borrado Exitoso";
        } catch (NotFoundException e) {
            throw e;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional
    public String eliminarContacto(Long id) throws NotFoundException, Exception {
        try {
            Contacto cont = contRepo.findById(id).orElse(null);
            if (cont == null) {
                throw new NotFoundException("No se encontró el contacto.");
            }
            contRepo.delete(cont);
            return "Borrado Exitoso";
        } catch (NotFoundException e) {
            throw e;
        } catch (Exception e) {
            throw e;
        }
    }

}
