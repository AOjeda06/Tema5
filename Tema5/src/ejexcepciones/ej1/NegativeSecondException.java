package ejexcepciones.ej1;

/**
 * Excepción lanzada cuando se introduce un valor negativo para los segundos.
 * Esta excepción forma parte de las validaciones de la clase Hora, destinada a
 * garantizar que los valores temporales sean correctos.
 */
@SuppressWarnings("serial")
public class NegativeSecondException extends Exception {

	/**
	 * Constructor por defecto que lanza un mensaje estándar indicando que los
	 * segundos no pueden ser negativos.
	 */
	public NegativeSecondException() {
		super("Los segundos no pueden ser negativos.");
	}

	/**
	 * Constructor que permite especificar un mensaje personalizado para la
	 * excepción.
	 *
	 * @param message El mensaje de error que describe la causa de la excepción.
	 */
	public NegativeSecondException(String message) {
		super(message);
	}
}
