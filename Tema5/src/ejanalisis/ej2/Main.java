package ejanalisis.ej2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Crear una lista de fichas para demostrar la ordenación
		List<Ficha> fichas = new ArrayList<>();
		fichas.add(new DVD(1, "Interstellar", "Christopher Nolan", 2014, "PELICULA"));
		fichas.add(new Libro(2, "Cien años de soledad", "Gabriel García Márquez", "Editorial Sudamericana"));
		fichas.add(new Revista(3, "National Geographic", 120, 2025));

		// Ordenar las fichas en orden alfabético por título utilizando una expresión
		// lambda
		Collections.sort(fichas, (f1, f2) -> f1.getTitulo().compareTo(f2.getTitulo()));

		System.out.println("Fichas ordenadas por título:");
		for (Ficha ficha : fichas) {
			System.out.println(ficha);
		}

		// Crear y probar un objeto de la clase DVD
		DVD dvd = new DVD(1, "Interstellar", "Christopher Nolan", 2014, "PELICULA");
		System.out.println("\nDVD: " + dvd.getTitulo());
		System.out.println("Director: " + dvd.getDirector());
		System.out.println("Año: " + dvd.getAño());
		System.out.println("Género: " + dvd.getTipo());
		dvd.prestar();

		// Crear y probar un objeto de la clase Libro
		Libro libro = new Libro(2, "Cien años de soledad", "Gabriel García Márquez", "Editorial Sudamericana");
		System.out.println("\nLibro: " + libro.getTitulo());
		System.out.println("Autor: " + libro.getAutor());
		System.out.println("Editorial: " + libro.getEditorial());
		libro.prestar();

		// Crear y probar un objeto de la clase Revista
		Revista revista = new Revista(3, "National Geographic", 120, 2025);
		System.out.println("\nRevista: " + revista.getTitulo());
		System.out.println("Número: " + revista.getNumero());
		System.out.println("Año: " + revista.getAño());
		revista.prestar();
	}
}
