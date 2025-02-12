package Paquete2;

public class GestionaAnimal {

	public static void main(String[] args) {
		Animal perro = new Animal();
		// perro.edad; NO visible porque es Private.
		perro.nombre = "LuLu"; // Funciona
		perro.tipo = "Perro";
		// perro.tipo; NO visible poorque tiene visibilidad por defecto y está en otro
		// paquete.
		Animal gato = new Animal();
		// perro.edad; NO visible porque es Private.
		gato.nombre = "Miura"; // Funciona
		gato.tipo = "Gato";

		boolean andar = perro.caminar();
		System.out.println(andar);
		perro.darDeComer();

		// perro.comer();
		boolean mismoTipo = perro.sonDelMismoTipo(gato);
		System.out.println(mismoTipo);

	}

}
