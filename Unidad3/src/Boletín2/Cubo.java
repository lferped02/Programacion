package Boletín2;

public class Cubo {
	int lado;
	float litroContiene;
	float capacidadMaxima;

	public Cubo(int lado, float litroContiene) {
		this.lado = lado;
		this.litroContiene = litroContiene;
		this.capacidadMaxima = calculaVolumen();
	}

	@Override
	public String toString() {
		return "Cubo [lado=" + lado + ", litroContiene=" + litroContiene + ", capacidadMaxima=" + capacidadMaxima + "]";
	}

	float calculaArea() {
		float areaTotal = 6 * lado * lado;
		return areaTotal;
	}

	float calculaVolumen() {
		float volumen = lado * lado * lado;
		return volumen;

	}

	boolean vaciar(float litrosASacar) {
		boolean vacia = true;
		if (litrosASacar > litroContiene) {

		} else {
			litroContiene = litroContiene - litrosASacar;
		}
		return vacia;

	}

	boolean rellenar(float litrosAMeter) {
		boolean rellena = false;
		if (litrosAMeter > litroContiene) {

		} else {
			litroContiene = litroContiene - litrosAMeter;
		}
		return rellena;

	}

}
