package ejanalisis.ej3;

/**
 * Excepción lanzada cuando se detecta un saldo inválido. Esta excepción forma
 * parte de las validaciones en el sistema para garantizar que los saldos en
 * cuentas bancarias cumplan con los valores permitidos.
 */
@SuppressWarnings("serial")
public class InvalidBalanceException extends Exception {

	/**
	 * Constructor por defecto que lanza un mensaje estándar indicando que el saldo
	 * proporcionado es inválido.
	 */
	public InvalidBalanceException() {
		super("El saldo proporcionado es inválido.");
	}

	/**
	 * Constructor que permite especificar un mensaje personalizado para la
	 * excepción.
	 *
	 * @param message El mensaje de error que describe la causa de la excepción.
	 */
	public InvalidBalanceException(String message) {
		super(message);
	}
}
