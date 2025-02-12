package Orientación_objetos_alumnos;

public class GestionaAlumnos {

	public static void main(String[] args) {
		Alumnos Alumnos1 = new Alumnos();
		Alumnos1.nombre = "Leyre";
		Alumnos1.dni = "98487512S";
		Alumnos1.nota = 3;

		Alumnos Alumnos2 = new Alumnos();
		Alumnos2.nombre = "Alvaro";
		Alumnos2.dni = "98765432L";
		Alumnos2.nota = 7;
		String cadenaLeyre = Alumnos1.pasoCadena();
		System.out.println(cadenaLeyre);
		String cadenaAlvaro = Alumnos2.pasoCadena();
		System.out.println(cadenaAlvaro);

		boolean apruebaLeyre = Alumnos1.estaAprobado();
		System.out.println(apruebaLeyre);

		boolean apruebaAlvaro = Alumnos2.estaAprobado();
		System.out.println(apruebaAlvaro);

	}

}
