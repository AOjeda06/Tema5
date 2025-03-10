package ejercicio2;

/**
 * Representa a un operario que es una extensión de un empleado.
 */
public class Operario extends Empleado {

	/**
	 * Crea una instancia de Operario con el nombre especificado.
	 *
	 * @param nombre El nombre del operario.
	 */
	Operario(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Devuelve una representación en formato de cadena del operario, que incluye la
	 * representación en formato de cadena del empleado y la cadena " -> Operario".
	 *
	 * @return La representación en formato de cadena del operario.
	 */
	public String toString() {
		return super.toString() + " -> Operario";
	}
}
