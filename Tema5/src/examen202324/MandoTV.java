package examen202324;

/**
 * Clase MandoTV que representa un mando específico para televisores. Extiende
 * la clase MandoADistancia e implementa la interfaz ModificarVolumen para
 * gestionar el volumen. Además, incluye atributos para el canal y el volumen.
 */
public class MandoTV extends MandoADistancia implements ModificarVolumen {

	/** Nivel actual del volumen del televisor. */
	private int volumen = 0;

	/** Canal actual del televisor. */
	private int canal = 0;

	/**
	 * Constructor de MandoTV.
	 * 
	 * @param modelo  Modelo del mando.
	 * @param anchoCm Ancho en centímetros.
	 * @param altoCm  Alto en centímetros.
	 * @param precio  Precio del mando.
	 */
	public MandoTV(String modelo, double anchoCm, double altoCm, double precio) {
		super(modelo, anchoCm, altoCm, precio);
	}

	/**
	 * Devuelve el canal actual del televisor.
	 * 
	 * @return Canal actual.
	 */
	public int getCanal() {
		return canal;
	}

	/**
	 * Establece el canal actual del televisor.
	 * 
	 * @param canal Nuevo canal.
	 */
	public void setCanal(int canal) {
		this.canal = canal;
	}

	/**
	 * Devuelve el nivel actual del volumen del televisor.
	 * 
	 * @return Volumen actual.
	 */
	public int getVolumen() {
		return volumen;
	}

	/**
	 * Incrementa el volumen del televisor en 10 unidades.
	 */
	@Override
	public void subirVolumen() {
		volumen += 10;
	}

	/**
	 * Disminuye el volumen del televisor en 10 unidades.
	 */
	@Override
	public void bajarVolumen() {
		volumen -= 10;
	}

	/**
	 * Devuelve una representación en forma de cadena del mando para televisor,
	 * incluyendo el modelo, dimensiones, precio, estado, volumen y canal.
	 * 
	 * @return Cadena que describe el mando para televisor.
	 */
	@Override
	public String toString() {
		return super.toString() + ", Volumen: " + volumen + ", Canal: " + canal;
	}

}
