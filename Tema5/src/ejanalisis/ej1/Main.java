package ejanalisis.ej1;

public class Main {

	public static void main(String[] args) {

		// Prueba de la clase Vehiculo
		Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla", "Rojo", "1234ABC");
		System.out.println("Prueba de la clase Vehiculo:");
		System.out.println("Marca: " + vehiculo.getMarca());
		System.out.println("Modelo: " + vehiculo.getModelo());
		System.out.println("Color: " + vehiculo.getColor());
		System.out.println("Matrícula: " + vehiculo.getMatricula());
		vehiculo.arrancar();
		System.out.println("Motor arrancado: " + vehiculo.isMotor());
		System.out.println("Marcha engranada: " + vehiculo.getMarchaEngranada());
		vehiculo.controlDeVelocidadAdaptativo(65);

		System.out.println("\nPrueba de la clase Turismo:");
		Turismo turismo = new Turismo("Ford", "Focus", "Azul", "5678DEF", 5, "particular");
		System.out.println("Marca: " + turismo.getMarca());
		System.out.println("Modelo: " + turismo.getModelo());
		System.out.println("Plazas: " + turismo.getPlazas());
		System.out.println("Uso: " + turismo.getUso());

		System.out.println("\nPrueba de la clase Camion:");
		Camion camion = new Camion("Mercedes-Benz", "Actros", "Blanco", "9101GHI", 18_000, true);
		System.out.println("Marca: " + camion.getMarca());
		System.out.println("Modelo: " + camion.getModelo());
		System.out.println("MMA: " + camion.getMma());
		System.out.println("Mercancía peligrosa: " + camion.isMercanciaPeligrosa());

		System.out.println("\nPrueba de la clase Motocicleta:");
		Motocicleta motocicleta = new Motocicleta("Honda", "CBR", "Negro", "1213JKL", 150);
		System.out.println("Marca: " + motocicleta.getMarca());
		System.out.println("Modelo: " + motocicleta.getModelo());
		System.out.println("Cilindrada: " + motocicleta.getCc());
		System.out.println("¿Requiere carnet? " + motocicleta.isRequiereCarnet());
	}
}
