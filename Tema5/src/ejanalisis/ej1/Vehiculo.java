package ejanalisis.ej1;

/**
 * Clase que representa un vehículo y su comportamiento básico de conducción.
 */
public class Vehiculo implements Conducir {

	/**
	 * Marca del vehículo.
	 */
	private String marca;

	/**
	 * Modelo del vehículo.
	 */
	private String modelo;

	/**
	 * Color del vehículo.
	 */
	private String color;

	/**
	 * Matrícula del vehículo.
	 */
	private String matricula;

	/**
	 * Estado del motor (encendido o apagado).
	 */
	private boolean motor = false;

	/**
	 * Marcha actual engranada en el vehículo.
	 */
	private int marchaEngranada = 0;

	/**
	 * Velocidad actual del vehículo en kilómetros por hora.
	 */
	private int velocidadActualKmH = 0;

	/**
	 * Constructor para inicializar un vehículo con sus atributos básicos.
	 *
	 * @param marca     Marca del vehículo.
	 * @param modelo    Modelo del vehículo.
	 * @param color     Color del vehículo.
	 * @param matricula Matrícula del vehículo.
	 */
	public Vehiculo(String marca, String modelo, String color, String matricula) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.matricula = matricula;
	}

	/**
	 * Arranca el motor del vehículo.
	 */
	@Override
	public void arrancar() {
		motor = true;
	}

	/**
	 * Apaga el motor del vehículo.
	 */
	@Override
	public void parar() {
		motor = false;
	}

	/**
	 * Cambia a una marcha superior.
	 */
	@Override
	public void subirMarcha() {
		marchaEngranada++;
	}

	/**
	 * Cambia a una marcha inferior.
	 */
	@Override
	public void bajarMarcha() {
		marchaEngranada--;
	}

	/**
	 * Obtiene la marca del vehículo.
	 *
	 * @return Marca del vehículo.
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * Obtiene el modelo del vehículo.
	 *
	 * @return Modelo del vehículo.
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * Obtiene el color del vehículo.
	 *
	 * @return Color del vehículo.
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Obtiene la matrícula del vehículo.
	 *
	 * @return Matrícula del vehículo.
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * Verifica si el motor del vehículo está encendido.
	 *
	 * @return Estado del motor (true si está encendido, false si está apagado).
	 */
	public boolean isMotor() {
		return motor;
	}

	/**
	 * Obtiene la marcha engranada actualmente.
	 *
	 * @return Marcha actual engranada.
	 */
	public int getMarchaEngranada() {
		return marchaEngranada;
	}

	/**
	 * Obtiene la velocidad actual del vehículo en kilómetros por hora.
	 *
	 * @return Velocidad actual del vehículo.
	 */
	public int getVelocidadActualKmH() {
		return velocidadActualKmH;
	}

	/**
	 * Controla la velocidad adaptativa del vehículo hasta alcanzar una velocidad
	 * final deseada.
	 *
	 * @param velocidadFinal Velocidad objetivo en kilómetros por hora.
	 */
	public void controlDeVelocidadAdaptativo(int velocidadFinal) {
		if (getVelocidadActualKmH() == 0) {
			arrancar();
		}
		System.out.println("Marcha actual: " + getMarchaEngranada() + " Velocidad en KmH: " + getVelocidadActualKmH());
		do {
			if (velocidadFinal > getVelocidadActualKmH()) {
				do {
					cambioDeMarchas(true, false);
					System.out.println(
							"Marcha actual: " + getMarchaEngranada() + " Velocidad en KmH: " + getVelocidadActualKmH());
				} while (velocidadFinal > velocidadActualKmH);
			}
			if (velocidadFinal < getVelocidadActualKmH()) {
				do {
					cambioDeMarchas(false, true);
					System.out.println(
							"Marcha actual: " + getMarchaEngranada() + " Velocidad en KmH: " + getVelocidadActualKmH());
				} while (velocidadFinal < velocidadActualKmH);
			}
		} while (getVelocidadActualKmH() != velocidadFinal);
		if (getVelocidadActualKmH() == 0) {
			parar();
		}
	}

	/**
	 * Realiza cambios de marcha al acelerar o frenar.
	 *
	 * @param acelerando Indica si se está acelerando.
	 * @param frenando   Indica si se está frenando.
	 */
	private void cambioDeMarchas(boolean acelerando, boolean frenando) {
		if (acelerando) {
			switch (marchaEngranada) {
			case 0 -> {
				marchaEngranada++;
				velocidadActualKmH = 30;
			}
			case 1 -> {
				marchaEngranada++;
				velocidadActualKmH = 50;
			}
			case 2 -> {
				marchaEngranada++;
				velocidadActualKmH = 70;
			}
			case 3 -> {
				marchaEngranada++;
				velocidadActualKmH = 100;
			}
			case 4 -> {
				marchaEngranada++;
				velocidadActualKmH = 120;
			}
			}
		}
		if (frenando) {
			switch (marchaEngranada) {
			case 1 -> {
				marchaEngranada--;
				velocidadActualKmH = 0;
			}
			case 2 -> {
				marchaEngranada--;
				velocidadActualKmH = 30;
			}
			case 3 -> {
				marchaEngranada--;
				velocidadActualKmH = 50;
			}
			case 4 -> {
				marchaEngranada--;
				velocidadActualKmH = 70;
			}
			case 5 -> {
				marchaEngranada--;
				velocidadActualKmH = 100;
			}
			}
		}
	}
}
