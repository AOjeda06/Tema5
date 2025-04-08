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

		// Ordenar los futbolistas usando el método compareTo (por número de camiseta y
		// nombre)
		Collections.sort(futbolistas);
		System.out.println("Futbolistas ordenados por número de camiseta y nombre:");
		for (Futbolista futbolista : futbolistas) {
			System.out.println(futbolista);
		}

		// Ordenar los futbolistas por edad de forma ascendente usando una expresión
		// lambda
		Collections.sort(futbolistas, (f1, f2) -> Integer.compare(f1.getEdad(), f2.getEdad()));
		System.out.println("\nFutbolistas ordenados por edad (ascendente):");
		for (Futbolista futbolista : futbolistas) {
			System.out.println(futbolista);
		}

		// Ordenar los futbolistas por número de goles de mayor a menor usando una
		// expresión lambda
		Collections.sort(futbolistas, (f1, f2) -> Integer.compare(f2.getNumeroGoles(), f1.getNumeroGoles()));
		System.out.println("\nFutbolistas ordenados por número de goles (de mayor a menor):");
		for (Futbolista futbolista : futbolistas) {
			System.out.println(futbolista);
		}
	}
}
