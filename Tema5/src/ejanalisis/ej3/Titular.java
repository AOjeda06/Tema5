package ejanalisis.ej3;

import java.util.Objects;

/**
 * Representa a un titular de una cuenta bancaria. Implementa la interfaz
 * Comparable para ordenar por defecto los titulares por DNI en orden
 * ascendente.
 */
public class Titular implements Comparable<Titular> {
	/**
	 * DNI del titular, usado como identificador único.
	 */
	private String dni;

	/**
	 * Nombre del titular.
	 */
	private String nombre;

	/**
	 * Apellidos del titular.
	 */
	private String apellidos;

	/**
	 * Número de teléfono del titular.
	 */
	private int telefono;

	/**
	 * Constructor para inicializar un titular con sus datos personales.
	 *
	 * @param dni       El DNI del titular.
	 * @param nombre    El nombre del titular.
	 * @param apellidos Los apellidos del titular.
	 * @param telefono  El número de teléfono del titular.
	 */
	public Titular(String dni, String nombre, String apellidos, int telefono) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
	}

	/**
	 * Obtiene el DNI del titular.
	 *
	 * @return El DNI del titular.
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Obtiene el nombre del titular.
	 *
	 * @return El nombre del titular.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Obtiene los apellidos del titular.
	 *
	 * @return Los apellidos del titular.
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Obtiene el número de teléfono del titular.
	 *
	 * @return El número de teléfono del titular.
	 */
	public int getTelefono() {
		return telefono;
	}

	/**
	 * Representación en forma de cadena de los datos del titular.
	 *
	 * @return Una cadena con el DNI, nombre, apellidos y teléfono.
	 */
	@Override
	public String toString() {
		return "DNI: " + dni + ", NOMBRE: " + nombre + " APELLIDOS: " + apellidos + ", TELEFONO: " + telefono;
	}

	/**
	 * Genera el código hash para un titular basado en su DNI.
	 *
	 * @return El código hash del titular.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	/**
	 * Compara este titular con otro para verificar igualdad.
	 *
	 * @param obj El objeto con el que se comparará este titular.
	 * @return true si los DNIs son iguales, false en caso contrario.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Titular other = (Titular) obj;
		return Objects.equals(dni, other.dni);
	}

	/**
	 * Compara este titular con otro basado en el DNI en orden ascendente.
	 *
	 * @param otroTitular El otro titular a comparar.
	 * @return Un valor negativo, cero o positivo según el orden por DNI.
	 */
	@Override
	public int compareTo(Titular otroTitular) {
		return this.dni.compareTo(otroTitular.dni);
	}
}
