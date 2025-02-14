package Boletin4;

public class Automovil {
	public Automovil(String dueno, int numeroPuertas, int numeroRuedas, CalificacionEco calificacionEcologica) {
		super();
		setCalificacionEcologica(calificacionEcologica);
	}

	private CalificacionEco calificacionEcologica = CalificacionEco.ECO;

	private enum CalificacionEco {
		ECO, O, B, C;
	}

	public String CalificacionEco

	getcalificacionEcologica() {
		return calificacionEcologica;
	}

	public void setcalificacionEcologica(CalificacionEco getcalificacionEcologica) {
		if (calificacionEcologica.equals(calificacionEco:ECO || calificacionEcologica.equals(calificacionEco:0))
				||calificacionEcologica.equals(calificacionEco:B ||calificacionEcologica.equals(calificacionEco:C{
			
		
			this.getcalificacionEcologica = getcalificacionEcologica;
	 }
}