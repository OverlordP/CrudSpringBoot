/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.gm.services;

import java.util.List;
import pe.com.gm.domain.Persona;

/**
 *
 * @author Piero
 */
public interface PersonaServices {
    public List<Persona> listarPersonas();
    public void borrarPersona(Persona persona);
    public void guardarPersona(Persona persona);
    public Persona buscarPersona(Persona persona);
}
