package Herencia2;

public class Villano extends Personaje {
	public Villano(String nombre, int nivel, int puntosVida) {
		super(nombre, nivel, puntosVida, "");
	}

	@Override
	public String getArma() {
		return "Villano [getArma()=" + getArma() + "]";
	}

	public boolean esAtacado(Personaje atacante) {
		return true;
	}

	public boolean esAtacado(Personaje atacado, int distante) {
		return true;
	}

}
