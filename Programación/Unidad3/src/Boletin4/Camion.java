package Boletin4;

public class Camion {
	private String dueno;
	private int numeroPuertas;
	private int numrtoRuedas;
	private int tonelajeKilos;
	private int numeroPasajero;
	private int numeroEjes;

	public Camion(String dueno, int numeroPuertas, int numrtoRuedas, int tonelajeKilos, int numeroPasajero,
			int numeroEjes) {
		super();
		this.dueno = dueno;
		this.numeroPuertas = numeroPuertas;
		this.numrtoRuedas = numrtoRuedas;
		this.tonelajeKilos = tonelajeKilos;
		this.numeroPasajero = numeroPasajero;
		this.numeroEjes = numeroEjes;
	}

	@Override
	public String toString() {
		return "Camion [dueno=" + dueno + ", numeroPuertas=" + numeroPuertas + ", numrtoRuedas=" + numrtoRuedas
				+ ", tonelajeKilos=" + tonelajeKilos + ", numeroPasajero=" + numeroPasajero + ", numeroEjes="
				+ numeroEjes + "]";
	}

	public String getDueno() {
		return dueno;
	}

	public void setDueno(String dueno) {
		this.dueno = dueno;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public int getNumrtoRuedas() {
		return numrtoRuedas;
	}

	public void setNumrtoRuedas(int numrtoRuedas) {
		this.numrtoRuedas = numrtoRuedas;
	}

	public int getTonelajeKilos() {
		return tonelajeKilos;
	}

	public void setTonelajeKilos(int tonelajeKilos) {
		this.tonelajeKilos = tonelajeKilos;
	}

	public int getNumeroPasajero() {
		return numeroPasajero;
	}

	public void setNumeroPasajero(int numeroPasajero) {
		this.numeroPasajero = numeroPasajero;
	}

	public int getNumeroEjes() {
		return numeroEjes;
	}

	public void setNumeroEjes(int numeroEjes) {
		this.numeroEjes = numeroEjes;
	}

}
