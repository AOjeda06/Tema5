package interfaces.ej2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Crear una lista de futbolistas
		List<Futbolista> futbolistas = new ArrayList<>();
		futbolistas.add(new Futbolista(10, "Lionel Messi", 36, 700));
		futbolistas.add(new Futbolista(7, "Cristiano Ronaldo", 39, 820));
		futbolistas.add(new Futbolista(9, "Robert Lewandowski", 34, 500));
		futbolistas.add(new Futbolista(8, "Kylian Mbappé", 24, 200));
		futbolistas.add(new Futbolista(11, "Neymar Jr.", 31, 400));

		// Ordenar los futbolistas usando el método compareTo
		Collections.sort(futbolistas);

		// Mostrar los futbolistas ordenados
		System.out.println("Futbolistas ordenados:");
		for (Futbolista futbolista : futbolistas) {
			System.out.println(futbolista);
		}
	}
}
