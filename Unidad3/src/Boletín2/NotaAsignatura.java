package Boletín2;

public class NotaAsignatura {
	String nombre;
	int primerTrimestre;
	int segundoTrimestre;
	int tercerTrismestre;

	public NotaAsignatura(String nombre, int primerTrimestre, int segundoTrimestre, int tercerTrismestre) {
		super();
		this.nombre = nombre;
		this.primerTrimestre = primerTrimestre;
		this.segundoTrimestre = segundoTrimestre;
		this.tercerTrismestre = tercerTrismestre;
	}

	public int calculamedia() {
		int notaMedia = ((primerTrimestre + segundoTrimestre + tercerTrismestre) / 3);
		return notaMedia;
	}

	@Override
	public String toString() {
		return "NotaAsignatura [nombre=" + nombre + ", primerTrimestre=" + primerTrimestre + ", segundoTrimestre="
				+ segundoTrimestre + ", tercerTrismestre=" + tercerTrismestre + "]";
	}

}
