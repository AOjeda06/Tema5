package ejanalisis.ej3;

import java.util.HashSet;

public class CuentaBancaria {
	private int numeroCuenta;
	private double saldo;
	private HashSet<Titular> titulares = new HashSet<>(3);

	public CuentaBancaria(int numeroCuenta, double saldo, Titular titular) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.titulares.add(titular);
	}
	
}
