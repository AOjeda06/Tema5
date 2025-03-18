package ejercicio5;

import java.util.HashSet;

/**
 * Clase CRUD (Create, Read, Update, Delete) para gestionar una base de datos
 * (BBDD) de objetos Poligono. Permite agregar nuevos triángulos o rectángulos y
 * mostrar la base de datos por consola.
 */
public class CRUD {
	/**
	 * Base de datos estática que almacena objetos de tipo Poligono. Utiliza un
	 * HashSet para evitar duplicados.
	 */
	static private HashSet<Poligono> BBDD = new HashSet<>();

	/**
	 * Agrega un nuevo objeto de tipo Triangulo a la base de datos.
	 * 
	 * @param t El objeto Triangulo que se desea añadir.
	 * @return {@code true} si el triángulo se agregó con éxito, {@code false} si ya
	 *         existía en la base de datos.
	 */
	static public boolean nuevoTringulo(Triangulo t) {
		return BBDD.add(t);
	}

	/**
	 * Agrega un nuevo objeto de tipo Rectangulo a la base de datos.
	 * 
	 * @param r El objeto Rectangulo que se desea añadir.
	 * @return {@code true} si el rectángulo se agregó con éxito, {@code false} si
	 *         ya existía en la base de datos.
	 */
	static public boolean nuevoRectangulo(Rectangulo r) {
		return BBDD.add(r);
	}

	/**
	 * Imprime todos los objetos almacenados en la base de datos. Cada objeto se
	 * muestra en una nueva línea seguido de un espacio en blanco.
	 */
	static public void imprimirBD() {
		System.out.println();
		for (Poligono elemento : BBDD) {
			System.out.println(elemento);
			System.out.println(" Area: " + elemento.area());
			System.out.println();
		}
	}
}
