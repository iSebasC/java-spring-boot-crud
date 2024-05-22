package com.example.CrudSpring.Service.PersonaServiceIMPL;

import com.example.CrudSpring.Entity.Persona;
import com.example.CrudSpring.Repository.PersonaRepo;
import com.example.CrudSpring.Service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PSIMPL implements PersonaService {

    @Autowired
    private PersonaRepo repo;

    @Override
    public List<Persona> ConsultarPersona() {
        return (List<Persona>) this.repo.findAll();
    }

    @Override
    public Persona CrearPersona(Persona persona) {
        persona.setCorreo(persona.getCorreo());
        return this.repo.save(persona);
    }

    @Override
    public Persona ModificarPersona(Persona persona) {
        return this.repo.save(persona);
    }

    @Override
    public Persona BuscarPersona(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void EliminarPersona(int id) {
        this.repo.deleteById(id);
    }
}
