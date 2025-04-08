package ejexcepciones.ej4;

/**
 * Excepción lanzada cuando el mes proporcionado no es válido. Esta excepción
 * garantiza que el mes esté dentro del rango permitido (1 a 12).
 */
@SuppressWarnings("serial")
public class InvalidMonthException extends Exception {

	/**
	 * Constructor por defecto que lanza un mensaje estándar indicando que el mes
	 * proporcionado no es válido.
	 */
	public InvalidMonthException() {
		super("El mes proporcionado no es válido.");
	}

	/**
	 * Constructor que permite especificar un mensaje personalizado para la
	 * excepción.
	 *
	 * @param message El mensaje que describe la causa del error.
	 */
	public InvalidMonthException(String message) {
		super(message);
	}
}
