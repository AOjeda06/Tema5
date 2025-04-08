package ejexcepciones.ej4;

/**
 * La clase Fecha representa una fecha en un formato simple con día, mes y año.
 * Garantiza que los valores proporcionados sean válidos mediante la
 * implementación de excepciones personalizadas.
 */
public class Fecha {

	/** El día de la fecha. */
	private int dia;

	/** El mes de la fecha. */
	private int mes;

	/** El año de la fecha. */
	private int ano;

	/**
	 * Construye una nueva instancia de Fecha.
	 *
	 * @param dia El día de la fecha.
	 * @param mes El mes de la fecha.
	 * @param ano El año de la fecha.
	 * @throws InvalidDayException   Si el día no es válido para el mes y año.
	 * @throws InvalidMonthException Si el mes no está dentro del rango válido
	 *                               (1-12).
	 * @throws InvalidYearException  Si el año es menor que 0.
	 */
	public Fecha(int dia, int mes, int ano) throws InvalidDayException, InvalidMonthException, InvalidYearException {
		if (mes < 1 || mes > 12) {
			throw new InvalidMonthException();
		}
		if (ano < 0) {
			throw new InvalidYearException();
		}
		if (!fechaCorrecta(dia, mes, ano)) {
			throw new InvalidDayException();
		}

		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	/**
	 * Verifica si una fecha es correcta.
	 *
	 * @param dia El día a verificar.
	 * @param mes El mes a verificar.
	 * @param ano El año a verificar.
	 * @return true si la fecha es válida, false en caso contrario.
	 */
	private boolean fechaCorrecta(int dia, int mes, int ano) {
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			return dia >= 1 && dia <= 31;
		case 4, 6, 9, 11:
			return dia >= 1 && dia <= 30;
		case 2:
			return dia >= 1 && (esBisiesto(ano) ? dia <= 29 : dia <= 28);
		default:
			return false;
		}
	}

	/**
	 * Determina si un año es bisiesto.
	 *
	 * @param ano El año a verificar.
	 * @return true si el año es bisiesto, false en caso contrario.
	 */
	private boolean esBisiesto(int ano) {
		return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
	}

	/**
	 * Devuelve una representación en cadena de la fecha.
	 *
	 * @return La fecha en el formato "día-mes-año".
	 */
	@Override
	public String toString() {
		return dia + "-" + mes + "-" + ano;
	}
}
