package Conductor;

import java.util.Objects;

public class Sensor {
	private float distancia;
	private float velocidad;

	protected Sensor(float distancia, float velocidad) {
		super();
		setDistancia (distancia);
		setVelocidad(velocidad);
	}

	protected float getDistancia() {
		return distancia;
	}

	protected void setDistancia(float distancia) {
		if (distancia > 0) {
			this.distancia = distancia;
		} else {
			this.distancia = 0;
		}
	}

	protected float getVelocidad() {
		return velocidad;
	}

	protected void setVelocidad(float velocidad) {
		if (velocidad > 0) {
			this.velocidad = velocidad;
		} else {
			this.velocidad = 0;
		}
	}

	protected boolean verificarObstaculo() {
		return false;

	}

	protected boolean verificarVelocidad() {
		return false;

	}

	@Override
	public String toString() {
		return "Sensor [distancia=" + distancia + ", velocidad=" + velocidad + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(distancia, velocidad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sensor other = (Sensor) obj;
		return Float.floatToIntBits(distancia) == Float.floatToIntBits(other.distancia)
				&& Float.floatToIntBits(velocidad) == Float.floatToIntBits(other.velocidad);
	}
	

}
