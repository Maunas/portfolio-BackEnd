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
public class TipoSkillDTO {
    private Long idTipoSkill;
    private String nombreTipoSkill;

    public TipoSkillDTO() {
    }

    public TipoSkillDTO(Long idTipoSkill, String nombreTipoSkill) {
        this.idTipoSkill = idTipoSkill;
        this.nombreTipoSkill = nombreTipoSkill;
    }
    
}
