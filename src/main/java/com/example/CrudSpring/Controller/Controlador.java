package com.example.CrudSpring.Controller;

import com.example.CrudSpring.Entity.Persona;
import com.example.CrudSpring.Service.PersonaServiceIMPL.PSIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("CrudRepo")
public class Controlador {

    @Autowired
    private PSIMPL ipml;

    @GetMapping
    @RequestMapping(value = "ConsutarPersonas", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarPersonas(){
        List<Persona> listaPersona=this.ipml.ConsultarPersona();
        return ResponseEntity.ok(listaPersona);
    }

    @PostMapping
    @RequestMapping(value = "CrearPersonas", method = RequestMethod.POST)
    public ResponseEntity<?> CrearPersonas(@RequestBody Persona persona){
        Persona PersonaCreada=this.ipml.CrearPersona(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(PersonaCreada);
    }

    @PutMapping
    @RequestMapping(value = "ModificarPersonas", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarPersonas(@RequestBody Persona persona){
        Persona ModificarPersona=this.ipml.ModificarPersona(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(ModificarPersona);
    }

    @GetMapping
    @RequestMapping(value = "BuscarPersona/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> BuscarPersona(@PathVariable int id){
        Persona persona=this.ipml.BuscarPersona(id);
        return ResponseEntity.ok(persona);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarPersona/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarPersona(@PathVariable int id){
        this.ipml.EliminarPersona(id);
        return ResponseEntity.ok().build();
    }

}
