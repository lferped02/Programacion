package Boletín3;

import java.time.LocalDate;

public class Persona {
	private String dni;
	private String nombre, apellidos;
	private LocalDate fechaDeNacimiento;

	public Persona(String dni, String nombre, String apellidos, LocalDate fechaDeNacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

}
