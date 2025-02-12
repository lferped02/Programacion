package Herencia2;

public class GestionaJuego {

	public static void main(String[] args) {
		Villano villano = new Villano("Villano", 1, 100, null);
		Caballero caballero = new Caballero("Caballero", 1, 100, "Espada");
		Arquero arquero = new Arquero("Arquero", 1, 100, "flecha");
		Mago mago = new Mago("Mago", 1, 100, "magia");
		
		System.out.println(villano.getArma());
		System.out.println(caballero.getArma());
		System.out.println(arquero.getArma());
		System.out.println(mago.getArma());
		
		System.out.println(caballero.esAtacado(arquero, 120));
		System.out.println(caballero.esAtacado(caballero, 50));
		System.out.println(mago.esAtacado(villano));
	}

}
