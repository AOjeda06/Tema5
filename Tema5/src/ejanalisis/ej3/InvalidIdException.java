package ejanalisis.ej3;

/**
 * Excepción lanzada cuando se detecta un identificador inválido. Esta excepción
 * forma parte de las validaciones en el sistema para garantizar que los DNIs o
 * identificadores sigan un formato válido y no presenten errores.
 */
@SuppressWarnings("serial")
public class InvalidIdException extends Exception {

	/**
	 * Constructor por defecto que lanza un mensaje estándar indicando que el
	 * identificador es inválido.
	 */
	public InvalidIdException() {
		super("El identificador proporcionado es inválido.");
	}

	/**
	 * Constructor que permite especificar un mensaje personalizado para la
	 * excepción.
	 *
	 * @param message El mensaje de error que describe la causa de la excepción.
	 */
	public InvalidIdException(String message) {
		super(message);
	}
}
