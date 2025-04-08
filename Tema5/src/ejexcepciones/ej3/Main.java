package ejexcepciones.ej3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Introduce el nombre del artículo:");
			String nombre = scanner.nextLine();

			System.out.println("Introduce el precio del artículo:");
			double precio = scanner.nextDouble();

			System.out.println("Introduce el porcentaje de IVA del artículo:");
			double IVA = scanner.nextDouble();

			System.out.println("Introduce la cantidad en stock del artículo:");
			int cuantosQuedan = scanner.nextInt();

			// Crear el artículo
			Articulo articulo = new Articulo(nombre, precio, IVA, cuantosQuedan);
			System.out.println("\nArtículo creado con éxito:");
			System.out.println(articulo);

		} catch (InvalidNameException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (InvalidPriceException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (InvalidStockException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error inesperado: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}
}
