package ejanalisis.ej3;

/**
 * Representa una transacción realizada en una cuenta bancaria. Incluye
 * información sobre la fecha, concepto y el importe asociado a la transacción.
 */
public class Transaccion {
	/**
	 * Día en el que se realizó la transacción (valor entre 1 y 31).
	 */
	private int dia;

	/**
	 * Mes en el que se realizó la transacción (valor entre 1 y 12).
	 */
	private int mes;

	/**
	 * Año en el que se realizó la transacción.
	 */
	private int año;

	/**
	 * Concepto o descripción detallada de la transacción.
	 */
	private String concepto;

	/**
	 * Importe asociado a la transacción. Este valor puede ser positivo o negativo,
	 * dependiendo del tipo de operación (ingreso o retirada).
	 */
	private double importe;

	/**
	 * Constructor para inicializar una transacción con su fecha, concepto e
	 * importe.
	 *
	 * @param dia      El día de la transacción, debe estar en el rango válido de
	 *                 días para el mes.
	 * @param mes      El mes de la transacción, debe estar entre 1 y 12.
	 * @param año      El año de la transacción.
	 * @param concepto La descripción del propósito de la transacción.
	 * @param importe  El valor de la transacción. Positivo para ingresos y negativo
	 *                 para retiradas.
	 */
	public Transaccion(int dia, int mes, int año, String concepto, double importe) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.año = año;
		this.concepto = concepto;
		this.importe = importe;
	}

	/**
	 * Obtiene el día en que se realizó la transacción.
	 *
	 * @return El día de la transacción.
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * Obtiene el mes en que se realizó la transacción.
	 *
	 * @return El mes de la transacción.
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * Obtiene el año en que se realizó la transacción.
	 *
	 * @return El año de la transacción.
	 */
	public int getAño() {
		return año;
	}

	/**
	 * Obtiene la descripción o concepto de la transacción.
	 *
	 * @return El concepto de la transacción.
	 */
	public String getConcepto() {
		return concepto;
	}

	/**
	 * Obtiene el importe asociado a la transacción.
	 *
	 * @return El importe de la transacción.
	 */
	public double getImporte() {
		return importe;
	}

	/**
	 * Genera una representación en forma de cadena de la transacción. Incluye la
	 * fecha, el concepto y el importe.
	 *
	 * @return Una cadena con la información completa de la transacción.
	 */
	@Override
	public String toString() {
		return "FECHA: " + dia + "/" + mes + "/" + año + "\nCONCEPTO: " + concepto + "\nIMPORTE: " + importe;
	}
}
