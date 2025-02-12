package Herencia2;

public class Mago extends Personaje {

	protected Mago(String nombre, int nivel, int puntosVida, String arma) {
		super(nombre, nivel, puntosVida, arma);
	}

	@Override
	public String getArma() {
		return "Mago [getArma()=" + getArma() + "]";
	}

	public boolean esAtacado(Personaje atacante) {
		return false;
	}

	public boolean esAtacado(Personaje atacante, int distancia) {
		return false;
	}

}
