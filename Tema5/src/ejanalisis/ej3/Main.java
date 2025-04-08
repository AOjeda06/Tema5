package ejanalisis.ej3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// ENCABEZADO: Prueba de Titulares
		System.out.println("===== PRUEBA DE TITULARES =====\n");
		List<Titular> titulares = new ArrayList<>();

		try {
			Titular titular1 = new Titular("12345678A", "Juan", "Pérez", 612345678);
			Titular titular2 = new Titular("87654321B", "María", "López", 691234567);
			Titular titular3 = new Titular("45678912C", "Carlos", "García", 681234567);

			titulares.add(titular1);
			titulares.add(titular2);
			titulares.add(titular3);

			System.out.println("Titulares creados:\n" + titular1 + "\n" + titular2 + "\n" + titular3 + "\n");
		} catch (InvalidNameException | InvalidIdException e) {
			System.out.println("Error al crear titulares: " + e.getMessage());
		}

		// Ordenar titulares por apellidos y, en caso de empate, por nombre
		Collections.sort(titulares, (t1, t2) -> {
			int resultado = t1.getApellidos().compareTo(t2.getApellidos());
			if (resultado == 0) {
				resultado = t1.getNombre().compareTo(t2.getNombre());
			}
			return resultado;
		});

		System.out.println("Titulares ordenados por apellidos y nombre:");
		titulares.forEach(System.out::println);
		System.out.println();

		// ENCABEZADO: Prueba de CuentaBancaria
		System.out.println("===== PRUEBA DE CUENTA BANCARIA =====\n");
		List<CuentaBancaria> cuentas = new ArrayList<>();

		try {
			CuentaBancaria cuentaBancaria1 = new CuentaBancaria(1001, 5000, titulares.get(0));
			CuentaBancaria cuentaBancaria2 = new CuentaBancaria(1002, 2000, titulares.get(1));
			CuentaBancaria cuentaBancaria3 = new CuentaBancaria(1003, 8000, titulares.get(2));

			cuentas.add(cuentaBancaria1);
			cuentas.add(cuentaBancaria2);
			cuentas.add(cuentaBancaria3);

			System.out.println(
					"Cuentas creadas:\n" + cuentaBancaria1 + "\n" + cuentaBancaria2 + "\n" + cuentaBancaria3 + "\n");
		} catch (InvalidBalanceException e) {
			System.out.println("Error al crear cuentas bancarias: " + e.getMessage());
		}

		// Ordenar cuentas bancarias por saldo en orden descendente
		Collections.sort(cuentas, (c1, c2) -> Double.compare(c2.getSaldo(), c1.getSaldo()));

		System.out.println("Cuentas bancarias ordenadas por saldo descendente:");
		cuentas.forEach(System.out::println);
		System.out.println();

		// ENCABEZADO: Prueba de CuentaAhorro
		System.out.println("===== PRUEBA DE CUENTA DE AHORRO =====\n");
		try {
			CuentaAhorro cuentaAhorro = new CuentaAhorro(2002, 10000, titulares.get(0), 50, 5);

			System.out.println("Operación: Calcular saldo con interés anual");
			System.out.println("Resultado: Saldo con interés: " + cuentaAhorro.saldoConInteres() + "\n");

			System.out.println("Operación: Calcular saldo real (menos cuota de mantenimiento)");
			System.out.println("Resultado: Saldo real: " + cuentaAhorro.saldoReal() + "\n");
		} catch (InvalidBalanceException e) {
			System.out.println("Error al crear cuenta de ahorro: " + e.getMessage());
		}

		// ENCABEZADO: Prueba de CuentaCorriente
		System.out.println("===== PRUEBA DE CUENTA CORRIENTE =====\n");
		try {
			CuentaCorriente cuentaCorriente = new CuentaCorriente(3003, 2000, titulares.get(2), 5);

			Transaccion transaccion1 = new Transaccion(15, 3, 2025, "Compra supermercado", -50);
			Transaccion transaccion2 = new Transaccion(16, 3, 2025, "Pago luz", -100);
			Transaccion transaccion3 = new Transaccion(17, 3, 2025, "Ingreso nómina", 1500);

			cuentaCorriente.transaccion(transaccion1);
			cuentaCorriente.transaccion(transaccion2);
			cuentaCorriente.transaccion(transaccion3);

			System.out.println("Resultado: Saldo actualizado: " + cuentaCorriente.getSaldo() + "\n");

			System.out.println("Operación: Mostrar transacciones realizadas");
			cuentaCorriente.getTransacciones();
			System.out.println("\nNúmero de transacciones realizadas: " + cuentaCorriente.getNumeroTransacciones());
			System.out.println("Saldo final de la cuenta corriente: " + cuentaCorriente.getSaldo() + "\n");
		} catch (InvalidBalanceException e) {
			System.out.println("Error al crear cuenta corriente o realizar operaciones: " + e.getMessage());
		}
	}
}
