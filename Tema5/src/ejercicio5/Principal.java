package ejercicio5;

import java.util.Scanner;

/**
 * Clase principal que gestiona el flujo del programa. Permite al usuario
 * interactuar con la aplicación para introducir triángulos, rectángulos y
 * mostrar los polígonos almacenados.
 */
public class Principal {

	/**
	 * Escáner estático para leer la entrada del usuario.
	 */
	static Scanner scanner = new Scanner(System.in);

	/**
	 * Método principal del programa. Muestra un menú interactivo para que el
	 * usuario pueda gestionar los polígonos.
	 * 
	 * @param args Argumentos de línea de comandos (no se utilizan en este
	 *             programa).
	 */
	public static void main(String[] args) {
		int menu;

		do {
			System.out.println("1. Introducir Triangulo");
			System.out.println("2. Introducir Rectangulo");
			System.out.println("3. Mostrar poligonos");
			menu = scanner.nextInt();
			scanner.nextLine();

			switch (menu) {
			case 1 -> introTrinagulo();
			case 2 -> introReactangulo();
			case 3 -> imprimirBD();
			}
		} while (menu != 0);
	}

	/**
	 * Método para introducir los datos de un triángulo. Solicita al usuario las
	 * dimensiones de los tres lados y lo añade a la base de datos si es válido.
	 */
	private static void introTrinagulo() {
		double lado1 = pedirLado();
		double lado2 = pedirLado();
		double lado3 = pedirLado();
		try {
			Triangulo t = new Triangulo(lado1, lado2, lado3);
			if (CRUD.nuevoTringulo(t)) {
				System.out.println("Triangulo añadido correctamente");
			} else {
				System.out.println("No se ha podido añadir el triángulo");
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Método para introducir los datos de un rectángulo. Solicita al usuario las
	 * dimensiones de los dos lados y lo añade a la base de datos si es válido.
	 */
	private static void introReactangulo() {
		double lado1 = pedirLado();
		double lado2 = pedirLado();
		try {
			Rectangulo r = new Rectangulo(lado1, lado2);
			if (CRUD.nuevoRectangulo(r)) {
				System.out.println("Rectangulo añadido correctamente");
			} else {
				System.out.println("No se ha podido añadir el rectángulo");
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Método para mostrar todos los polígonos almacenados en la base de datos.
	 */
	private static void imprimirBD() {
		CRUD.imprimirBD();
	}

	/**
	 * Solicita al usuario introducir la longitud de un lado.
	 * 
	 * @return La longitud del lado introducida por el usuario.
	 */
	private static double pedirLado() {
		double lado;
		System.out.println("Introduzca las dimensiones del (siguiente) lado: ");
		lado = scanner.nextDouble();
		scanner.nextLine();
		return lado;
	}
}
