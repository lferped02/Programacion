package Boletín2;

public class GestionaGato {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		gato.comer = "Pienso";
		gato.sexo = "Macho";
		
		gato.maullar();
		gato.comer("Pienso");

		Gato gata1 = new Gato();
		gata1.comer = "Pescado";
		gata1.sexo = "Hembra";
		gata1.ronronear();
		gata1.comer("Pescado");

		Gato gata2 = new Gato();
		gata2.sexo = "Hembra";

		gato.pelear(gata1);
		gata2.pelear(gata1);
	}

}
