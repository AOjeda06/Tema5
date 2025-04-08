package ejanalisis.ej3;

import java.util.HashSet;

/**
 * Representa una cuenta bancaria con un número de cuenta, saldo y titulares
 * asociados. Implementa la interfaz Comparable para permitir el orden por
 * número de cuenta en orden ascendente.
 */
public class CuentaBancaria implements Comparable<CuentaBancaria> {

	/**
	 * El número único de la cuenta bancaria.
	 */
	private int numeroCuenta;

	/**
	 * El saldo actual de la cuenta bancaria.
	 */
	private double saldo;

	/**
	 * Conjunto de titulares asociados a la cuenta. Permite un máximo inicial
	 * sugerido de 3 titulares.
	 */
	private HashSet<Titular> titulares = new HashSet<>(3);

	/**
	 * Constructor para inicializar una cuenta bancaria.
	 *
	 * @param numeroCuenta El número único de la cuenta bancaria.
	 * @param saldo        El saldo inicial de la cuenta.
	 * @param titular      El titular principal de la cuenta.
	 * 
	 * @throws InvalidBalanceException Si el saldo introducido es negativo, se
	 *                                 lanzará una excepción
	 */
	public CuentaBancaria(int numeroCuenta, double saldo, Titular titular) throws InvalidBalanceException {

		if (saldo < 0) {
			throw new InvalidBalanceException();
		}

		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.titulares.add(titular);
	}

	/**
	 * Obtiene el número de cuenta bancaria.
	 *
	 * @return El número de cuenta.
	 */
	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	/**
	 * Obtiene el saldo actual de la cuenta.
	 *
	 * @return El saldo de la cuenta.
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Muestra los titulares asociados a la cuenta.
	 */
	public void mostrarTitulares() {
		for (Titular elemento : titulares) {
			System.out.println(elemento);
		}
	}

	/**
	 * Ingresa una cantidad de dinero en la cuenta.
	 *
	 * @param cant La cantidad a ingresar.
	 */
	public void ingresar(double cant) {
		saldo += cant;
	}

	/**
	 * Retira una cantidad de dinero de la cuenta, si es posible.
	 *
	 * @param cant La cantidad a retirar.
	 * @throws IllegalArgumentException Si el saldo no es suficiente.
	 */
	public void retirar(double cant) {
		if (cant > saldo) {
			throw new IllegalArgumentException("Saldo insuficiente para retirar la cantidad solicitada.");
		}
		saldo -= cant;
	}

	/**
	 * Añade un nuevo titular a la cuenta.
	 *
	 * @param nuevoTitular El titular a añadir.
	 * @return true si el titular fue añadido, false si ya existe.
	 */
	public boolean añadirTitular(Titular nuevoTitular) {
		if (titulares.size() >= 3) {
			System.out.println("No se pueden añadir más de 3 titulares.");
			return false;
		}
		return titulares.add(nuevoTitular);
	}

	/**
	 * Elimina un titular de la cuenta.
	 *
	 * @param borrarTitular El titular a eliminar.
	 * @return true si el titular fue eliminado, false si no existe.
	 */
	public boolean eliminarTitular(Titular borrarTitular) {
		return titulares.remove(borrarTitular);
	}

	/**
	 * Compara esta cuenta bancaria con otra en base al número de cuenta.
	 *
	 * @param otraCuenta La otra cuenta bancaria a comparar.
	 * @return Un valor negativo, cero o positivo según el orden ascendente por
	 *         número de cuenta.
	 */
	@Override
	public int compareTo(CuentaBancaria otraCuenta) {
		return Integer.compare(this.numeroCuenta, otraCuenta.numeroCuenta);
	}
}
