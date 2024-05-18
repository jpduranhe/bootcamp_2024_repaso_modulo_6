package cl.bootcamp.modulo_6.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import cl.bootcamp.modulo_6.model.Persona;

public class PersonaMapper implements RowMapper<Persona> {

	@Override
	public Persona mapRow(ResultSet rs, int rowNum) throws SQLException {
		Persona persona =new Persona();
		
		persona.setRut(rs.getString("rut"));
		persona.setNombre(rs.getString("nombre"));
		persona.setApellido(rs.getString("apellido"));
		persona.setEmail(rs.getString("email"));
		return persona;
	}

}
