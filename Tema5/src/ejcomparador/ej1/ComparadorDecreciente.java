package ejcomparador.ej1;

import java.util.Comparator;

/**
 * Comparador para ordenar números enteros en sentido decreciente.
 */
public class ComparadorDecreciente implements Comparator<Integer> {

	/**
	 * Compara dos números enteros para ordenarlos en sentido decreciente.
	 * 
	 * @param n1 El primer número a comparar.
	 * @param n2 El segundo número a comparar.
	 * @return Un valor negativo si el segundo número es mayor que el primero, un
	 *         valor positivo si el primero es mayor que el segundo, y 0 si ambos
	 *         son iguales.
	 */
	@Override
	public int compare(Integer n1, Integer n2) {
		return n2 - n1; // Ordena de mayor a menor
	}
}
