package Conductor;

import java.util.Objects;

public class Conductor {
	private String nombre;
	private int anioExperiencia;

	protected Conductor(String nombre, int anioExperiencia) {
		super();
		this.nombre = nombre;
		// this.anioExperiencia = anioExperiencia;
		setAnioExperiencia(anioExperiencia);
	}

	public void conducir() {
		System.out.println(nombre + "conduciendo");
	}

	protected String getNombre() {
		return nombre;

	}

	protected int getAnioExperiencia() {
		return anioExperiencia;
	}

	protected void setAnioExperiencia(int anioExperiencia) {
		if (anioExperiencia > 0) {
			this.anioExperiencia = anioExperiencia;
		} else {
			this.anioExperiencia = 0;
		}
	}

	protected void setnombre(String nombre) {
		if (nombre.equals(nombre)) {

		}
	}

	@Override
	public String toString() {
		return "Conductor [nombre=" + nombre + ", anioExperiencia=" + anioExperiencia + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(anioExperiencia, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conductor other = (Conductor) obj;
		return anioExperiencia == other.anioExperiencia && Objects.equals(nombre, other.nombre);
	}

}
