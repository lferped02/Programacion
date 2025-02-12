package Orientación_objetos_alumnos;

public class Alumnos {
	String nombre;
	String dni;
	float nota;

	String pasoCadena() {
		String cadena = "Nombre " + nombre + " dni " + dni + " nota " + nota;
		return cadena;
	}

	boolean estaAprobado() {
		boolean aprobado = true;
		if (nota >= 6) {
			aprobado = true;
		} else {
			aprobado = false;
		}
		return aprobado;
	}
}
