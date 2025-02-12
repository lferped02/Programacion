package Boletin4;

public class Vehiculos {
	private String marca;
	private String modelo;
	private int año;

	public Vehiculos(String marca, String modelo, int año) {
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public void mostrarInfo() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Año: " + año);
	}

	public void mover() {
		System.out.println("El vehículo está en movimiento.");
	}

	public void frenar() {
		System.out.println("El vehículo ha frenado.");
	}

}
