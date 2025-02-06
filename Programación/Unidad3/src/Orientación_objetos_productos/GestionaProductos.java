package Orientación_objetos_productos;

public class GestionaProductos {

	public static void main(String[] args) {
		Producto sacapunta = new Producto();
		sacapunta.nombre = "Sacapunta";
		sacapunta.numeroUnidades = 9;
		sacapunta.precioVenta = 1;

		boolean stock = sacapunta.hayQuePedirStock();
		System.out.println("Hay que pedir el stock " + stock);

		int aumento = sacapunta.aumentaUnidades(6);
		System.out.println(aumento);
		
		String cadenasacapunta = sacapunta.convertirCadenas();
		System.out.println (cadenasacapunta);
	}

}
