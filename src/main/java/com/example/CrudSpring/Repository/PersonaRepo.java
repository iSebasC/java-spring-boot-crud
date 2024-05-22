package com.example.CrudSpring.Repository;

import com.example.CrudSpring.Entity.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepo extends CrudRepository<Persona,Integer> {
}
