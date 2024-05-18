package cl.bootcamp.modulo_6.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.bootcamp.modulo_6.dao.PersonaDao;
import cl.bootcamp.modulo_6.model.Persona;
import cl.bootcamp.modulo_6.service.PersonaService;


@Service
public class PersonaServiceImpl implements  PersonaService{

	@Autowired
	private PersonaDao personaDao;
	
	@Override
	public boolean crearPersona(Persona persona) {
		boolean result=personaDao.guardar(persona);
		return result;
	}

	@Override
	public Persona obtenerPorRut(String rut) {
		Persona persona=personaDao.porRut(rut);
		return persona;
	}

	@Override
	public List<Persona> obtenerListado() {
		return personaDao.listado();
	}

	@Override
	public boolean eliminar(String rut) {
		return personaDao.borrar(rut);
	}
}
