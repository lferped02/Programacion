package Orientacion_persona;

import java.util.Arrays;

public class Equipo {
	String nombreEquipo;
	int[] puntucaciones;
	Persona[] personas;

	public Equipo(String nombreEquipo, int[] puntucaciones, Persona[] personas) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.puntucaciones = puntucaciones;
		this.personas = personas;
	}

	@Override
	public String toString() {
		return "Equipo [nombreEquipo=" + nombreEquipo + ", puntucaciones=" + Arrays.toString(puntucaciones)
				+ ", personas=" + Arrays.toString(personas) + "]";
	}

	float calculaMedia() {
		float mediaEdad = 0f;
		Persona[] tablaPersona = this.personas;
		for (Persona p : tablaPersona) {

		}
		int edad = 0;
		mediaEdad = edad / tablaPersona.length;

		return mediaEdad;

	}

}
