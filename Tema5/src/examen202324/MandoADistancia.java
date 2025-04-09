package examen202324;

import java.util.Objects;

/**
 * Clase MandoADistancia que representa un mando a distancia con atributos como
 * modelo, dimensiones, precio y estado de encendido/apagado. Implementa la
 * interfaz Comparable para ordenar por modelo.
 */
public class MandoADistancia implements Comparable<MandoADistancia> {

	/** Modelo del mando a distancia. */
	private String modelo;

	/** Ancho del mando en centímetros. */
	private double anchoCm;

	/** Alto del mando en centímetros. */
	private double altoCm;

	/** Precio del mando a distancia. */
	private double precio;

	/** Estado del mando (true si está encendido, false si está apagado). */
	private boolean encendido = false;

	/**
	 * Constructor de MandoADistancia.
	 * 
	 * @param modelo  Modelo del mando.
	 * @param anchoCm Ancho en centímetros.
	 * @param altoCm  Alto en centímetros.
	 * @param precio  Precio del mando.
	 */
	public MandoADistancia(String modelo, double anchoCm, double altoCm, double precio) {
		this.modelo = modelo;
		this.anchoCm = anchoCm;
		this.altoCm = altoCm;
		this.precio = precio;
	}

	/**
	 * Devuelve el precio del mando.
	 * 
	 * @return Precio del mando.
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Establece un nuevo precio para el mando.
	 * 
	 * @param precio Nuevo precio del mando.
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * Devuelve el modelo del mando.
	 * 
	 * @return Modelo del mando.
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * Devuelve el ancho del mando en centímetros.
	 * 
	 * @return Ancho en centímetros.
	 */
	public double getAnchoCm() {
		return anchoCm;
	}

	/**
	 * Devuelve el alto del mando en centímetros.
	 * 
	 * @return Alto en centímetros.
	 */
	public double getAltoCm() {
		return altoCm;
	}

	/**
	 * Indica si el mando está encendido.
	 * 
	 * @return {@code true} si el mando está encendido, {@code false} en caso
	 *         contrario.
	 */
	public boolean isEncendido() {
		return encendido;
	}

	/**
	 * Enciende el mando.
	 */
	public void encender() {
		encendido = true;
	}

	/**
	 * Apaga el mando.
	 */
	public void apagar() {
		encendido = false;
	}

	/**
	 * Compara este mando con otro objeto para determinar si son iguales.
	 * 
	 * @param obj Objeto a comparar.
	 * @return {@code true} si el objeto es un mando y tiene el mismo modelo,
	 *         {@code false} en caso contrario.
	 */
	public boolean equals(MandoADistancia obj) {
		boolean res = false;
		if (obj instanceof MandoADistancia) {
			res = this.modelo.equals(obj.modelo);
		}
		return res;
	}

	/**
	 * Devuelve el código hash del mando basado en su modelo.
	 * 
	 * @return Código hash del mando.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(modelo);
	}

	/**
	 * Compara este mando con otro mando basado en el modelo en orden alfabético.
	 * 
	 * @param o Mando a comparar.
	 * @return Valor negativo, cero o positivo según el orden alfabético del modelo.
	 */
	@Override
	public int compareTo(MandoADistancia o) {
		return this.modelo.compareTo(o.modelo);
	}

	/**
	 * Devuelve una representación en forma de cadena del mando a distancia.
	 * 
	 * @return Cadena que describe el mando a distancia.
	 */
	@Override
	public String toString() {
		return "Modelo= " + modelo + ", Ancho en Cm: " + anchoCm + ", Alto en Cm: " + altoCm + ", Precio: " + precio
				+ ", Estado (encendido): " + encendido;
	}
}
