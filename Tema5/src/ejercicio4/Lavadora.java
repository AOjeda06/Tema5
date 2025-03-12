package ejercicio4;

/**
 * Clase que representa una lavadora, que es un tipo de electrodoméstico.
 */
public class Lavadora extends Electrodomestico {

	private double carga = 5;

	/**
	 * Constructor que inicializa el precio y el peso de la lavadora.
	 * 
	 * @param precio El precio base de la lavadora.
	 * @param peso   El peso de la lavadora.
	 */
	public Lavadora(double precio, double peso) {
		super(precio, peso);
	}

	/**
	 * Constructor que inicializa el precio, el peso, el color, el consumo y la
	 * carga de la lavadora.
	 * 
	 * @param precio  El precio base de la lavadora.
	 * @param peso    El peso de la lavadora.
	 * @param color   El color de la lavadora.
	 * @param consumo El consumo energético de la lavadora.
	 * @param carga   La carga específica de la lavadora.
	 */
	public Lavadora(double precio, double peso, String color, char consumo, double carga) {
		super(precio, peso, color, consumo);
		this.carga = carga;
	}

	/**
	 * Método para obtener la carga de la lavadora.
	 * 
	 * @return La carga de la lavadora.
	 */
	public double getCarga() {
		return carga;
	}

	/**
	 * Método para calcular el precio final de la lavadora, basado en su consumo
	 * energético, peso y carga.
	 */
	public void precioFinal() {
		super.precioFinal();

		if (this.carga > 30) {
			this.setPrecioBase(this.getPrecioBase() + 50);
		}
	}
}
