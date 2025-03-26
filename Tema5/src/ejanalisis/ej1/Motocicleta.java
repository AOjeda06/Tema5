package ejanalisis.ej1;

/**
 * Clase Motocicleta que extiende de Vehiculo. Representa una motocicleta con su
 * cilindrada y la necesidad de un carnet especial dependiendo de esta.
 */
public class Motocicleta extends Vehiculo {

	/**
	 * Cilindrada de la motocicleta en centímetros cúbicos (cc).
	 */
	private int cc;

	/**
	 * Indica si la motocicleta requiere un carnet especial.
	 */
	private boolean requiereCarnet;

	/**
	 * Constructor de la clase Motocicleta.
	 * 
	 * @param marca     Marca de la motocicleta.
	 * @param modelo    Modelo de la motocicleta.
	 * @param color     Color de la motocicleta.
	 * @param matricula Matrícula de la motocicleta.
	 * @param cc        Cilindrada de la motocicleta en centímetros cúbicos (cc). Si
	 *                  la cilindrada es mayor a 125 cc, requiere un carnet
	 *                  especial.
	 */
	public Motocicleta(String marca, String modelo, String color, String matricula, int cc) {
		super(marca, modelo, color, matricula);
		this.cc = cc;
		requiereCarnet = cc > 125;
	}

	/**
	 * Obtiene la cilindrada de la motocicleta.
	 * 
	 * @return Cilindrada de la motocicleta en centímetros cúbicos (cc).
	 */
	public int getCc() {
		return cc;
	}

	/**
	 * Indica si la motocicleta requiere un carnet especial.
	 * 
	 * @return true si requiere un carnet especial, false en caso contrario.
	 */
	public boolean isRequiereCarnet() {
		return requiereCarnet;
	}
}
