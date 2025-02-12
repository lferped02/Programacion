package Herencia2;

public class Caballero extends Personaje {

	protected Caballero(String nombre, int nivel, int puntosVida, String arma) {
		super(nombre, nivel, puntosVida, arma);
	}

	@Override
	public String getArma() {
		return "Caballero [getArma()=" + getArma() + "]";
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
