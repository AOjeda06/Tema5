package ejexcepciones.ej4;

/**
 * Excepción lanzada cuando el año proporcionado no es válido. Esta excepción
 * valida que el año proporcionado sea un valor no negativo.
 */
@SuppressWarnings("serial")
public class InvalidYearException extends Exception {

	/**
	 * Constructor por defecto que lanza un mensaje estándar indicando que el año
	 * proporcionado no es válido.
	 */
	public InvalidYearException() {
		super("El año proporcionado no es válido.");
	}

	/**
	 * Constructor que permite especificar un mensaje personalizado para la
	 * excepción.
	 *
	 * @param message El mensaje que describe la causa del error.
	 */
	public InvalidYearException(String message) {
		super(message);
	}
}
