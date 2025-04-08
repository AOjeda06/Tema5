package ejexcepciones.ej4;

/**
 * Excepción lanzada cuando el día proporcionado no es válido. Esta excepción
 * valida que el día proporcionado esté dentro del rango permitido según el mes
 * y el año especificado.
 */
@SuppressWarnings("serial")
public class InvalidDayException extends Exception {

	/**
	 * Constructor por defecto que lanza un mensaje estándar indicando que el día
	 * proporcionado no es válido.
	 */
	public InvalidDayException() {
		super("El día proporcionado no es válido.");
	}

	/**
	 * Constructor que permite especificar un mensaje personalizado para la
	 * excepción.
	 *
	 * @param message El mensaje que describe la causa del error.
	 */
	public InvalidDayException(String message) {
		super(message);
	}
}
