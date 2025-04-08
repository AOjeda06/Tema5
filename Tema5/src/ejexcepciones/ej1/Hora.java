package ejexcepciones.ej1;

/**
 * Clase que representa una hora con atributos para horas, minutos y segundos.
 * Incluye validaciones para evitar valores negativos mediante excepciones
 * personalizadas.
 */
public class Hora {
	/**
	 * Atributo que representa las horas (0-23).
	 */
	private int hora;

	/**
	 * Atributo que representa los minutos (0-59).
	 */
	private int minuto;

	/**
	 * Atributo que representa los segundos (0-59).
	 */
	private int segundo;

	/**
	 * Constructor de la clase Hora. Valida que los valores no sean negativos,
	 * lanzando excepciones personalizadas si es necesario.
	 *
	 * @param hora    Valor para las horas (0-23).
	 * @param minuto  Valor para los minutos (0-59).
	 * @param segundo Valor para los segundos (0-59).
	 * @throws NegativeHourException   Si el valor de hora es negativo.
	 * @throws NegativeMinuteException Si el valor de minuto es negativo.
	 * @throws NegativeSecondException Si el valor de segundo es negativo.
	 */
	Hora(int hora, int minuto, int segundo)
			throws NegativeHourException, NegativeMinuteException, NegativeSecondException {
		if (hora < 0) {
			throw new NegativeHourException();
		}
		if (minuto < 0) {
			throw new NegativeMinuteException();
		}
		if (segundo < 0) {
			throw new NegativeSecondException();
		}

		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	/**
	 * Establece el valor de la hora.
	 *
	 * @param hora Valor para las horas (0-23).
	 * @throws NegativeHourException Si el valor de hora es negativo.
	 */
	public void setHora(int hora) throws NegativeHourException {
		if (hora < 0) {
			throw new NegativeHourException();
		}
		this.hora = hora;
	}

	/**
	 * Establece el valor de los minutos.
	 *
	 * @param minuto Valor para los minutos (0-59).
	 * @throws NegativeMinuteException Si el valor de minuto es negativo.
	 */
	public void setMinuto(int minuto) throws NegativeMinuteException {
		if (minuto < 0) {
			throw new NegativeMinuteException();
		}
		this.minuto = minuto;
	}

	/**
	 * Establece el valor de los segundos.
	 *
	 * @param segundo Valor para los segundos (0-59).
	 * @throws NegativeSecondException Si el valor de segundo es negativo.
	 */
	public void setSegundo(int segundo) throws NegativeSecondException {
		if (segundo < 0) {
			throw new NegativeSecondException();
		}
		this.segundo = segundo;
	}

	/**
	 * Devuelve una representación en cadena de la hora actual.
	 *
	 * @return Cadena con el formato: "Hora: {hora}, Minutos: {minuto}, Segundos:
	 *         {segundo}".
	 */
	@Override
	public String toString() {
		return "Hora: " + hora + ", Minutos: " + minuto + ", Segundos: " + segundo;
	}
}
