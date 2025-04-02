package interfaces.ej2;

import java.util.Objects;

/**
 * Representa a un futbolista con atributos como número de camiseta, nombre,
 * edad y número de goles. Implementa la interfaz Comparable para comparar
 * futbolistas en base al número de camiseta y nombre.
 */
public class Futbolista implements Comparable<Futbolista> {

	/** Número de camiseta del futbolista. */
	private int numeroCamiseta;

	/** Nombre del futbolista. */
	private String nombre;

	/** Edad del futbolista. */
	private int edad;

	/** Número de goles anotados por el futbolista. */
	private int numeroGoles;

	/**
	 * Constructor que inicializa los atributos del futbolista.
	 *
	 * @param numeroCamiseta Número de camiseta del futbolista.
	 * @param nombre         Nombre del futbolista.
	 * @param edad           Edad del futbolista.
	 * @param numeroGoles    Número de goles anotados por el futbolista.
	 */
	public Futbolista(int numeroCamiseta, String nombre, int edad, int numeroGoles) {
		super();
		this.numeroCamiseta = numeroCamiseta;
		this.nombre = nombre;
		this.edad = edad;
		this.numeroGoles = numeroGoles;
	}

	/**
	 * Obtiene el número de camiseta del futbolista.
	 *
	 * @return Número de camiseta.
	 */
	public int getNumeroCamiseta() {
		return numeroCamiseta;
	}

	/**
	 * Obtiene el nombre del futbolista.
	 *
	 * @return Nombre del futbolista.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Obtiene la edad del futbolista.
	 *
	 * @return Edad del futbolista.
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Obtiene el número de goles anotados por el futbolista.
	 *
	 * @return Número de goles anotados.
	 */
	public int getNumeroGoles() {
		return numeroGoles;
	}

	/**
	 * Calcula el código hash basado en el nombre del futbolista.
	 *
	 * @return Código hash del nombre.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	/**
	 * Compara este futbolista con otro objeto para verificar la igualdad. Se
	 * considera igual si tienen el mismo nombre y número de camiseta.
	 *
	 * @param obj Objeto a comparar.
	 * @return true si son equivalentes, false en caso contrario.
	 */
	@Override
	public boolean equals(Object obj) {
		boolean equivalentes = false;
		if (obj instanceof Futbolista) {
			Futbolista e = (Futbolista) obj;
			equivalentes = this.nombre.equals(e.nombre) && this.numeroCamiseta == e.numeroCamiseta;
		}
		return equivalentes;
	}

	/**
	 * Devuelve una representación en forma de cadena de los atributos del
	 * futbolista.
	 *
	 * @return Cadena con los atributos del futbolista.
	 */
	@Override
	public String toString() {
		return "numeroCamiseta=" + numeroCamiseta + ", nombre=" + nombre + ", edad=" + edad + ", numeroGoles="
				+ numeroGoles;
	}

	/**
	 * Compara este futbolista con otro en base al número de camiseta y, si son
	 * iguales, en base al nombre.
	 *
	 * @param o Futbolista a comparar.
	 * @return Un valor negativo, cero o positivo según el orden.
	 */
	@Override
	public int compareTo(Futbolista o) {
		int res = Integer.compare(this.numeroCamiseta, o.numeroCamiseta);
		if (res == 0) {
			res = this.nombre.compareTo(o.nombre);
		}
		return res;
	}
}
