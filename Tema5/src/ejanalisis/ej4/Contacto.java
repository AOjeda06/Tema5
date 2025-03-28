package ejanalisis.ej4;

import java.util.Objects;

/**
 * Representa un contacto con un nombre y un número de teléfono.
 */
public class Contacto {

	/**
	 * Nombre del contacto.
	 */
	private String nombre;

	/**
	 * Número de teléfono del contacto.
	 */
	private int telefono;

	/**
	 * Constructor para inicializar un contacto con un nombre y un número de
	 * teléfono.
	 *
	 * @param nombre   El nombre del contacto.
	 * @param telefono El número de teléfono del contacto.
	 */
	public Contacto(String nombre, int telefono) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
	}

	/**
	 * Obtiene el nombre del contacto.
	 *
	 * @return El nombre del contacto.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Obtiene el número de teléfono del contacto.
	 *
	 * @return El número de teléfono del contacto.
	 */
	public int getTelefono() {
		return telefono;
	}

	/**
	 * Calcula el código hash del objeto Contacto basado en su nombre.
	 *
	 * @return El código hash del contacto.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	/**
	 * Compara este contacto con otro objeto para verificar si son iguales. Dos
	 * contactos se consideran iguales si tienen el mismo nombre.
	 *
	 * @param obj El objeto a comparar.
	 * @return true si los contactos tienen el mismo nombre, false en caso
	 *         contrario.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		return Objects.equals(nombre, other.nombre);
	}

	/**
	 * Representa el objeto Contacto como una cadena de texto.
	 *
	 * @return Una cadena que contiene el nombre y el número de teléfono del
	 *         contacto.
	 */
	@Override
	public String toString() {
		return "Contacto [Nombre: " + nombre + ", Teléfono: " + telefono + "]";
	}
}
