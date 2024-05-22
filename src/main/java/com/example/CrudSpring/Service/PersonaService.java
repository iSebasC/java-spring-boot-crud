package com.example.CrudSpring.Service;

import com.example.CrudSpring.Entity.Persona;

import java.util.List;

public interface PersonaService {

    public List<Persona> ConsultarPersona();

    public Persona CrearPersona(Persona persona);

    public Persona ModificarPersona(Persona persona);

    public Persona BuscarPersona(int id);

    public void EliminarPersona(int id);

}
