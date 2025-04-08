package ejexcepciones.ej1;

public class Main {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try {
			// Crear un objeto Hora con valores válidos
			Hora hora = new Hora(10, 30, 15);
			System.out.println("Hora inicial: " + hora);

			// Modificar valores usando setters
			hora.setHora(12);
			hora.setMinuto(45);
			hora.setSegundo(20);
			System.out.println("Hora modificada: " + hora);

			// Intentar asignar valores negativos para probar excepciones
			hora.setHora(-5);
		} catch (NegativeHourException e) {
			System.out.println("Excepción capturada: " + e.getMessage());
		} catch (NegativeMinuteException e) {
			System.out.println("Excepción capturada: " + e.getMessage());
		} catch (NegativeSecondException e) {
			System.out.println("Excepción capturada: " + e.getMessage());
		}

		try {
			Hora horaInvalida = new Hora(-10, 20, 30);
		} catch (NegativeHourException e) {
			System.out.println("Excepción capturada: " + e.getMessage());
		} catch (NegativeMinuteException e) {
			System.out.println("Excepción capturada: " + e.getMessage());
		} catch (NegativeSecondException e) {
			System.out.println("Excepción capturada: " + e.getMessage());
		}
	}
}
