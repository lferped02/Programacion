package Orientación_objetos_productos;

public class Producto {
	String nombre;
	int numeroUnidades;
	float precioVenta;

	String pasoCadena() {
		String cadena = "Nombre" + nombre + "numero de Unidades" + numeroUnidades + "precio de Venta" + precioVenta;
		return cadena;

	}

	boolean hayQuePedirStock() {
		boolean pedidos = false;
		if (numeroUnidades > 5) {
			pedidos = false;
		} else {
			pedidos = true;
		}
		return pedidos;
	}

	int aumentaUnidades(int aumento) {
		int unidadesAumentadas = numeroUnidades + aumento;
		return unidadesAumentadas;
	}

	String convertirCadenas() {
		String cadena = "Producto " + nombre + " numero de Unidades " + numeroUnidades + " precio de Ventas " + precioVenta;
		return cadena;
	}
}
