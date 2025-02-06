package Boletín3;

public class GestionaTorneo {

	public static void main(String[] args) {
		Participante p = new Participante("Fali", "Rafa", 20, 16);
		Participante p2 = new Participante("Mery", "María", 18, 20);
		Participante p3 = new Participante("Leo", "Leonor", 25, 30);
		Participante p4 = new Participante("Davis", "David", 24, 35);

		Participante[] participantes = { p, p2, p3, p4 };

		Partida partida1 = new Partida("Catán", p);
		
		//Este es un ejemplo para el GitHub.
	}

}
