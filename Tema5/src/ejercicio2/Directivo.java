package ejercicio2;

/**
 * Representa a un directivo que es una extensión de un empleado.
 */
public class Directivo extends Empleado {

	/**
	 * Crea una instancia de Directivo con el nombre especificado.
	 *
	 * @param nombre El nombre del directivo.
	 */
	Directivo(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Devuelve una representación en formato de cadena del directivo, que incluye
	 * la representación en formato de cadena del empleado y la cadena " ->
	 * Directivo".
	 *
	 * @return La representación en formato de cadena del directivo.
	 */
	public String toString() {
		return super.toString() + " -> Directivo";
	}
}
