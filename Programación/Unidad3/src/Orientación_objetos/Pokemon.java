package Orientación_objetos;

public class Pokemon {

	String nombre;
	int nivel;
	String tipo;

	String convierteEnCadena() {
		String cadena = "Pokemon 1: " + nombre + " nivel es: " + nivel + " tipo es: " + tipo;
		return cadena;
	}

	boolean luchar(Pokemon p2) {
		boolean gana = true;
		if (nivel > p2.nivel) {
			gana = true;
			nivel = nivel + 1;
		} else {
			gana = false;
			p2.nivel = p2.nivel;
		}
		return gana;
	}
}
