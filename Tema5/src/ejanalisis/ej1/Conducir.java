package ejanalisis.ej1;

/**
 * Interfaz que define las acciones básicas relacionadas con la conducción.
 */
public interface Conducir {

	/**
	 * Arranca el vehículo, iniciando su funcionamiento.
	 */
	public void arrancar();

	/**
	 * Detiene el vehículo, finalizando su funcionamiento.
	 */
	public void parar();

	/**
	 * Cambia a una marcha superior del vehículo.
	 */
	public void subirMarcha();

	/**
	 * Cambia a una marcha inferior del vehículo.
	 */
	public void bajarMarcha();
}
