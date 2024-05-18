package cl.bootcamp.modulo_6.service;

import java.util.List;

import cl.bootcamp.modulo_6.model.Persona;

public interface PersonaService {

	boolean crearPersona(Persona persona);
	Persona obtenerPorRut(String rut);
	List<Persona> obtenerListado();
	boolean eliminar(String rut);
}
