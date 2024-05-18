package cl.bootcamp.modulo_6.model;

public class Persona {
	
	private String rut;
	private String nombre;
	private String apellido;
	private String email;

	public Persona() {}
	
	public Persona(String rut, String nombre, String apellido, String email) {
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
