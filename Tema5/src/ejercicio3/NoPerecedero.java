package ejercicio3;

/**
 * Representa un producto no perecedero, que es una extensión de un producto.
 */
public class NoPerecedero extends Producto {

	@SuppressWarnings("unused")
	private String tipo;

	
	/**
	 * Crea una instancia de NoPerecedero con el nombre, el precio y el tipo
	 * especificados.
	 *
	 * @param nombre El nombre del producto no perecedero.
	 * @param precio El precio del producto no perecedero.
	 * @param tipo   El tipo del producto no perecedero.
	 */
	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		this.tipo = tipo;
	}

	/**
	 * Calcula el costo total de una cantidad especificada de este producto no
	 * perecedero.
	 *
	 * @param cant La cantidad de producto.
	 * @return El costo total de la cantidad especificada de producto.
	 */
	@Override
	public double calcular(int cant) {
		return super.calcular(cant);
	}
}
