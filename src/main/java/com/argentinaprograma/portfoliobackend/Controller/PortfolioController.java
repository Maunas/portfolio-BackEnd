/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.portfoliobackend.Controller;

import com.argentinaprograma.portfoliobackend.Dto.*;
import com.argentinaprograma.portfoliobackend.Service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    
    @Autowired private PortfolioService portServ;
    
    @GetMapping("/portfolio")
    @ResponseBody
    public PortfolioDTO obtenerPortfolio(){
        return portServ.obtenerPortfolio();
    }
    
    @PutMapping("/portfolio/edit/persona/{id}")
    public PersonaDTO modificarPersona(@PathVariable Long id, @RequestBody PersonaDTO per){
        return portServ.modificarPersona(id, per);
    }
    
}
