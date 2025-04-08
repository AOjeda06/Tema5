package ejexcepciones.ej3;

/**
 * Excepción lanzada cuando la cantidad en stock no es válida. Esta excepción
 * garantiza que los valores de la cantidad en stock sean correctos, evitando
 * que se asignen valores negativos que puedan provocar inconsistencias en el
 * sistema.
 */
@SuppressWarnings("serial")
public class InvalidStockException extends Exception {

	/**
	 * Constructor por defecto que lanza un mensaje estándar indicando que la
	 * cantidad en stock no puede ser negativa.
	 */
	public InvalidStockException() {
		super("La cantidad en stock no puede ser negativa.");
	}

	/**
	 * Constructor que permite especificar un mensaje personalizado para la
	 * excepción.
	 *
	 * @param message El mensaje de error que describe la causa de la excepción.
	 */
	public InvalidStockException(String message) {
		super(message);
	}
}
