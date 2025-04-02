package interfaces.ej1;

import java.util.Comparator;

/**
 * Comparador para ordenar instancias de Socio en base a sus nombres en orden
 * alfabético.
 */
public class ComparadorPorNombre implements Comparator<Socio> {

	/**
	 * Compara dos socios por sus nombres en orden alfabético.
	 * 
	 * @param s1 El primer socio a comparar.
	 * @param s2 El segundo socio a comparar.
	 * @return Un valor negativo si el nombre del primer socio es menor que el del
	 *         segundo, un valor positivo si es mayor, y 0 si son iguales.
	 */
	@Override
	public int compare(Socio s1, Socio s2) {
		return s1.getNombre().compareTo(s2.getNombre());
	}
}
