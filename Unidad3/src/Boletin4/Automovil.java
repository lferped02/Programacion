package Boletin4;

public class Automovil {
	public Automovil(String dueno, int numeroPuertas, int numeroRuedas) {
		super();
		this.calificacionEcologica = null;
	}

	private CalificacionEco calificacionEcologica = CalificacionEco.ECO;

	private enum CalificacionEco {
		ECO, O, B, C;
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

	public int getNumeroRuedas() {
		return numrtoRuedas;
	}

	public void setNumeroRuedas(int numeroRuedas) {
		this.numrtoRuedas = numrtoRuedas;
	}

}
