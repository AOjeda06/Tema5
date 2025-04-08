package interfaces.ej1;

import java.util.Scanner;
import java.util.Collections;

public class Principal {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int menu;

		do {
			System.out.println("1. Introducir Socio");
			System.out.println("2. Imprimir BBDD por ID");
			System.out.println("3. Imprimir BBDD por Nombre");
			System.out.println("4. Imprimir BBDD por Edad");
			System.out.println("0. Salir");
			menu = scanner.nextInt();
			scanner.nextLine();

			switch (menu) {
			case 1 -> nuevoSocio();
			case 2 -> imprimirPorId();
			case 3 -> imprimirPorNombre();
			case 4 -> imprimirPorEdad();
			}
		} while (menu != 0);
	}

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

	public static void imprimirPorId() {
		Collections.sort(CRUD.BBDD);
		System.out.println("Socios ordenados por ID:");
		CRUD.imprimirBBDD();
	}

	public static void imprimirPorNombre() {
		// Usar expresión lambda para ordenar por nombre alfabéticamente
		Collections.sort(CRUD.BBDD, (s1, s2) -> s1.getNombre().compareTo(s2.getNombre()));
		System.out.println("Socios ordenados por Nombre:");
		CRUD.imprimirBBDD();
	}

	public static void imprimirPorEdad() {
		// Usar expresión lambda para ordenar por edad de mayor a menor
		Collections.sort(CRUD.BBDD, (s1, s2) -> Integer.compare(s2.getEdad(), s1.getEdad()));
		System.out.println("Socios ordenados por Edad:");
		CRUD.imprimirBBDD();
	}
}
