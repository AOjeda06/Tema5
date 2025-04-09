package examen202324;

/**
 * Clase MandoAC que representa un mando específico para un aire acondicionado.
 * Extiende la clase MandoADistancia e implementa la interfaz ModificarVelocidad
 * para gestionar la velocidad de funcionamiento. Además, incluye atributos para
 * la temperatura y el modo (frío o calor).
 */
public class MandoAC extends MandoADistancia implements ModificarVelocidad {

	/** Temperatura actual configurada en el aire acondicionado. */
	private double temperatura = 20.0;

	/**
	 * Velocidad actual del aire acondicionado, representada como un nivel entre 0 y
	 * 5.
	 */
	private int velocidad = 0;

	/** Modo de funcionamiento del aire acondicionado (frío o calor). */
	private ModoTemperatura modo = ModoTemperatura.FRIO;

	/** Enumeración para los modos de temperatura: FRÍO o CALOR. */
	enum ModoTemperatura {
		FRIO, CALOR
	}

	/**
	 * Constructor de MandoAC.
	 * 
	 * @param modelo  Modelo del mando.
	 * @param anchoCm Ancho en centímetros.
	 * @param altoCm  Alto en centímetros.
	 * @param precio  Precio del mando.
	 */
	public MandoAC(String modelo, double anchoCm, double altoCm, double precio) {
		super(modelo, anchoCm, altoCm, precio);
	}

	/**
	 * Devuelve el modo actual del aire acondicionado (FRÍO o CALOR).
	 * 
	 * @return Modo actual como una cadena de texto.
	 */
	public String getModo() {
		return String.valueOf(modo);
	}

	/**
	 * Establece el modo de funcionamiento del aire acondicionado.
	 * 
	 * @param modo Nuevo modo (FRÍO o CALOR) como cadena de texto.
	 */
	public void setModo(String modo) {
		this.modo = ModoTemperatura.valueOf(modo.toUpperCase());
	}

	/**
	 * Devuelve la temperatura actual configurada en el aire acondicionado.
	 * 
	 * @return Temperatura actual.
	 */
	public double getTemperatura() {
		return temperatura;
	}

	/**
	 * Establece una nueva temperatura para el aire acondicionado.
	 * 
	 * @param temperatura Nueva temperatura.
	 */
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	/**
	 * Devuelve la velocidad actual del aire acondicionado.
	 * 
	 * @return Velocidad actual.
	 */
	public int getVelocidad() {
		return velocidad;
	}

	/**
	 * Incrementa la velocidad del aire acondicionado en un nivel, hasta un máximo
	 * de 5 niveles.
	 */
	@Override
	public void subirVelocidad() {
		if (velocidad < 5) {
			velocidad++;
		}
	}

	/**
	 * Disminuye la velocidad del aire acondicionado en un nivel, hasta un mínimo de
	 * 0 niveles.
	 */
	@Override
	public void bajarVelocidad() {
		if (velocidad > 0) {
			velocidad--;
		}
	}

	/**
	 * Devuelve una representación en forma de cadena del mando para aire
	 * acondicionado, incluyendo el modelo, dimensiones, precio, estado, velocidad,
	 * modo y temperatura.
	 * 
	 * @return Cadena que describe el mando para aire acondicionado.
	 */
	@Override
	public String toString() {
		return super.toString() + " , Velocidad: " + velocidad + ", Modo: " + String.valueOf(modo) + ", Temperatura: "
				+ temperatura;
	}
}
