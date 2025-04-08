package ejexcepciones.ej1;

/**
 * Excepción lanzada cuando se introduce un valor negativo para las horas. Esta
 * excepción forma parte de las validaciones de la clase Hora, asegurando que
 * los valores de tiempo sean correctos y no negativos.
 */
@SuppressWarnings("serial")
public class NegativeHourException extends Exception {

	/**
	 * Constructor por defecto que lanza un mensaje estándar indicando que las horas
	 * no pueden ser negativas.
	 */
	public NegativeHourException() {
		super("Las horas no pueden ser negativas.");
	}

	/**
	 * Constructor que permite especificar un mensaje personalizado para la
	 * excepción.
	 *
	 * @param message El mensaje de error que describe la causa de la excepción.
	 */
	public NegativeHourException(String message) {
		super(message);
	}
}
