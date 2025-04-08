package ejanalisis.ej3;

import java.util.ArrayList;

/**
 * Representa una cuenta corriente con características adicionales como cuota de
 * transacción y registro de transacciones.
 */
public class CuentaCorriente extends CuentaBancaria {

	/**
	 * Cuota aplicada por cada transacción realizada.
	 */
	private double cuotaTransaccion;

	/**
	 * Lista de transacciones realizadas en la cuenta.
	 */
	private ArrayList<Transaccion> transacciones = new ArrayList<>();

	/**
	 * Constructor para inicializar una cuenta corriente con las propiedades de la
	 * cuenta bancaria y características específicas de la cuenta corriente.
	 *
	 * @param numeroCuenta     El número único de la cuenta bancaria.
	 * @param saldo            El saldo inicial de la cuenta.
	 * @param titular          El titular principal de la cuenta.
	 * @param cuotaTransaccion La cuota aplicada por cada transacción.
	 * @throws InvalidBalanceException
	 */
	public CuentaCorriente(int numeroCuenta, double saldo, Titular titular, double cuotaTransaccion)
			throws InvalidBalanceException {
		super(numeroCuenta, saldo, titular);
		this.cuotaTransaccion = cuotaTransaccion;
	}

	/**
	 * Obtiene la cuota de transacción de la cuenta.
	 *
	 * @return La cuota de transacción.
	 */
	public double getCuotaTransaccion() {
		return cuotaTransaccion;
	}

	/**
	 * Muestra todas las transacciones realizadas en la cuenta.
	 */
	public void getTransacciones() {
		for (Transaccion elemento : transacciones) {
			System.out.println(elemento);
		}
	}

	/**
	 * Obtiene el número total de transacciones realizadas.
	 *
	 * @return El número de transacciones.
	 */
	public int getNumeroTransacciones() {
		return transacciones.size();
	}

	/**
	 * Realiza una transacción en la cuenta, añadiéndola al registro de
	 * transacciones.
	 *
	 * @param transaccion La transacción que se va a realizar.
	 * @throws IllegalArgumentException Si el saldo no es suficiente para cubrir el
	 *                                  importe y la cuota de transacción.
	 */
	public void transaccion(Transaccion transaccion) {
		double totalTransaccion = transaccion.getImporte() + cuotaTransaccion;

		if (super.getSaldo() < totalTransaccion) {
			throw new IllegalArgumentException("Saldo insuficiente para realizar la transacción.");
		}

		super.retirar(totalTransaccion); // Actualiza el saldo descontando la transacción y la cuota.
		transacciones.add(transaccion); // Añade la transacción al registro.
	}

	/**
	 * Configura una domiciliación, descontando automáticamente el importe de la
	 * cuenta según un periodo preestablecido.
	 *
	 * @param transaccion La transacción que representa la domiciliación.
	 * @throws IllegalArgumentException Si el saldo no es suficiente para cubrir el
	 *                                  importe y la cuota de transacción.
	 */
	public void domiciliacion(Transaccion transaccion) {
		double totalDomiciliacion = transaccion.getImporte() + cuotaTransaccion;

		if (super.getSaldo() < totalDomiciliacion) {
			throw new IllegalArgumentException("Saldo insuficiente para realizar la domiciliación.");
		}

		super.retirar(totalDomiciliacion); // Actualiza el saldo.
		transacciones.add(transaccion); // Añade la domiciliación al registro como una transacción.
	}
}
