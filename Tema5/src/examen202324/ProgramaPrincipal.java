package examen202324;

import java.util.Arrays;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// Crear una tabla de tamaño 10 que contenga los distintos tipos de mandos a
		// distancia
		MandoADistancia[] mandos = new MandoADistancia[10];
		mandos[0] = new MandoTV("TV1", 20, 10, 300);
		mandos[1] = new MandoMinicadena("Minicadena1", 15, 7, 150);
		mandos[2] = new MandoAspiradora("Aspiradora1", 25, 10, 200);
		mandos[3] = new MandoAC("AC1", 30, 12, 400);
		mandos[4] = new MandoTV("TV2", 18, 9, 280);
		mandos[5] = new MandoMinicadena("Minicadena2", 16, 8, 170);
		mandos[6] = new MandoAspiradora("Aspiradora2", 24, 11, 220);
		mandos[7] = new MandoAC("AC2", 35, 15, 450);
		mandos[8] = new MandoTV("TV3", 22, 11, 320);
		mandos[9] = new MandoMinicadena("Minicadena3", 14, 6, 140);

		// Ordenar la tabla según el modelo
		Arrays.sort(mandos);

		// Imprimir la tabla
		System.out.println("Mandos ordenados antes de los cambios:");
		for (MandoADistancia mando : mandos) {
			System.out.println(mando);
		}

		// Recorrer la tabla y realizar las acciones requeridas
		for (MandoADistancia mando : mandos) {
			mando.encender();

			if (mando instanceof MandoTV) {
				MandoTV mandoTV = (MandoTV) mando;
				mandoTV.setCanal(5); // Cambiar el canal
				mandoTV.subirVolumen();
				mandoTV.bajarVolumen();
			} else if (mando instanceof MandoMinicadena) {
				MandoMinicadena mandoMinicadena = (MandoMinicadena) mando;
				mandoMinicadena.subirVolumen();
				mandoMinicadena.bajarVolumen();
			} else if (mando instanceof MandoAspiradora) {
				MandoAspiradora mandoAspiradora = (MandoAspiradora) mando;
				mandoAspiradora.subirVelocidad();
				mandoAspiradora.bajarVelocidad();
			} else if (mando instanceof MandoAC) {
				MandoAC mandoAC = (MandoAC) mando;
				mandoAC.setModo("CALOR"); // Cambiar el modo
				mandoAC.setTemperatura(22.0); // Cambiar la temperatura
				mandoAC.subirVelocidad();
				mandoAC.bajarVelocidad();
			}

		}

		System.out.println();
		System.out.println("Mandos ordenados después de los cambios: ");

		// Reimmprimir la tabla
		System.out.println("Mandos ordenados:");
		for (MandoADistancia mando : mandos) {
			System.out.println(mando);
		}
	}
}
