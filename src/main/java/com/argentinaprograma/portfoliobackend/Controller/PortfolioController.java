/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.portfoliobackend.Controller;

import com.argentinaprograma.portfoliobackend.Dto.PortfolioDTO;
import com.argentinaprograma.portfoliobackend.Service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gonza
 */
@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class PortfolioController {
    
    @Autowired private PortfolioService portServ;
    
    @GetMapping("/portfolio")
    public PortfolioDTO obtenerPortfolio(){
        return portServ.obtenerPortfolio();
    }
    
}
