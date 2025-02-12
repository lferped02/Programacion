package Boletín2;

public class Alumno {
	String nombre;
	String apellidos;
	String email;
	NotaAsignatura notaProgramacion;
	NotaAsignatura notaBase;

	public Alumno(String nombre, String email) {
		super();
		this.nombre = nombre;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", Nota Programacion="
				+ notaProgramacion + "Nota Base=" + notaBase + "]";

	}

	void imprimeSiHaAprobado(String nombre) {
		
		if (nombre.equals("Programacion")) {

			if (this.notaProgramacion.calculamedia() >= 5) {
				System.out.println(
						"El nombre del alumno es:" + nombre + " ha aprobado la asignatura" + this.notaProgramacion);
			} else {
				System.out.println(
						"El nombre del alumno es:" + nombre + " no ha aprobado la asignatura" + this.notaProgramacion);
			}
		}

	}

}
