package examen202324;

/**
 * Clase MandoMinicadena que representa un mando específico para una minicadena.
 * Extiende la clase MandoADistancia e implementa la interfaz ModificarVolumen
 * para gestionar el nivel de volumen.
 */
public class MandoMinicadena extends MandoADistancia implements ModificarVolumen {

	/** Nivel actual del volumen de la minicadena. */
	private int volumen = 0;

	/**
	 * Constructor de MandoMinicadena.
	 * 
	 * @param modelo  Modelo del mando.
	 * @param anchoCm Ancho en centímetros.
	 * @param altoCm  Alto en centímetros.
	 * @param precio  Precio del mando.
	 */
	public MandoMinicadena(String modelo, double anchoCm, double altoCm, double precio) {
		super(modelo, anchoCm, altoCm, precio);
	}

	/**
	 * Devuelve el nivel actual del volumen de la minicadena.
	 * 
	 * @return Volumen actual.
	 */
	public int getVolumen() {
		return volumen;
	}

	/**
	 * Incrementa el volumen de la minicadena en 5 unidades.
	 */
	@Override
	public void subirVolumen() {
		volumen += 5;
	}

	/**
	 * Disminuye el volumen de la minicadena en 5 unidades.
	 */
	@Override
	public void bajarVolumen() {
		volumen -= 5;
	}

	/**
	 * Devuelve una representación en forma de cadena del mando para minicadena,
	 * incluyendo el modelo, dimensiones, precio, estado y volumen.
	 * 
	 * @return Cadena que describe el mando para minicadena.
	 */
	@Override
	public String toString() {
		return super.toString() + ", Volumen: " + volumen;
	}

}
