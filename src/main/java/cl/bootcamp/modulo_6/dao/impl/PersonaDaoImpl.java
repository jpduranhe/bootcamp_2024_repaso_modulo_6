package cl.bootcamp.modulo_6.dao.impl;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import cl.bootcamp.modulo_6.dao.PersonaDao;
import cl.bootcamp.modulo_6.mapper.PersonaMapper;
import cl.bootcamp.modulo_6.model.Persona;

@Repository

public class PersonaDaoImpl implements PersonaDao {
	
	org.slf4j.Logger logger =LoggerFactory.getLogger(PersonaDaoImpl.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	@Override
	public boolean guardar(Persona persona) {
		try {
			
			String sql="insert into persona (rut,nombre,apellido,email) values(?,?,?,?)";
			jdbcTemplate.update(sql,persona.getRut(),
									persona.getNombre(),
									persona.getApellido(),
									persona.getEmail()
					);
			logger.info("Usuario insertado correctamente");
			return true;
		}catch (Exception ex) {
			return false;
		}
	}

	@Override
	public Persona porRut(String rut) {
		try {
			
			String sql="select rut,nombre,apellido,email from persona where rut=?";
			Persona persona=jdbcTemplate.queryForObject(sql,new PersonaMapper(),new Object[] {rut});
			
			return persona;
		}catch (Exception ex) {
			logger.error(ex.getMessage());
			return null;
		}
	}

	@Override
	public List<Persona> listado() {
try {
			
			String sql="select rut,nombre,apellido,email from persona order by rut desc";
			List<Persona> persona=jdbcTemplate.query(sql,new PersonaMapper());
			
			return persona;
		}catch (Exception ex) {
			logger.error(ex.getMessage());
			return null;
		}
	}

	@Override
	public boolean borrar(String rut) {
		try {
			
			String sql="delete from persona where rut=?";
			int filasAfectada= jdbcTemplate.update(sql,rut);
			logger.info("Usuario eliminado correctamente");
			return filasAfectada>0;
		}catch (Exception ex) {
			return false;
		}
	}

}
