package Boletín3;

import java.util.Arrays;
import java.util.Objects;

public class Partida {
	private String nombreJuego;
	private Participante[] participantes;
	private Participante ganador;

	@Override
	public String toString() {
		return "Partida [nombreJuego=" + nombreJuego + ", participantes=" + Arrays.toString(participantes)
				+ ", ganador=" + ganador + "]";

	}

	public Partida(String nombreJuego, Participante[] participantes) {
		super();
		this.nombreJuego = nombreJuego;
		this.participantes = participantes;

	}

	private int calculaJugadorGanado() {
		int puntosGanador = 0;
		for (Participante p : this.participantes) {
			if (puntosGanador <  p.getPuntuacion()) {

			}
		}
		return puntosGanador;
	}
}