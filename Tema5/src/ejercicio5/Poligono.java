package ejercicio5;

/**
 * Clase abstracta que representa un polígono. Proporciona una estructura base
 * para definir polígonos con un número de lados y un método abstracto para
 * calcular su área.
 */
public abstract class Poligono {
	private int numeroLados;

	/**
	 * Constructor de la clase Poligono.
	 * 
	 * @param numeroLados El número de lados del polígono. Debe ser mayor a 2.
	 * @throws IllegalArgumentException Si el número de lados es menor o igual a 2.
	 */
	public Poligono(int numeroLados) {
		if (numeroLados <= 2) {
			throw new IllegalArgumentException("Numero de lados no válido.");
		}
		this.numeroLados = numeroLados;
	}

	/**
	 * Método abstracto para calcular el área del polígono. Este método debe ser
	 * implementado por las clases derivadas de Poligono.
	 * 
	 * @return El área del polígono.
	 */
	public abstract double area();

	/**
	 * Obtiene el número de lados del polígono.
	 * 
	 * @return El número de lados del polígono.
	 */
	public int getNumeroLados() {
		return numeroLados;
	}

	/**
	 * Representación en forma de cadena del polígono.
	 * 
	 * @return Una cadena que describe el número de lados del polígono.
	 */
	public String toString() {
		return "Lados: " + numeroLados;
	}
}
