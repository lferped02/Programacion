package Boletín3;

public class CuentaBancaria {
	private double saldo;
	private String numeroCuenta;
	private Persona titular;
	private Persona autorizado;

	public CuentaBancaria(double saldo, String numeroCuenta, Persona titular) {
		super();
		this.saldo = saldo;
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		this.autorizado = null;
	}

	public double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	public Persona getAutorizado() {
		return autorizado;
	}

	public void setAutorizado(Persona autorizado) {
		this.autorizado = autorizado;
	}

	private boolean validacionImportePositivo(double importe) {
		return importe > 0;

	}

	private boolean validacionAutorizado(String dni) {
		return dni != null && dni.equals(autorizado.getDni());
	}

	public void ingresarDinero(Persona personaGestion, double ingreso) {
		if (validacionAutorizado(personaGestion.getDni()) && validacionImportePositivo(ingreso)) {
			setSaldo(getSaldo() + ingreso);

		} else {
			System.out.println("ERROR: No es autorizado o ingreso incorrecto.");
		}

	}

	public void retiradaDinero(Persona personaGestion, double reintegro) {
		if (validacionAutorizado(personaGestion.getDni()) && validacionImportePositivo(reintegro)
				&& getSaldo() >= reintegro) {
		} else {
			System.out.println("ERROR: No es autorizado o ingreso incorrecto.");
		}
	}

	public void eliminarAutorizado(String dni) {
		if (validacionAutorizado(dni)) {
			autorizado = null;
		} else {
			System.out.println("ERROR: La persona no está como autorizada");
		}
	}
}
