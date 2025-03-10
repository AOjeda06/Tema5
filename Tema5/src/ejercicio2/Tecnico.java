package ejercicio2;

/**
 * Representa a un técnico que es una extensión de un operario.
 */
public class Tecnico extends Operario {

	/**
	 * Crea una instancia de Tecnico con el nombre especificado.
	 *
	 * @param nombre El nombre del técnico.
	 */
	Tecnico(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Devuelve una representación en formato de cadena del técnico, que incluye la
	 * representación en formato de cadena del operario y la cadena " -> Tecnico".
	 *
	 * @return La representación en formato de cadena del técnico.
	 */
	public String toString() {
		return super.toString() + " -> Tecnico";
	}
}
