package ejercicio4;

/**
 * La clase Television hereda de Electrodomestico y agrega propiedades
 * específicas para las televisiones.
 * 
 * @see Electrodomestico
 */
public class Television extends Electrodomestico {

	/** Resolución en pulgadas del televisor. */
	private double resolucion = 20;
	/** Indica si el televisor tiene sintonizador TDT. */
	private boolean sintonizadorTDT = false;

	/**
	 * Constructor para la clase Television que solo toma precio y peso.
	 * 
	 * @param precio Precio base del televisor.
	 * @param peso   Peso del televisor.
	 */
	public Television(double precio, double peso) {
		super(precio, peso);
	}

	/**
	 * Constructor completo para la clase Television.
	 * 
	 * @param precio     Precio base del televisor.
	 * @param peso       Peso del televisor.
	 * @param color      Color del televisor.
	 * @param consumo    Clase de consumo energético del televisor.
	 * @param resolucion Resolución en pulgadas del televisor.
	 * @param tdt        Indica si el televisor tiene sintonizador TDT.
	 */
	public Television(double precio, double peso, String color, char consumo, double resolucion, boolean tdt) {
		super(precio, peso, color, consumo);
		this.resolucion = resolucion;
		this.sintonizadorTDT = tdt;
	}

	/**
	 * Obtiene la resolución del televisor.
	 * 
	 * @return Resolución en pulgadas del televisor.
	 */
	public double getResolucion() {
		return resolucion;
	}

	/**
	 * Indica si el televisor tiene sintonizador TDT.
	 * 
	 * @return true si el televisor tiene sintonizador TDT, false en caso contrario.
	 */
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	/**
	 * Calcula el precio final del televisor, teniendo en cuenta las características
	 * adicionales.
	 */
	public void precioFinal() {
		super.precioFinal();

		if (this.resolucion > 40) {
			this.setPrecioBase(this.getPrecioBase() * 1.3);
		}

		if (this.sintonizadorTDT) {
			this.setPrecioBase(this.getPrecioBase() + 50);
		}
	}
}
