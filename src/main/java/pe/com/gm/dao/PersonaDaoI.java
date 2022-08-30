/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.gm.dao;

import org.springframework.data.repository.CrudRepository;
import pe.com.gm.domain.Persona;

/**
 *
 * @author Piero
 */
public interface PersonaDaoI extends CrudRepository<Persona, Long>{
    
}
