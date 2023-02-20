package com.mafv.agenda.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mafv.agenda.models.Contacto;
import com.mafv.agenda.services.ContactoService;

@RestController
public class ContactoController {

    @Autowired
    ContactoService contactoService;

    @GetMapping("/contactos")
    List<Contacto> all(){
        return contactoService.findAll();
    }
    
    @GetMapping("/contactos/{id}")
    Contacto findContacto(@PathVariable int id){
        return contactoService.findById(id);
    }

    @DeleteMapping("/contactos/{id}")
    void deleteContacto(@PathVariable int id){
        contactoService.deleteById(id);
    }

    @PostMapping("/contactos")
    Contacto crearContacto(@RequestBody Contacto contacto){
        contactoService.save(contacto);
        return contacto;
    }

    @PutMapping("/contactos/{id}")
    void modificarContacto(@PathVariable int id, @RequestBody Contacto contacto){
        contactoService.update(id, contacto);
    }

}
