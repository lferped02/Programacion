package Boletin4;

public class Automovil {
	private String dueno;
	private int numeroPuertas;
	private int numrtoRuedas;
	private String calificacionEcologica;

	public Automovil (String dueno, int numeroPuertas, int numrtoRuedas) {
		super();
		this.dueno = dueno;
		this.numeroPuertas = numeroPuertas;
		this.numrtoRuedas = numrtoRuedas;
		this.calificacionEcologica = null;
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

}
