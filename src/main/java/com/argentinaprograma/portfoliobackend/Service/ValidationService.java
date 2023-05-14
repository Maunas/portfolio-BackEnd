/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.portfoliobackend.Service;

import com.argentinaprograma.portfoliobackend.Dto.ContactoDTO;
import com.argentinaprograma.portfoliobackend.Dto.ExperienciaDTO;
import com.argentinaprograma.portfoliobackend.Dto.FormacionDTO;
import com.argentinaprograma.portfoliobackend.Dto.HabilidadDTO;
import com.argentinaprograma.portfoliobackend.Dto.PersonaDTO;
import com.argentinaprograma.portfoliobackend.Dto.ProyectoDTO;
import com.argentinaprograma.portfoliobackend.Exceptions.ValidationException;
import java.util.Date;
import org.springframework.stereotype.Service;

/**
 *
 * @author gonza
 */
@Service
public class ValidationService {

    void validarPersona(PersonaDTO nuevoPers) throws ValidationException {
        if (nuevoPers.getNombreCompleto().equals("")) {
            throw new ValidationException("El nombre es un campo obligatorio.");
        }
        if (nuevoPers.getProfesion().equals("")) {
            throw new ValidationException("La ocupación es un campo obligatorio.");
        }
        if (nuevoPers.getDescripcion().equals("")) {
            throw new ValidationException("La descripción es un campo obligatorio.");
        }
        if (nuevoPers.getNacimiento() == null) {
            throw new ValidationException("La fecha de nacimiento es un campo obligatorio.");
        }
        if (nuevoPers.getNacimiento().after(new Date())) {
            throw new ValidationException("La fecha de nacimiento debe ser anterior al dia de hoy.");
        }
    }

    void validarExperiencia(ExperienciaDTO nuevaExp) throws ValidationException {
        if (nuevaExp.getPuesto().equals("")) {
            throw new ValidationException("El puesto es un campo obligatorio.");
        }
        if (nuevaExp.getInstitucion().equals("")) {
            throw new ValidationException("La institución es un campo obligatorio.");
        }
        if (nuevaExp.getFechaDesde() == null) {
            throw new ValidationException("La fecha de inicio es un campo obligatorio.");
        }
        if (nuevaExp.getFechaHasta() != null && nuevaExp.getFechaDesde().after(nuevaExp.getFechaHasta())) {
            throw new ValidationException("La fecha de inicio debe ser anterior a la fecha de fin.");
        }
        if (nuevaExp.getFechaDesde().after(new Date())) {
            throw new ValidationException("La fecha de inicio debe ser anterior al dia de hoy.");
        }

    }

    void validarFormacion(FormacionDTO nuevaForm) throws ValidationException {
        if (nuevaForm.getCarrera().equals("")) {
            throw new ValidationException("La carrera estudiada es un campo obligatorio.");
        }
        if (nuevaForm.getInstitucion().equals("")) {
            throw new ValidationException("La institución es un campo obligatorio.");
        }
        if (nuevaForm.getFechaFin() != null && nuevaForm.getFechaFin().after(new Date())) {
            throw new ValidationException("La fecha de fin debe ser anterior al dia de hoy.");
        }
    }

    void validarHabilidad(HabilidadDTO nuevaSkill) throws ValidationException {
        if (nuevaSkill.getNombreHabilidad().equals("")) {
            throw new ValidationException("El nombre es un campo obligatorio.");
        }
        if (nuevaSkill.getValorMax() <= 0) {
            throw new ValidationException("El valor máximo debe ser positivo.");
        }
        if (nuevaSkill.getNivelHabilidad() < 0) {
            throw new ValidationException("El nivel no puede ser negativo.");
        }
        if (nuevaSkill.getNivelHabilidad() > nuevaSkill.getValorMax()) {
            throw new ValidationException("El nivel no puede ser mayor al valor máximo.");
        }
        if (nuevaSkill.getTipoSkill().equals("")) {
            throw new ValidationException("Debe elegirse un tipo de skill.");
        }
    }

    void validarProyecto(ProyectoDTO nuevoProy) throws ValidationException {
        if (nuevoProy.getTituloProyecto().equals("")) {
            throw new ValidationException("El título es un campo obligatorio.");
        }
    }

    void validarContacto(ContactoDTO nuevoCont) throws ValidationException {
        if (nuevoCont.getNombreContacto().equals("")) {
            throw new ValidationException("El nombre del medio es un campo obligatorio.");
        }
        if (nuevoCont.getUrlContacto().equals("")) {
            throw new ValidationException("El enlace al medio es un campo obligatorio.");
        }
    }

}
