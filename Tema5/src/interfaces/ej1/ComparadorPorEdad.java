package interfaces.ej1;

import java.util.Comparator;

/**
 * Comparador para ordenar instancias de Socio en base a su edad de forma
 * descendente.
 */
public class ComparadorPorEdad implements Comparator<Socio> {

	/**
	 * Compara dos socios por su edad en orden descendente.
	 * 
	 * @param s1 El primer socio a comparar.
	 * @param s2 El segundo socio a comparar.
	 * @return Un valor negativo si el segundo socio es mayor que el primero, un
	 *         valor positivo si el primero es mayor que el segundo, y 0 si ambos
	 *         tienen la misma edad.
	 */
	@Override
	public int compare(Socio s1, Socio s2) {
		return Integer.compare(s2.getEdad(), s1.getEdad());
	}
}
