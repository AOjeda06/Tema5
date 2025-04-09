package examen202324;

/**
 * Clase MandoAspiradora que representa un mando específico para una aspiradora.
 * Extiende la clase MandoADistancia e implementa la interfaz ModificarVelocidad
 * para gestionar la velocidad de funcionamiento.
 */
public class MandoAspiradora extends MandoADistancia implements ModificarVelocidad {

	/**
	 * Velocidad actual de la aspiradora, representada como un nivel entre 0 y 3.
	 */
	private int velocidad = 0;

	/**
	 * Constructor de MandoAspiradora.
	 * 
	 * @param modelo  Modelo del mando.
	 * @param anchoCm Ancho en centímetros.
	 * @param altoCm  Alto en centímetros.
	 * @param precio  Precio del mando.
	 */
	public MandoAspiradora(String modelo, double anchoCm, double altoCm, double precio) {
		super(modelo, anchoCm, altoCm, precio);
	}

	/**
	 * Devuelve la velocidad actual de la aspiradora.
	 * 
	 * @return Velocidad actual de la aspiradora.
	 */
	public int getVelocidad() {
		return velocidad;
	}

	/**
	 * Incrementa la velocidad de la aspiradora en un nivel, hasta un máximo de 3
	 * niveles.
	 */
	@Override
	public void subirVelocidad() {
		if (velocidad < 3) {
			velocidad++;
		}
	}

	/**
	 * Disminuye la velocidad de la aspiradora en un nivel, hasta un mínimo de 0
	 * niveles.
	 */
	@Override
	public void bajarVelocidad() {
		if (velocidad > 0) {
			velocidad--;
		}
	}

	/**
	 * Devuelve una representación en forma de cadena del mando para aspiradora,
	 * incluyendo el modelo, dimensiones, precio, estado y velocidad.
	 * 
	 * @return Cadena que describe el mando para aspiradora.
	 */
	@Override
	public String toString() {
		return super.toString() + ", Velocidad: " + velocidad;
	}

}
