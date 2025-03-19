package interfaces.ej1;

import java.util.Scanner;

/**
 * Clase principal para la gestión de socios. Proporciona un menú interactivo
 * para introducir y mostrar socios en la base de datos.
 */
public class Principal {

	/** Escáner para la entrada de datos por consola. */
	static Scanner scanner = new Scanner(System.in);

	/**
	 * Método principal que ejecuta el programa. Presenta un menú al usuario para
	 * gestionar la base de datos de socios.
	 * 
	 * @param args Argumentos de línea de comandos (no utilizados).
	 */
	public static void main(String[] args) {
		int menu;

		do {
			System.out.println("1. Introducir Socio");
			System.out.println("2. Imprimir BBDD");
			System.out.println("0. Salir");
			menu = scanner.nextInt();
			scanner.nextLine();

			switch (menu) {
			case 1 -> nuevoSocio();
			case 2 -> imprimirSocios();
			}
		} while (menu != 0);
	}

	/**
	 * Solicita al usuario los datos de un nuevo socio y lo agrega a la base de
	 * datos. Valida los datos introducidos y maneja posibles excepciones.
	 */
	public static void nuevoSocio() {
		int id;
		String nombre;
		int edad;

		System.out.println("Indique el ID: ");
		id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Indique el nombre: ");
		nombre = scanner.next();
		scanner.nextLine();
		System.out.println("Indique la edad: ");
		edad = scanner.nextInt();
		scanner.nextLine();
		try {
			Socio s = new Socio(id, nombre, edad);
			if (CRUD.añadirSocio(s)) {
				System.out.println("Socio añadido correctamente");
			} else {
				System.out.println("No se ha podido añadir el socio");
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Imprime la base de datos de socios en la consola.
	 */
	public static void imprimirSocios() {
		CRUD.imprimirBBDD();
	}

}
