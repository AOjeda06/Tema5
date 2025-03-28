package ejanalisis.ej3;

public class Main {
	public static void main(String[] args) {
		// ENCABEZADO: Prueba de Titulares
		System.out.println("===== PRUEBA DE TITULARES =====\n");
		Titular titular1 = new Titular("12345678A", "Juan", "Pérez", 612345678);
		Titular titular2 = new Titular("87654321B", "María", "López", 691234567);
		Titular titular3 = new Titular("45678912C", "Carlos", "García", 681234567);
		System.out.println("Titulares creados:\n" + titular1 + "\n" + titular2 + "\n" + titular3 + "\n");

		// ENCABEZADO: Prueba de CuentaBancaria
		System.out.println("===== PRUEBA DE CUENTA BANCARIA =====\n");
		CuentaBancaria cuentaBancaria = new CuentaBancaria(1001, 5000, titular1);

		System.out.println("Operación: Ingresar 1500 al saldo");
		cuentaBancaria.ingresar(1500);
		System.out.println("Resultado: Saldo actualizado: " + cuentaBancaria.getSaldo() + "\n");

		System.out.println("Operación: Retirar 2000 del saldo");
		cuentaBancaria.retirar(2000);
		System.out.println("Resultado: Saldo actualizado: " + cuentaBancaria.getSaldo() + "\n");

		System.out.println("Operación: Mostrar titulares");
		cuentaBancaria.mostrarTitulares();
		System.out.println();

		System.out.println("Operación: Añadir titular María López");
		cuentaBancaria.añadirTitular(titular2);
		cuentaBancaria.mostrarTitulares();
		System.out.println();

		System.out.println("Operación: Eliminar titular Juan Pérez");
		cuentaBancaria.eliminarTitular(titular1);
		cuentaBancaria.mostrarTitulares();
		System.out.println();

		System.out.println("Saldo final: " + cuentaBancaria.getSaldo() + "\n");

		// ENCABEZADO: Prueba de CuentaAhorro
		System.out.println("===== PRUEBA DE CUENTA DE AHORRO =====\n");
		CuentaAhorro cuentaAhorro = new CuentaAhorro(2002, 10000, titular1, 50, 5);

		System.out.println("Operación: Calcular saldo con interés anual");
		System.out.println("Resultado: Saldo con interés: " + cuentaAhorro.saldoConInteres() + "\n");

		System.out.println("Operación: Calcular saldo real (menos cuota de mantenimiento)");
		System.out.println("Resultado: Saldo real: " + cuentaAhorro.saldoReal() + "\n");

		// ENCABEZADO: Prueba de Transacciones en CuentaCorriente
		System.out.println("===== PRUEBA DE TRANSACCIONES EN CUENTA CORRIENTE =====\n");
		Transaccion transaccion1 = new Transaccion(15, 3, 2025, "Compra supermercado", -50);
		Transaccion transaccion2 = new Transaccion(16, 3, 2025, "Pago luz", -100);
		Transaccion transaccion3 = new Transaccion(17, 3, 2025, "Ingreso nómina", 1500);
		System.out
				.println("Transacciones creadas:\n" + transaccion1 + "\n" + transaccion2 + "\n" + transaccion3 + "\n");

		// ENCABEZADO: Prueba de CuentaCorriente
		System.out.println("===== PRUEBA DE CUENTA CORRIENTE =====\n");
		CuentaCorriente cuentaCorriente = new CuentaCorriente(3003, 2000, titular3, 5);

		System.out.println("Operación: Realizar transacción 'Compra supermercado'");
		cuentaCorriente.transaccion(transaccion1);
		System.out.println("Resultado: Saldo actualizado: " + cuentaCorriente.getSaldo() + "\n");

		System.out.println("Operación: Realizar transacción 'Pago luz'");
		cuentaCorriente.transaccion(transaccion2);
		System.out.println("Resultado: Saldo actualizado: " + cuentaCorriente.getSaldo() + "\n");

		System.out.println("Operación: Realizar transacción 'Ingreso nómina'");
		cuentaCorriente.transaccion(transaccion3);
		System.out.println("Resultado: Saldo actualizado: " + cuentaCorriente.getSaldo() + "\n");

		System.out.println("Operación: Realizar domiciliación 'Pago agua'");
		cuentaCorriente.domiciliacion(new Transaccion(20, 3, 2025, "Pago agua", -30));
		System.out.println("Resultado: Saldo actualizado: " + cuentaCorriente.getSaldo() + "\n");

		System.out.println("Operación: Mostrar transacciones realizadas");
		cuentaCorriente.getTransacciones();
		System.out.println("\nNúmero de transacciones realizadas: " + cuentaCorriente.getNumeroTransacciones());
		System.out.println("Saldo final de la cuenta corriente: " + cuentaCorriente.getSaldo() + "\n");
	}
}
