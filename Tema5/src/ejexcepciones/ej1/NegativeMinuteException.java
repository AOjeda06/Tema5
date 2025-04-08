package ejexcepciones.ej1;

/**
 * Excepción lanzada cuando se introduce un valor negativo para los minutos.
 * Esta excepción forma parte de las validaciones de la clase Hora, garantizando
 * que los valores de tiempo sean correctos.
 */
@SuppressWarnings("serial")
public class NegativeMinuteException extends Exception {

	/**
	 * Constructor por defecto que lanza un mensaje estándar indicando que los
	 * minutos no pueden ser negativos.
	 */
	public NegativeMinuteException() {
		super("Los minutos no pueden ser negativos.");
	}

	/**
	 * Constructor que permite especificar un mensaje personalizado para la
	 * excepción.
	 *
	 * @param message El mensaje de error que describe la causa de la excepción.
	 */
	public NegativeMinuteException(String message) {
		super(message);
	}
}
