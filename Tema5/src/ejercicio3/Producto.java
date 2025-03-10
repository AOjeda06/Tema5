package ejercicio3;

/**
 * Representa un producto con un nombre y un precio.
 */
public class Producto {
	private String nombre;
	private double precio;

	/**
	 * Crea una instancia de Producto con el nombre y el precio especificados.
	 *
	 * @param nombre El nombre del producto.
	 * @param precio El precio del producto.
	 */
	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	/**
	 * Obtiene el nombre del producto.
	 *
	 * @return El nombre del producto.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del producto.
	 *
	 * @param nombre El nuevo nombre del producto.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el precio del producto.
	 *
	 * @return El precio del producto.
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Establece el precio del producto.
	 *
	 * @param precio El nuevo precio del producto.
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * Calcula el costo total de una cantidad especificada de este producto.
	 *
	 * @param cant La cantidad de producto.
	 * @return El costo total de la cantidad especificada de producto.
	 */
	public double calcular(int cant) {
		return cant * precio;
	}
}
