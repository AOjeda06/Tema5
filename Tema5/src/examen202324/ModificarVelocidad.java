package examen202324;

/**
 * Interfaz ModificarVelocidad que define las acciones básicas para ajustar la
 * velocidad. Proporciona métodos para aumentar y disminuir la velocidad.
 */
public interface ModificarVelocidad {

	/**
	 * Incrementa la velocidad. Este método debe implementar la lógica para subir la
	 * velocidad del dispositivo o sistema.
	 */
	public void subirVelocidad();

	/**
	 * Disminuye la velocidad. Este método debe implementar la lógica para bajar la
	 * velocidad del dispositivo o sistema.
	 */
	public void bajarVelocidad();
}
