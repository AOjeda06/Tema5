package ejexcepciones.ej3;

public class Articulo {
	private String nombre;
	private double precio;
	private final double IVA;
	private int cuantosQuedan;

	/**
	 * Constructor que inicializa un artículo con el nombre, precio, IVA y cantidad
	 * en stock.
	 *
	 * @param nombre        Nombre del artículo.
	 * @param precio        Precio del artículo.
	 * @param IVA           Porcentaje de IVA del artículo.
	 * @param cuantosQuedan Cantidad en stock del artículo.
	 * @throws InvalidNameException  Si el nombre es nulo o vacío.
	 * @throws InvalidPriceException Si el precio es negativo.
	 * @throws InvalidStockException Si la cantidad en stock es negativa.
	 */
	public Articulo(String nombre, double precio, double IVA, int cuantosQuedan)
			throws InvalidNameException, InvalidPriceException, InvalidStockException {
		if (nombre == null || nombre.isEmpty()) {
			throw new InvalidNameException();
		}
		if (precio < 0) {
			throw new InvalidPriceException();
		}
		if (cuantosQuedan < 0) {
			throw new InvalidStockException();
		}

		this.nombre = nombre;
		this.precio = precio;
		this.IVA = IVA >= 0 ? IVA : 21; // Por defecto, IVA del 21% si el valor dado es negativo
		this.cuantosQuedan = cuantosQuedan;
	}

	@Override
	public String toString() {
		return "Artículo: " + nombre + " - Precio: " + precio + "€ - IVA: " + IVA + "% - Quedan: " + cuantosQuedan;
	}
}
