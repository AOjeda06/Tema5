package interfaces.ej2;

import java.util.Comparator;

/**
 * Comparador para ordenar futbolistas de más goles a menos goles.
 */
public class ComparadorPorGoles implements Comparator<Futbolista> {
	@Override
	public int compare(Futbolista f1, Futbolista f2) {
		return Integer.compare(f2.getNumeroGoles(), f1.getNumeroGoles());
	}
}
