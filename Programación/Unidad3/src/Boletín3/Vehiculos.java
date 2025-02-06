package Boletín3;

public class Vehiculos {
	String marca;
	String modelo;
	int añoDefabricacion;
	String tipoCombustible;
	int capacidadTotal;
	int capacidadCombustibleActual;
	float consumoMedioLitrosPor100kms;

	public Vehiculos(String marca, String modelo, int añoDefabricacion, String tipoCombustible, int capacidadTotal,
			int capacidadCombustibleActual, float consumoMedioLitrosPor100kms) {
		this.marca = marca;
		this.modelo = modelo;
		this.añoDefabricacion = añoDefabricacion;
		this.tipoCombustible = tipoCombustible;
		this.capacidadTotal = capacidadTotal;
		this.capacidadCombustibleActual = capacidadCombustibleActual;
		this.consumoMedioLitrosPor100kms = consumoMedioLitrosPor100kms;

	}

	@Override
	public String toString() {
		return "Vehiculos [marca=" + marca + ", modelo=" + modelo + ", añoDefabricacion=" + añoDefabricacion
				+ ", tipoCombustible=" + tipoCombustible + ", capacidadTotal=" + capacidadTotal
				+ ", capacidadCombustibleActual=" + capacidadCombustibleActual + "]";
	}

	float calculaConsumo(float kms) {
		float consumo = (kms * consumoMedioLitrosPor100kms);
		System.out.println("Tiene un consumo medio de" + consumo);
		return consumo;
	}

	boolean hayQueRepostar() {
		return false;

	}
}
