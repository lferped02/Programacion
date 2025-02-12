package Boletín3;

import java.time.LocalDate;

public class GestionarBanco {

	public static void main(String[] args) {
		Persona titular = new Persona("12345678P", "José", "García", LocalDate.of(2004, 10, 12));
		Persona autorizado = new Persona("12345678P", "José", "García", LocalDate.of(2004, 10, 12));
		CuentaBancaria cuenta = new CuentaBancaria(0.0, "ES0123456789", titular);
		
		//cuenta.setSaldo(150);
		cuenta.ingresarDinero(autorizado, 100);
	}

}
