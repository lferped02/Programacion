package Boletín2;

public class GestionaNotaAlumno {

	public static void main(String[] args) {
		Alumno Lucia = new Alumno("Lucia", "lucia03@gmail.com");
		NotaAsignatura notaProgramacionlucia = new NotaAsignatura("Programación", 5, 7, 3);
		NotaAsignatura notaBaselucia = new NotaAsignatura("Base", 4, 8, 6);
		Lucia.notaProgramacion = notaProgramacionlucia;
		Lucia.notaBase = notaBaselucia;
		System.out.println(Lucia);

		Alumno Vicente = new Alumno("Vicente", "vicente@gmail.com");
		NotaAsignatura notaProgramacionvicente = new NotaAsignatura("Programación", 2, 6, 4);
		NotaAsignatura notaBasevicente = new NotaAsignatura("Base", 5, 6, 9);

		Vicente.notaProgramacion = notaProgramacionvicente;
		Vicente.notaBase = notaBasevicente;
		System.out.println(Vicente);
		
		Lucia.imprimeSiHaAprobado ("Programación");
	}

}
