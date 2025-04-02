package interfaces.ej1;

/**
 * Representa un socio con un ID único, un nombre y una edad. Implementa la
 * interfaz Comparable para comparar socios en base a su ID.
 */
public class Socio implements Comparable<Socio> {
	private int id;
	private String nombre;
	private int edad;

	/**
	 * Constructor para crear un nuevo socio.
	 * 
	 * @param id     El identificador único del socio. Debe ser mayor a 0.
	 * @param nombre El nombre del socio. No puede estar vacío ni en blanco.
	 * @param edad   La edad del socio. Debe ser mayor a 0.
	 * @throws IllegalArgumentException Si alguno de los parámetros no es válido.
	 */
	public Socio(int id, String nombre, int edad) {
		if (id <= 0) {
			throw new IllegalArgumentException("ID no válido");
		}
		if (nombre.isBlank() || nombre.isEmpty()) {
			throw new IllegalArgumentException("Nombre no válido");
		}
		if (edad <= 0) {
			throw new IllegalArgumentException("Edad no válida");
		}
		this.id = id;
		this.edad = edad;
		this.nombre = nombre;
	}

	/**
	 * Devuelve el identificador único del socio.
	 * 
	 * @return El ID del socio.
	 */
	public int getId() {
		return id;
	}

	/**
	 * Devuelve el nombre del socio.
	 * 
	 * @return El nombre del socio.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Devuelve la edad del socio.
	 * 
	 * @return La edad del socio.
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Devuelve una representación en forma de cadena del socio.
	 * 
	 * @return Una cadena que contiene el ID, el nombre y la edad del socio.
	 */
	@Override
	public String toString() {
		return id + " " + nombre + " " + edad;
	}

	/**
	 * Compara este socio con otro socio en base a su ID.
	 * 
	 * @param o El otro socio a comparar.
	 * @return -1 si este socio tiene un ID menor, 1 si tiene un ID mayor, y 0 si
	 *         los IDs son iguales.
	 */
	@Override
	public int compareTo(Socio o) {
		int res = 0;

		if (this.id < o.id) {
			res = -1;
		}
		if (this.id > o.id) {
			res = 1;
		}

		return res;
	}
}
