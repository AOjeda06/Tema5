package ejexcepciones.ej4;

import java.util.Scanner;

/**
 * Clase principal para probar la validación de la clase Fecha y manejar las
 * excepciones personalizadas asociadas a los datos de la fecha.
 */
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Introduce el día:");
			int dia = scanner.nextInt();

			System.out.println("Introduce el mes:");
			int mes = scanner.nextInt();

			System.out.println("Introduce el año:");
			int ano = scanner.nextInt();

			// Crear una instancia de Fecha
			Fecha fecha = new Fecha(dia, mes, ano);
			System.out.println("Fecha creada con éxito: " + fecha);

		} catch (InvalidDayException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (InvalidMonthException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (InvalidYearException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error inesperado: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}
}
