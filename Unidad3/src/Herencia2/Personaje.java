package Herencia2;

public class Personaje {
	private String nombre;
	private int nivel;
	private int puntosVida;
	private String arma;

	public Personaje(String nombre, int nivel, int puntosVida, String arma) {
		super();
		this.nombre = nombre;
		this.nivel = nivel;
		this.puntosVida = puntosVida;
		this.arma = arma;
	}

	protected String getArma() {
		return arma;
	}

	protected void setArma(String arma) {
		this.arma = arma;
	}

	public boolean esAtacado(Personaje atacante) {
		return false;
	}

	public boolean esAtacado(Personaje atacante, int distancia) {
		return false;
	}

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", nivel=" + nivel + ", puntosVida=" + puntosVida + ", arma=" + arma
				+ "]";
	}

}
