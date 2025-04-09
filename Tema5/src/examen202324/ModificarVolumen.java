package examen202324;

/**
 * Interfaz ModificarVolumen que define las acciones básicas para ajustar el
 * volumen. Proporciona métodos para aumentar y disminuir el volumen.
 */
public interface ModificarVolumen {

	/**
	 * Incrementa el volumen. Este método debe implementar la lógica para subir el
	 * volumen del dispositivo o aplicación.
	 */
	public void subirVolumen();

	/**
	 * Disminuye el volumen. Este método debe implementar la lógica para bajar el
	 * volumen del dispositivo o aplicación.
	 */
	public void bajarVolumen();
}
