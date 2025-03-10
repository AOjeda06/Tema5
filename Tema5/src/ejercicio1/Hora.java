package ejercicio1;

/**
 * Representa una hora del día con precisión de minutos.
 */
public class Hora {
	private int hora;
	private int min;

	/**
	 * Crea una instancia de Hora con la hora y los minutos especificados.
	 *
	 * @param hora La hora, debe estar entre 0 y 23.
	 * @param min  Los minutos, deben estar entre 0 y 59.
	 * @throws IllegalArgumentException Si la hora o los minutos no son válidos.
	 */
	Hora(int hora, int min) {
		if (hora < 0 || hora > 23) {
			throw new IllegalArgumentException("Hora no válida");
		}
		if (min < 0 || min > 59) {
			throw new IllegalArgumentException("Minutos no válidos");
		}
		this.hora = hora;
		this.min = min;
	}

	/**
	 * Incrementa los minutos de la hora en uno. Si los minutos llegan a 60,
	 * incrementa la hora en uno y pone los minutos a 0. Si la hora llega a 24, pone
	 * la hora a 0.
	 */
	public void inc() {
		min++;
		if (min == 60) {
			hora++;
			min = 0;
		}
		if (hora == 24) {
			hora = 0;
		}
	}

	/**
	 * Establece la hora.
	 *
	 * @param hora La nueva hora, debe estar entre 0 y 23.
	 * @return true si la hora es válida y se ha establecido, false en caso
	 *         contrario.
	 */
	public boolean setHora(int hora) {
		boolean res = true;
		if (hora < 0 || hora > 23) {
			res = false;
		}
		this.hora = hora;
		return res;
	}

	/**
	 * Establece los minutos.
	 *
	 * @param min Los nuevos minutos, deben estar entre 0 y 59.
	 * @return true si los minutos son válidos y se han establecido, false en caso
	 *         contrario.
	 */
	public boolean setMin(int min) {
		boolean res = true;
		if (min < 0 || min > 59) {
			res = false;
		}
		this.min = min;
		return res;
	}

	/**
	 * Devuelve una representación en formato de cadena de la hora en el formato
	 * "hh:mm".
	 *
	 * @return La representación en formato de cadena de la hora.
	 */
	public String toString() {
		return hora + ":" + min;
	}
}
