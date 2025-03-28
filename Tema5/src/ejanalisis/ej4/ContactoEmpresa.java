package ejanalisis.ej4;

/**
 * Representa un contacto de empresa con información adicional sobre su página
 * web. Hereda de la clase {@link Contacto}.
 */
public class ContactoEmpresa extends Contacto {

	/**
	 * URL de la página web de la empresa.
	 */
	private String urlWeb;

	/**
	 * Constructor para inicializar un contacto de empresa con nombre, teléfono y
	 * URL de la página web.
	 *
	 * @param nombre   El nombre del contacto o la empresa.
	 * @param telefono El número de teléfono del contacto.
	 * @param urlWeb   La URL de la página web de la empresa.
	 */
	public ContactoEmpresa(String nombre, int telefono, String urlWeb) {
		super(nombre, telefono);
		this.urlWeb = urlWeb;
	}

	/**
	 * Obtiene la URL de la página web de la empresa.
	 *
	 * @return La URL de la página web.
	 */
	public String getUrlWeb() {
		return urlWeb;
	}

	/**
	 * Establece o actualiza la URL de la página web de la empresa.
	 *
	 * @param urlWeb La nueva URL de la página web.
	 */
	public void setUrlWeb(String urlWeb) {
		this.urlWeb = urlWeb;
	}

	/**
	 * Representa el objeto ContactoEmpresa como una cadena de texto. Incluye el
	 * nombre, teléfono y URL de la página web del contacto.
	 *
	 * @return Una cadena que contiene los datos del contacto de empresa.
	 */
	@Override
	public String toString() {
		return "ContactoEmpresa [Nombre: " + getNombre() + ", Teléfono: " + getTelefono() + ", URL Web: " + urlWeb
				+ "]";
	}
}
