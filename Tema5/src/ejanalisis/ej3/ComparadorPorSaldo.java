package ejanalisis.ej3;

import java.util.Comparator;

/**
 * Comparador para ordenar cuentas bancarias por saldo en orden descendente.
 */
public class ComparadorPorSaldo implements Comparator<CuentaBancaria> {

	/**
	 * Compara dos cuentas bancarias en base al saldo, en orden descendente.
	 *
	 * @param c1 La primera cuenta bancaria.
	 * @param c2 La segunda cuenta bancaria.
	 * @return Un valor negativo si el saldo de la primera cuenta es mayor, positivo
	 *         si es menor, y 0 si son iguales.
	 */
	@Override
	public int compare(CuentaBancaria c1, CuentaBancaria c2) {
		return Double.compare(c2.getSaldo(), c1.getSaldo());
	}
}
