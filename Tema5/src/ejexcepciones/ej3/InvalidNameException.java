package ejexcepciones.ej3;

/**
 * Excepción lanzada cuando el nombre del artículo no es válido. Esta excepción
 * se utiliza para validar que el nombre proporcionado para un artículo no sea
 * nulo ni esté vacío, garantizando datos correctos en el sistema.
 */
@SuppressWarnings("serial")
public class InvalidNameException extends Exception {

	/**
	 * Constructor por defecto que lanza un mensaje estándar indicando que el nombre
	 * del artículo no puede estar vacío.
	 */
	public InvalidNameException() {
		super("El nombre del artículo no puede estar vacío.");
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
