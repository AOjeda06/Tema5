package ejanalisis.ej3;

/**
 * Representa una cuenta de ahorro que hereda de la clase CuentaBancaria. Añade
 * características como cuota de mantenimiento e interés anual.
 */
public class CuentaAhorro extends CuentaBancaria {

	/**
	 * Cuota de mantenimiento de la cuenta, aplicada periódicamente.
	 */
	private double cuotaMantenimiento;

	/**
	 * Porcentaje de interés anual aplicado al saldo de la cuenta.
	 */
	private double interesAnual;

	/**
	 * Constructor para inicializar una cuenta de ahorro con las propiedades de la
	 * cuenta bancaria y características específicas de la cuenta de ahorro.
	 *
	 * @param numeroCuenta       El número único de la cuenta bancaria.
	 * @param saldo              El saldo inicial de la cuenta.
	 * @param titular            El titular principal de la cuenta.
	 * @param cuotaMantenimiento La cuota de mantenimiento de la cuenta.
	 * @param interesAnual       El porcentaje de interés anual.
	 * @throws IllegalArgumentException Si la cuota de mantenimiento o el interés
	 *                                  anual son negativos.
	 */
	public CuentaAhorro(int numeroCuenta, double saldo, Titular titular, double cuotaMantenimiento,
			double interesAnual) {
		super(numeroCuenta, saldo, titular);

		if (cuotaMantenimiento < 0 || interesAnual < 0) {
			throw new IllegalArgumentException(
					"Cuota de mantenimiento e interés anual deben ser valores no negativos.");
		}

		this.cuotaMantenimiento = cuotaMantenimiento;
		this.interesAnual = interesAnual;
	}

	/**
	 * Obtiene la cuota de mantenimiento de la cuenta.
	 *
	 * @return La cuota de mantenimiento.
	 */
	public double getCuotaMantenimiento() {
		return cuotaMantenimiento;
	}

	/**
	 * Obtiene el porcentaje de interés anual de la cuenta.
	 *
	 * @return El porcentaje de interés anual.
	 */
	public double getInteresAnual() {
		return interesAnual;
	}

	/**
	 * Calcula el saldo de la cuenta con el interés anual aplicado.
	 *
	 * @return El saldo con el interés anual añadido.
	 */
	public double saldoConInteres() {
		return super.getSaldo() + (super.getSaldo() * (interesAnual / 100));
	}

	/**
	 * Calcula el saldo de la cuenta después de aplicar la cuota de mantenimiento.
	 *
	 * @return El saldo con la cuota de mantenimiento descontada.
	 */
	public double saldoReal() {
		return super.getSaldo() - cuotaMantenimiento;
	}
}
