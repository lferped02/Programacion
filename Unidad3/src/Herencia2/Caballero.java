package Herencia2;

public class Caballero extends Personaje {

	protected Caballero(String nombre, int nivel, int puntosVida) {
		super(nombre, nivel, puntosVida, "Espada");
	}

	public boolean esAtacado(Personaje atacante) {
		if (atacante instanceof Arquero) {
			return false;
		}
		if (atacante instanceof Mago) {
			return true;
		}
		return false;
	}

	public boolean esAtacado(Personaje atacante, int distancia) {
		if (atacante instanceof Arquero && distancia > 100) {
			return true;
		}
		if (atacante instanceof Mago) {
			return true;
		}
		return false;

	}
}
