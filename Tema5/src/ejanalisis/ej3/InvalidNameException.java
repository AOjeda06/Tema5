package ejanalisis.ej3;

/**
 * Excepción lanzada cuando se detecta un nombre inválido. Esta excepción forma
 * parte de las validaciones en el sistema, garantizando que los nombres cumplen
 * con los requisitos especificados.
 */
@SuppressWarnings("serial")
public class InvalidNameException extends Exception {

	/**
	 * Constructor por defecto que lanza un mensaje estándar indicando que el nombre
	 * proporcionado es inválido.
	 */
	public InvalidNameException() {
		super("El nombre proporcionado es inválido.");
	}

	/**
	 * Constructor que permite especificar un mensaje personalizado para la
	 * excepción.
	 *
	 * @param message El mensaje de error que describe la causa de la excepción.
	 */
	public InvalidNameException(String message) {
		super(message);
	}
}
