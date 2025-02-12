package Orientación_objetos;

public class GestionaPokemon {

	public static void main(String[] args) {
		Pokemon pikachu = new Pokemon();
		pikachu.nombre = "Pikachu";
		pikachu.nivel = 12;
		pikachu.tipo = "Eléctrico";

		Pokemon mew2 = new Pokemon();
		mew2.nombre = "Mewtwo";
		mew2.nivel = 20;
		mew2.tipo = "Psíquico";

//Llama a la función para imprimir toda la información de la pantalla.
		String cadenaPikachu = pikachu.convierteEnCadena();
		System.out.println(cadenaPikachu);
		String cadenaMew2 = mew2.convierteEnCadena();
		System.out.println(cadenaMew2);

//Llama a la función.
		boolean gana = pikachu.luchar(mew2);
		System.out.println("Pikachu gana a Mew2?" + gana);

//Imprime los Pokemons.
		System.out.println("Pokemon 1:" + pikachu.nombre + "nivel es:" + pikachu.nivel + "tipo es:" + pikachu.tipo);
		pikachu.nivel = pikachu.nivel + 2;
		System.out.println("Pokemon 2:" + mew2.nombre + "nivel es:" + mew2.nivel + "tipo es:" + mew2.tipo);
		System.out.println("Pokemon 2:" + mew2.nombre);

//Llama de nuevo a la función para saber si ha subido de nivel.
		String cadenaMew3 = mew2.convierteEnCadena();
		System.out.println(cadenaMew3);

	}

}
