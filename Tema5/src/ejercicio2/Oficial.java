package ejercicio2;

/**
 * Representa a un oficial que es una extensión de un operario.
 */
public class Oficial extends Operario {

	/**
	 * Crea una instancia de Oficial con el nombre especificado.
	 *
	 * @param nombre El nombre del oficial.
	 */
	Oficial(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Devuelve una representación en formato de cadena del oficial, que incluye la
	 * representación en formato de cadena del operario y la cadena " -> Oficial".
	 *
	 * @return La representación en formato de cadena del oficial.
	 */
	public String toString() {
		return super.toString() + " -> Oficial";
	}
}
