/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.portfoliobackend.Controller;

import com.argentinaprograma.portfoliobackend.Dto.*;
import com.argentinaprograma.portfoliobackend.Exceptions.NotFoundException;
import com.argentinaprograma.portfoliobackend.Exceptions.ValidationException;
import com.argentinaprograma.portfoliobackend.Service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin
@RestController
public class PortfolioController {

    @Autowired
    private PortfolioService portServ;

    @GetMapping("/portfolio")
    @ResponseBody
    public PortfolioDTO obtenerPortfolio() throws NotFoundException, Exception {
        return portServ.obtenerPortfolio();
    }

    //Recuperación de los datos para el apartado de modificar
    //Aseguro que, de entrar al enlace sin autenticar no pueda ver los datos
    @GetMapping("/portfolio/edit")
    @ResponseBody
    public PortfolioDTO modificarPortfolio() throws ValidationException, NotFoundException, Exception {
        return portServ.obtenerPortfolio();
    }
    
    @PutMapping("/portfolio/edit/persona/modificar")
    public PersonaDTO modificarPersona(@RequestBody PersonaDTO per) throws ValidationException, NotFoundException, Exception {
        return portServ.modificarPersona(per);
    }

    @PutMapping("/portfolio/edit/experiencia/modificar")
    public ExperienciaDTO modificarExperiencia(@RequestBody ExperienciaDTO exp) throws ValidationException, NotFoundException, Exception {
        return portServ.modificarExperiencia(exp);
    }

    @PutMapping("/portfolio/edit/formacion/modificar")
    public FormacionDTO modificarFormacion(@RequestBody FormacionDTO form) throws ValidationException, NotFoundException, Exception {
        return portServ.modificarFormacion(form);
    }

    @PutMapping("/portfolio/edit/habilidad/modificar")
    public HabilidadDTO modificarHabilidad(@RequestBody HabilidadDTO skill) throws ValidationException, NotFoundException, Exception {
        return portServ.modificarHabilidad(skill);
    }

    @PutMapping("/portfolio/edit/proyecto/modificar")
    public ProyectoDTO modificarProyecto(@RequestBody ProyectoDTO proy) throws ValidationException, NotFoundException, Exception {
        return portServ.modificarProyecto(proy);
    }

    @PutMapping("/portfolio/edit/contacto/modificar")
    public ContactoDTO modificarContacto(@RequestBody ContactoDTO cont) throws ValidationException, NotFoundException, Exception {
        return portServ.modificarContacto(cont);
    }

    @PostMapping("/portfolio/edit/experiencia/crear")
    public ExperienciaDTO crearExperiencia(@RequestBody ExperienciaDTO exp) throws ValidationException, Exception {
        return portServ.crearExperiencia(exp);
    }

    @PostMapping("/portfolio/edit/formacion/crear")
    public FormacionDTO crearFormacion(@RequestBody FormacionDTO form) throws ValidationException, Exception {
        return portServ.crearFormacion(form);
    }

    @PostMapping("/portfolio/edit/habilidad/crear")
    public HabilidadDTO crearHabilidad(@RequestBody HabilidadDTO skill) throws ValidationException, Exception {
        return portServ.crearHabilidad(skill);
    }

    @PostMapping("/portfolio/edit/proyecto/crear")
    public ProyectoDTO crearProyecto(@RequestBody ProyectoDTO proy) throws ValidationException, Exception {
        return portServ.crearProyecto(proy);
    }

    @PostMapping("/portfolio/edit/contacto/crear")
    public ContactoDTO crearContacto(@RequestBody ContactoDTO cont) throws ValidationException, Exception {
        return portServ.crearContacto(cont);
    }
    
    @PostMapping("/portfolio/edit/persona/crear")
    public PersonaDTO crearPersona(@RequestBody PersonaDTO per) throws ValidationException, Exception {
        return portServ.crearPersona(per);
    }
    
    @DeleteMapping("/portfolio/edit/experiencia/eliminar/{id}")
    public ResponseEntity<String> eliminarExperiencia(@PathVariable Long id) throws NotFoundException, Exception {
        return ResponseEntity.status(HttpStatus.OK).body("{\"resultado\": \"" + portServ.eliminarExperiencia(id) + "\"}");
    }

    @DeleteMapping("/portfolio/edit/formacion/eliminar/{id}")
    public ResponseEntity<String> eliminarFormacion(@PathVariable Long id) throws NotFoundException, Exception {
        return ResponseEntity.status(HttpStatus.OK).body("{\"resultado\": \"" + portServ.eliminarFormacion(id) + "\"}");
    }

    @DeleteMapping("/portfolio/edit/habilidad/eliminar/{id}")
    public ResponseEntity<String> eliminarHabilidad(@PathVariable Long id) throws NotFoundException, Exception {
        return ResponseEntity.status(HttpStatus.OK).body("{\"resultado\": \"" + portServ.eliminarHabilidad(id) + "\"}");
    }

    @DeleteMapping("/portfolio/edit/proyecto/eliminar/{id}")
    public ResponseEntity<String> eliminarProyecto(@PathVariable Long id) throws NotFoundException, Exception {
        return ResponseEntity.status(HttpStatus.OK).body("{\"resultado\": \"" + portServ.eliminarProyecto(id) + "\"}");
    }

    @DeleteMapping("/portfolio/edit/contacto/eliminar/{id}")
    public ResponseEntity<String>  eliminarContacto(@PathVariable Long id) throws NotFoundException, Exception {
        return ResponseEntity.status(HttpStatus.OK).body("{\"resultado\": \"" + portServ.eliminarContacto(id) + "\"}");
    }
    
}
