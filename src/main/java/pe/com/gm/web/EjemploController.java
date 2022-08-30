/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.gm.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.gm.dao.PersonaDaoI;
import pe.com.gm.domain.Persona;
import pe.com.gm.services.PersonaServices;
//import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Piero
 */
//user: u995095518_onlyDB
//host: sql552.main-hosting.eu
//contraseña: 7oM?psqv~!
@Controller
@Slf4j
public class EjemploController {
    @Autowired
    private PersonaServices personaService;
    //private PersonaDaoI pepito;
    
    @GetMapping("/")
    public String ejemplo(Model modelo){
             
        var personajes = personaService.listarPersonas();
        log.info("ejecutando el controlador Spring MVC");
        //var personaje2 = pepito.findAll();
        modelo.addAttribute("personaje", personajes);
        return "index";
    } 
    @GetMapping("/agregar")
    public String agregar(Persona persona){
        return "agregar";
    }
    @PostMapping("/guardar")
    public String guardar(Persona persona){
        personaService.guardarPersona(persona);
        return "redirect:/";
    }
    @GetMapping("/editar/{idpersonas}")
    public String editar(Persona persona, Model model){
        persona=personaService.buscarPersona(persona);
        model.addAttribute("persona", persona);
        return "agregar";
    }
    @GetMapping("/eliminar/{idpersonas}")
    public String eliminar(Persona persona){
        personaService.borrarPersona(persona);
        return "redirect:/";
    }
}
