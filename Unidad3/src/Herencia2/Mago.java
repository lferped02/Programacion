package Herencia2;

public class Mago extends Personaje {

	protected Mago(String nombre, int nivel, int puntosVida) {
		super(nombre, nivel, puntosVida, "Hechizo");
	}

	public boolean esAtacado(Personaje atacante) {
		return false;
	}

	public boolean esAtacado(Personaje atacante, int distancia) {
		return false;
	}

}
