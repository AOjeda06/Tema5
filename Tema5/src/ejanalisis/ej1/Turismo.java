package ejanalisis.ej1;

/**
 * Clase Turismo que extiende de Vehiculo. Representa un vehículo del tipo
 * turismo con un número de plazas y un tipo de uso.
 */
public class Turismo extends Vehiculo {

	/**
	 * Número de plazas del turismo.
	 */
	private int plazas;

	/**
	 * Tipo de uso del turismo.
	 */
	private TipoUso uso;

	/**
	 * Enum para definir el tipo de uso de un turismo.
	 */
	enum TipoUso {
		PROFESIONAL, PARTICULAR
	}

	/**
	 * Constructor de la clase Turismo.
	 * 
	 * @param marca     Marca del turismo.
	 * @param modelo    Modelo del turismo.
	 * @param color     Color del turismo.
	 * @param matricula Matrícula del turismo.
	 * @param plazas    Número de plazas del turismo.
	 * @param uso       Tipo de uso del turismo (PROFESIONAL o PARTICULAR). Se
	 *                  convierte automáticamente a mayúsculas.
	 */
	public Turismo(String marca, String modelo, String color, String matricula, int plazas, String uso) {
		super(marca, modelo, color, matricula);
		this.plazas = plazas;
		this.uso = TipoUso.valueOf(uso.toUpperCase());
	}

	/**
	 * Obtiene el tipo de uso del turismo.
	 * 
	 * @return Tipo de uso como una cadena de texto.
	 */
	public String getUso() {
		return uso.toString();
	}

	/**
	 * Configura el tipo de uso del turismo.
	 * 
	 * @param uso Tipo de uso como cadena de texto. Se convierte automáticamente a
	 *            mayúsculas.
	 */
	public void setUso(String uso) {
		this.uso = TipoUso.valueOf(uso.toUpperCase());
	}

	/**
	 * Obtiene el número de plazas del turismo.
	 * 
	 * @return Número de plazas del turismo.
	 */
	public int getPlazas() {
		return plazas;
	}
}
