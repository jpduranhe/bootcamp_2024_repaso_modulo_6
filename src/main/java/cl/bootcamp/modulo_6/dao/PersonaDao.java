package cl.bootcamp.modulo_6.dao;

import java.util.List;

import cl.bootcamp.modulo_6.model.Persona;

public interface PersonaDao {
	
	boolean guardar(Persona persona);
	Persona porRut(String rut);
	List<Persona> listado();
	boolean borrar(String rut);
}
