package ejanalisis.ej2;

public class Main {

	public static void main(String[] args) {
		// Crear y probar un objeto de la clase DVD
		DVD dvd = new DVD(1, "Interstellar", "Christopher Nolan", 2014, "PELICULA");
		System.out.println("DVD: " + dvd.getTitulo());
		System.out.println("Director: " + dvd.getDirector());
		System.out.println("Año: " + dvd.getAño());
		System.out.println("Género: " + dvd.getTipo());
		dvd.prestar();
		System.out.println();

		// Crear y probar un objeto de la clase Libro
		Libro libro = new Libro(2, "Cien años de soledad", "Gabriel García Márquez", "Editorial Sudamericana");
		System.out.println("Libro: " + libro.getTitulo());
		System.out.println("Autor: " + libro.getAutor());
		System.out.println("Editorial: " + libro.getEditorial());
		libro.prestar();
		System.out.println();

		// Crear y probar un objeto de la clase Revista
		Revista revista = new Revista(3, "National Geographic", 120, 2025);
		System.out.println("Revista: " + revista.getTitulo());
		System.out.println("Número: " + revista.getNumero());
		System.out.println("Año: " + revista.getAño());
		revista.prestar();
	}
}
