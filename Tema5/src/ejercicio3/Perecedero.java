package ejercicio3;

/**
 * Representa un producto perecedero, que es una extensión de un producto.
 */
public class Perecedero extends Producto {

	private int diasParaCaducar;

	/**
	 * Crea una instancia de Perecedero con el nombre, el precio y los días para
	 * caducar especificados.
	 *
	 * @param nombre          El nombre del producto perecedero.
	 * @param precio          El precio del producto perecedero.
	 * @param diasParaCaducar Los días para que el producto caduque.
	 */
	public Perecedero(String nombre, double precio, int diasParaCaducar) {
		super(nombre, precio);
		this.diasParaCaducar = diasParaCaducar;
	}

	/**
	 * Calcula el costo total de una cantidad especificada de este producto
	 * perecedero, ajustado según los días para caducar.
	 *
	 * @param cant La cantidad de producto.
	 * @return El costo total de la cantidad especificada de producto.
	 */
	@Override
	public double calcular(int cant) {
		double res = super.calcular(cant);

		if (diasParaCaducar == 1) {
			res /= 4;
		}
		if (diasParaCaducar == 2) {
			res /= 3;
		}
		if (diasParaCaducar == 3) {
			res /= 2;
		}

		return res;
	}
}
