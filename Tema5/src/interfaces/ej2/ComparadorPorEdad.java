package interfaces.ej2;

import java.util.Comparator;

/**
 * Comparador para ordenar futbolistas por edad de forma ascendente.
 */
public class ComparadorPorEdad implements Comparator<Futbolista> {
	@Override
	public int compare(Futbolista f1, Futbolista f2) {
		return Integer.compare(f1.getEdad(), f2.getEdad());
	}
}
