package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Ejecutable {

	public static void main(String[] args) {
		List<Electrodomestico> listaElectrodomesticos = new ArrayList<>();

		// Añadiendo electrodomésticos a la lista
		listaElectrodomesticos.add(new Electrodomestico(300, 50));
		listaElectrodomesticos.add(new Lavadora(200, 30));
		listaElectrodomesticos.add(new Television(500, 20, "NEGRO", 'A', 45, true));

		double totalElectrodomesticos = 0;
		double totalLavadoras = 0;
		double totalTelevisiones = 0;

		// Recorriendo la lista y calculando el precio final de cada objeto
		for (Electrodomestico electrodomestico : listaElectrodomesticos) {
			electrodomestico.precioFinal();
			System.out.println("Precio base después de precioFinal(): " + electrodomestico.getPrecioBase());

			// Sumando los precios finales de acuerdo al tipo de electrodoméstico
			totalElectrodomesticos += electrodomestico.getPrecioBase();
			if (electrodomestico instanceof Lavadora) {
				totalLavadoras += electrodomestico.getPrecioBase();
			} else if (electrodomestico instanceof Television) {
				totalTelevisiones += electrodomestico.getPrecioBase();
			}
		}

		// Imprimiendo los resultados finales
		System.out.println("Total Electrodomesticos: " + totalElectrodomesticos);
		System.out.println("Total Lavadoras: " + totalLavadoras);
		System.out.println("Total Televisiones: " + totalTelevisiones);
	}
}
