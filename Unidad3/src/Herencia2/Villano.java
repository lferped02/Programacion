package Herencia2;

public class Villano extends Personaje {
	public Villano(String nombre, int nivel, int puntosVida, String arma) {
		super(nombre, nivel, puntosVida, arma);
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
