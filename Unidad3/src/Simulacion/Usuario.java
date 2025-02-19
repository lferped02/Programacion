package Simulacion;

public class Usuario {
	private String nombre;
	private String dni;
	private String nombreDepartamento;

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getDni() {
		return dni;
	}

	protected void setDni(String dni) {
		this.dni = dni;
	}

	protected String getNombreDepartamento() {
		return nombreDepartamento;
	}

	protected void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}

	protected Usuario(String nombre, String dni, String nombreDepartamento) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.nombreDepartamento = nombreDepartamento;
	}

}
