/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.portfoliobackend.Dto;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author gonza
 */
@Getter @Setter
public class ContactoDTO {
    private Long id;
    private String nombreContacto;
    private String urlContacto;

    public ContactoDTO() {
    }

    public ContactoDTO(Long id, String nombreContacto, String urlContacto) {
        this.id = id;
        this.nombreContacto = nombreContacto;
        this.urlContacto = urlContacto;
    }
    
    
}
