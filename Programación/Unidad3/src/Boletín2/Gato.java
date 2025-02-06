package Boletín2;

public class Gato {

	String color;
	String raza;
	String sexo;
	int edad;
	double peso;
	String comer;

	void maullar() {
		System.out.println("miuauuuuu ");
	}

	void ronronear() {
		System.out.println("rrrrr");
	}

	void comer(String comida) {
		if (comer.equals("Pescado")) {
			System.out.println("Yummy Yummy");

		} else {
			System.out.println("buahhh, mejor no");

		}
	}

	void pelear(Gato g) {
		if (sexo.equals(g.sexo)) {
			System.out.println("Ven aquí que te vas a enterar");
		} else {
			System.out.println("La violencia nunca es la solución");
		}
	}

}
