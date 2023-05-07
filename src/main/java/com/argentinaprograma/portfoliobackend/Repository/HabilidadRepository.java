/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.argentinaprograma.portfoliobackend.Repository;

import com.argentinaprograma.portfoliobackend.Model.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author gonza
 */
public interface HabilidadRepository extends JpaRepository<Habilidad, Long> {
    
}
