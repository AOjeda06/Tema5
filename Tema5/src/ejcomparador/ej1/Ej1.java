package ejcomparador.ej1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ej1 {

	public static void main(String[] args) {
		// Crear una lista para almacenar los números aleatorios
		ArrayList<Integer> numeros = new ArrayList<>();

		// Generar 20 números aleatorios entre 1 y 100
		Random random = new Random();
		for (int i = 0; i < 20; i++) {
			numeros.add(random.nextInt(100) + 1); // Genera números entre 1 y 100
		}

		// Imprimir los números antes de ordenar
		System.out.println("Números originales:");
		System.out.println(numeros);

		// Ordenar los números en sentido decreciente usando el comparador
		Collections.sort(numeros, new ComparadorDecreciente());

		// Imprimir los números ordenados
		System.out.println("Números ordenados en sentido decreciente:");
		System.out.println(numeros);
	}
}
