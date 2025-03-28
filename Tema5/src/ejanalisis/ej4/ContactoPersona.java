package ejanalisis.ej4;

/**
 * Representa un contacto personal con información adicional sobre la fecha de
 * cumpleaños. Hereda de la clase {@link Contacto}.
 */
public class ContactoPersona extends Contacto {

	/**
	 * Fecha de cumpleaños del contacto en formato DD/MM/AAAA.
	 */
	private String fechaCumpleaños;

	/**
	 * Constructor para inicializar un contacto personal con nombre, teléfono y
	 * fecha de cumpleaños.
	 *
	 * @param nombre          El nombre del contacto.
	 * @param telefono        El número de teléfono del contacto.
	 * @param fechaCumpleaños La fecha de cumpleaños del contacto en formato
	 *                        DD/MM/AAAA.
	 */
	public ContactoPersona(String nombre, int telefono, String fechaCumpleaños) {
		super(nombre, telefono);
		this.fechaCumpleaños = fechaCumpleaños;
	}

	/**
	 * Obtiene la fecha de cumpleaños del contacto.
	 *
	 * @return La fecha de cumpleaños en formato DD/MM/AAAA.
	 */
	public String getFechaCumpleaños() {
		return fechaCumpleaños;
	}

	/**
	 * Representa el objeto ContactoPersona como una cadena de texto. Incluye el
	 * nombre, teléfono y fecha de cumpleaños del contacto.
	 *
	 * @return Una cadena que contiene los datos del contacto personal.
	 */
	@Override
	public String toString() {
		return "ContactoPersona [Nombre: " + getNombre() + ", Teléfono: " + getTelefono() + ", Fecha de cumpleaños: "
				+ fechaCumpleaños + "]";
	}
}
