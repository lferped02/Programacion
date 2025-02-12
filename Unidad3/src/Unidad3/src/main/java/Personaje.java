
public class Personaje {
	private String nombre;
	private int nivel;
	private int puntoVida;
	private String arma;

	public Personaje(String nombre, int nivel, int puntoVida, String arma) {
		super();
		this.nombre = nombre;
		this.nivel = nivel;
		this.puntoVida = puntoVida;
		this.arma = arma;
	}
	public boolean esAtacado (Personaje atacante) {
		return false;
	}
	public boolean esAtacado(Personaje atacante, int distancia) {
		return false;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected int getNivel() {
		return nivel;
	}

	protected void setNivel(int nivel) {
		this.nivel = nivel;
	}

	protected int getPuntoVida() {
		return puntoVida;
	}

	protected void setPuntoVida(int puntoVida) {
		this.puntoVida = puntoVida;
	}

	protected String getArma() {
		return arma;
	}

	protected void setArma(String arma) {
		this.arma = arma;
	}

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", nivel=" + nivel + ", puntoVida=" + puntoVida + ", arma=" + arma + "]";
	}

}
