package Herencia2;

public class Arquero extends Personaje {

	protected Arquero(String nombre, int nivel, int puntosVida) {
		super(nombre, nivel, puntosVida, "Flecha);
	}

	public boolean esAtacado(Personaje atacante) {
		if (atacante instanceof Caballero) {
			return false;
		}
		if (atacante instanceof Mago) {
			return true;
		}
		return false;
	}

	public boolean esAtacado(Personaje atacante, int distancia) {
		if (atacante instanceof Caballero && distancia <= 50) {
			return true;
		}
		if (atacante instanceof Mago) {
			return true;
		}
		return false;
	}
}
