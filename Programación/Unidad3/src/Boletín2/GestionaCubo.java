package Boletín2;

public class GestionaCubo {

	public static void main(String[] args) {
		Cubo cubo = new Cubo(4, 0);
		System.out.println(cubo.capacidadMaxima);
		System.out.println(cubo.calculaArea());
		System.out.println(cubo.rellenar(6));
		System.out.println(cubo.vaciar(4));

	}

}
