/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.gm.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.gm.dao.PersonaDaoI;
import pe.com.gm.domain.Persona;

/**
 *
 * @author Piero
 */

@Service
public class PesonaServicesImpl implements PersonaServices{

    @Autowired
    private PersonaDaoI personaje;
    @Override
    @Transactional(readOnly = true)
    public List<Persona> listarPersonas() {
        return (List<Persona>)personaje.findAll();
    }

    @Override
    @Transactional
    public void borrarPersona(Persona persona) {
        personaje.delete(persona);
    }

    @Override
    @Transactional
    public void guardarPersona(Persona persona) {
        personaje.save(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public Persona buscarPersona(Persona persona) {
        return personaje.findById(persona.getIdpersonas()).orElse(null);
    }
    
}
