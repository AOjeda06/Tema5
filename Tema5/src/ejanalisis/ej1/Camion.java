package ejanalisis.ej1;

/**
 * Clase Camion que extiende de Vehiculo. Representa un camión con un peso
 * máximo autorizado (MMA) y la posibilidad de transportar mercancías
 * peligrosas.
 */
public class Camion extends Vehiculo {

	/**
	 * Peso máximo autorizado (MMA) del camión.
	 */
	private double mma;

	/**
	 * Indica si el camión transporta mercancías peligrosas.
	 */
	private boolean mercanciaPeligrosa;

	/**
	 * Constructor de la clase Camion.
	 * 
	 * @param marca              Marca del camión.
	 * @param modelo             Modelo del camión.
	 * @param color              Color del camión.
	 * @param matricula          Matrícula del camión.
	 * @param mma                Peso máximo autorizado (MMA) del camión.
	 * @param mercanciaPeligrosa Indica si transporta mercancías peligrosas.
	 */
	public Camion(String marca, String modelo, String color, String matricula, double mma, boolean mercanciaPeligrosa) {
		super(marca, modelo, color, matricula);
		this.mma = mma;
		this.mercanciaPeligrosa = mercanciaPeligrosa;
	}

	/**
	 * Indica si el camión transporta mercancías peligrosas.
	 * 
	 * @return true si transporta mercancías peligrosas, false en caso contrario.
	 */
	public boolean isMercanciaPeligrosa() {
		return mercanciaPeligrosa;
	}

	/**
	 * Configura si el camión transporta mercancías peligrosas.
	 * 
	 * @param mercanciaPeligrosa true si transporta mercancías peligrosas, false en
	 *                           caso contrario.
	 */
	public void setMercanciaPeligrosa(boolean mercanciaPeligrosa) {
		this.mercanciaPeligrosa = mercanciaPeligrosa;
	}

	/**
	 * Obtiene el peso máximo autorizado (MMA) del camión.
	 * 
	 * @return Peso máximo autorizado del camión.
	 */
	public double getMma() {
		return mma;
	}
}
