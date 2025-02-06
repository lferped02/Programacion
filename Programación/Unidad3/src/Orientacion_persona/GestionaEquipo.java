package Orientacion_persona;

public class GestionaEquipo {

	public static void main(String[] args) {
		Persona p = new Persona("Andrea", "Perea", "12345678C", 22);
		Persona p2 = new Persona("Luis", "Torres", "12345679D", 20);
		Persona p3 = new Persona("Sofía", "Pedrosa", "22345678F", 30);
		Persona p4 = new Persona("David", "Rodríguez", "28145678L", 21);

		Persona[] personas1 = { p, p2 };
		Persona[] personas2 = { p3, p4 };
		int[] puntuaciones1 = { 7, 14, 22 };
		int[] puntuaciones2 = { 40, 12, 3 };

		Equipo equipo = new Equipo("Equipo", puntuaciones1, personas1);
		System.out.println(equipo);
		Persona[] tablaPersonas = equipo.personas;
		for (int i = 0; i < tablaPersonas.length; i++) {
			Persona p1 = tablaPersonas[i];
			System.out.println(p1.dni);
		}

		Equipo equipo2 = new Equipo("Equipo", puntuaciones2, personas2);

	}

}
