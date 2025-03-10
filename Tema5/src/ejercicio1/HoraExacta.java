package ejercicio1;

/**
 * Representa una hora exacta del día con precisión de segundos.
 */
public class HoraExacta extends Hora {

	private int segs;

	/**
	 * Crea una instancia de HoraExacta con la hora, los minutos y los segundos
	 * especificados.
	 *
	 * @param hora La hora, debe estar entre 0 y 23.
	 * @param min  Los minutos, deben estar entre 0 y 59.
	 * @param segs Los segundos, deben estar entre 0 y 59.
	 * @throws IllegalArgumentException Si la hora, los minutos o los segundos no
	 *                                  son válidos.
	 */
	HoraExacta(int hora, int min, int segs) {
		super(hora, min);
		if (segs < 0 || segs > 59) {
			throw new IllegalArgumentException("Segundos no válidos");
		}
		this.segs = segs;
	}

	/**
	 * Establece los segundos.
	 *
	 * @param seg Los nuevos segundos, deben estar entre 0 y 59.
	 * @return true si los segundos son válidos y se han establecido, false en caso
	 *         contrario.
	 */
	public boolean setSeg(int seg) {
		boolean res = true;
		if (seg < 0 || seg > 59) {
			res = false;
		}
		this.segs = seg;
		return res;
	}

	/**
	 * Incrementa los segundos de la hora en uno. Si los segundos llegan a 60,
	 * incrementa los minutos en uno y pone los segundos a 0.
	 */
	public void inc() {
		segs++;
		if (segs == 60) {
			segs = 0;
			super.inc();
		}
	}

	/**
	 * Devuelve una representación en formato de cadena de la hora exacta en el
	 * formato "hh:mm:ss".
	 *
	 * @return La representación en formato de cadena de la hora exacta.
	 */
	public String toString() {
		return super.toString() + ":" + segs;
	}
}
