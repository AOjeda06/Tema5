package ejercicio2;

/**
 * Representa a un empleado con un nombre.
 */
public class Empleado {
	private String nombre;

	/**
	 * Crea una instancia de Empleado con el nombre especificado.
	 *
	 * @param nombre El nombre del empleado.
	 * @throws IllegalArgumentException Si el nombre es vacío o solo contiene
	 *                                  espacios en blanco.
	 */
	Empleado(String nombre) {
		if (nombre.isBlank() || nombre.isEmpty()) {
			throw new IllegalArgumentException("Nombre no válido");
		}
		this.nombre = nombre;
	}

	/**
	 * Obtiene el nombre del empleado.
	 *
	 * @return El nombre del empleado.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del empleado.
	 *
	 * @param nombre El nuevo nombre del empleado.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve una representación en formato de cadena del empleado.
	 *
	 * @return La representación en formato de cadena del empleado.
	 */
	public String toString() {
		return "Empleado " + nombre;
	}
}
