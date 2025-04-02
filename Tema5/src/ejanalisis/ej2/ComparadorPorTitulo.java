package ejanalisis.ej2;

import java.util.Comparator;

/**
 * Comparador para ordenar las fichas en orden alfabético por título.
 */
public class ComparadorPorTitulo implements Comparator<Ficha> {

	/**
	 * Compara dos fichas en base a sus títulos en orden alfabético.
	 * 
	 * @param f1 La primera ficha a comparar.
	 * @param f2 La segunda ficha a comparar.
	 * @return Un valor negativo si el título de la primera ficha es menor, positivo
	 *         si es mayor, y 0 si son iguales.
	 */
	@Override
	public int compare(Ficha f1, Ficha f2) {
		return f1.getTitulo().compareTo(f2.getTitulo());
	}
}
