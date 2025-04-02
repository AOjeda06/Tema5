package ejanalisis.ej3;

import java.util.Comparator;

/**
 * Comparador para ordenar titulares por apellidos y, en caso de repetirse, por
 * nombre en orden ascendente.
 */
public class ComparadorPorApellidosYNombre implements Comparator<Titular> {

	/**
	 * Compara dos titulares en base a sus apellidos y nombres.
	 * 
	 * @param t1 El primer titular a comparar.
	 * @param t2 El segundo titular a comparar.
	 * @return Un valor negativo si el primer titular tiene apellidos/nombres
	 *         menores, positivo si son mayores, y 0 si son iguales.
	 */
	@Override
	public int compare(Titular t1, Titular t2) {
		int resultado = t1.getApellidos().compareTo(t2.getApellidos());
		if (resultado == 0) {
			resultado = t1.getNombre().compareTo(t2.getNombre());
		}
		return resultado;
	}
}
