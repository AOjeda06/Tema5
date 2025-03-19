package interfaces.ej1;

import java.util.Scanner;

public class Principal {

	static Scanner scanner = new Scanner(System.in);

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

	public static void imprimirSocios() {
		CRUD.imprimirBBDD();
	}

}
