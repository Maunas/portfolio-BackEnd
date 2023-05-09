/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.portfoliobackend.Controller;

import com.argentinaprograma.portfoliobackend.Dto.*;
import com.argentinaprograma.portfoliobackend.Service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gonza
 */
@RestController
public class PortfolioController {

    @Autowired
    private PortfolioService portServ;

    @GetMapping("/portfolio")
    @ResponseBody
    public PortfolioDTO obtenerPortfolio() {
        return portServ.obtenerPortfolio();
    }

    @PutMapping("/portfolio/edit/persona/modificar")
    public PersonaDTO modificarPersona(@RequestBody PersonaDTO per) {
        return portServ.modificarPersona(per);
    }

    @PutMapping("/portfolio/edit/experiencia/modificar")
    public ExperienciaDTO modificarExperiencia(@RequestBody ExperienciaDTO exp) {
        return portServ.modificarExperiencia(exp);
    }

    @PutMapping("/portfolio/edit/formacion/modificar")
    public FormacionDTO modificarFormacion(@RequestBody FormacionDTO form) {
        return portServ.modificarFormacion(form);
    }

    @PutMapping("/portfolio/edit/skill/modificar")
    public HabilidadDTO modificarHabilidad(@RequestBody HabilidadDTO skill) {
        return portServ.modificarHabilidad(skill);
    }

    @PutMapping("/portfolio/edit/proyecto/modificar")
    public ProyectoDTO modificarProyecto(@RequestBody ProyectoDTO proy) {
        return portServ.modificarProyecto(proy);
    }

    @PutMapping("/portfolio/edit/contacto/modificar")
    public ContactoDTO modificarContacto(@RequestBody ContactoDTO cont) {
        return portServ.modificarContacto(cont);
    }

    @PostMapping("/portfolio/edit/experiencia/crear")
    public ExperienciaDTO crearExperiencia(@RequestBody ExperienciaDTO exp) {
        return portServ.crearExperiencia(exp);
    }

    @PostMapping("/portfolio/edit/formacion/crear")
    public FormacionDTO crearFormacion(@RequestBody FormacionDTO form) {
        return portServ.crearFormacion(form);
    }

    @PostMapping("/portfolio/edit/skill/crear")
    public HabilidadDTO crearHabilidad(@RequestBody HabilidadDTO skill) {
        return portServ.crearHabilidad(skill);
    }

    @PostMapping("/portfolio/edit/proyecto/crear")
    public ProyectoDTO crearProyecto(@RequestBody ProyectoDTO proy) {
        return portServ.crearProyecto(proy);
    }

    @PostMapping("/portfolio/edit/contacto/crear")
    public ContactoDTO crearContacto(@RequestBody ContactoDTO cont) {
        return portServ.crearContacto(cont);
    }
    
    @DeleteMapping("/portfolio/edit/experiencia/eliminar/{id}")
    public String eliminarExperiencia(@PathVariable Long id) {
        return portServ.eliminarExperiencia(id);
    }

    @DeleteMapping("/portfolio/edit/formacion/eliminar/{id}")
    public String eliminarFormacion(@PathVariable Long id) {
        return portServ.eliminarFormacion(id);
    }

    @DeleteMapping("/portfolio/edit/skill/eliminar/{id}")
    public String eliminarHabilidad(@PathVariable Long id) {
        return portServ.eliminarHabilidad(id);
    }

    @DeleteMapping("/portfolio/edit/proyecto/eliminar/{id}")
    public String eliminarProyecto(@PathVariable Long id) {
        return portServ.eliminarProyecto(id);
    }

    @DeleteMapping("/portfolio/edit/contacto/eliminar/{id}")
    public String eliminarContacto(@PathVariable Long id) {
        return portServ.eliminarContacto(id);
    }
    
}
