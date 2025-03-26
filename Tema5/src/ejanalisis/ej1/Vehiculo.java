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
	 * final deseada, asegurando que el motor se apague y la marcha quede en punto
	 * muerto si es necesario.
	 *
	 * @param velocidadFinal Velocidad objetivo en kilómetros por hora.
	 */
	public void controlDeVelocidadAdaptativo(int velocidadFinal) {
		if (getVelocidadActualKmH() == 0) {
			arrancar();
			System.out.println("Motor arrancado. Marcha actual: 0, Velocidad actual: 0 Km/h.");
		}

		System.out.println("Inicializando control adaptativo...");
		while (getVelocidadActualKmH() != velocidadFinal) {
			if (velocidadFinal > getVelocidadActualKmH()) {
				cambioDeMarchas(true); // Acelerar
			} else if (velocidadFinal < getVelocidadActualKmH()) {
				cambioDeMarchas(false); // Frenar
			}

			System.out.printf("Marcha actual: %d, Velocidad actual: %d Km/h.%n", getMarchaEngranada(),
					getVelocidadActualKmH());

			// Ajustar velocidad al rango si está en un valor intermedio
			if (getVelocidadActualKmH() != velocidadFinal) {
				ajustarVelocidadAlRango(velocidadFinal);
				System.out.printf("Velocidad ajustada al rango: %d Km/h.%n", getVelocidadActualKmH());
			}
		}

		if (getVelocidadActualKmH() == 0) {
			bajarMarcha(); // Poner la marcha en punto muerto
			parar();
			System.out.printf("Motor apagado. Marcha actual: 0, Velocidad actual: %d Km/h.%n", getVelocidadActualKmH());
		} else {
			System.out.printf("Velocidad objetivo alcanzada: %d Km/h.%n", getVelocidadActualKmH());
		}
	}

	/**
	 * Realiza cambios de marcha al acelerar o frenar. Ajusta la velocidad y la
	 * marcha engranada en función del rango predefinido para cada marcha.
	 *
	 * @param acelerando Indica si se está acelerando.
	 * @param frenando   Indica si se está frenando.
	 */
	private void cambioDeMarchas(boolean acelerando) {
		if (acelerando) {
			switch (marchaEngranada) {
			case 0 -> {
				marchaEngranada = 1;
				velocidadActualKmH = 30;
			}
			case 1 -> {
				marchaEngranada = 2;
				velocidadActualKmH = 50;
			}
			case 2 -> {
				marchaEngranada = 3;
				velocidadActualKmH = 70;
			}
			case 3 -> {
				marchaEngranada = 4;
				velocidadActualKmH = 100;
			}
			case 4 -> {
				marchaEngranada = 5;
				velocidadActualKmH = 120;
			}
			default -> System.out.println("Ya estás en la marcha más alta.");
			}
		}

		if (!acelerando) {
			switch (marchaEngranada) {
			case 5 -> {
				marchaEngranada = 4;
				velocidadActualKmH = 100;
			}
			case 4 -> {
				marchaEngranada = 3;
				velocidadActualKmH = 70;
			}
			case 3 -> {
				marchaEngranada = 2;
				velocidadActualKmH = 50;
			}
			case 2 -> {
				marchaEngranada = 1;
				velocidadActualKmH = 30;
			}
			case 1 -> {
				marchaEngranada = 0;
				velocidadActualKmH = 0;
			}
			default -> System.out.println("Ya estás en la marcha más baja.");
			}
		}
	}

	/**
	 * Ajusta la velocidad actual al rango correspondiente en función de la marcha.
	 *
	 * @param velocidadFinal Velocidad objetivo en kilómetros por hora.
	 */
	private void ajustarVelocidadAlRango(int velocidadFinal) {
		if (marchaEngranada == 1 && velocidadFinal >= 0 && velocidadFinal <= 30) {
			velocidadActualKmH = velocidadFinal;
		} else if (marchaEngranada == 2 && velocidadFinal > 30 && velocidadFinal <= 50) {
			velocidadActualKmH = velocidadFinal;
		} else if (marchaEngranada == 3 && velocidadFinal > 50 && velocidadFinal <= 70) {
			velocidadActualKmH = velocidadFinal;
		} else if (marchaEngranada == 4 && velocidadFinal > 70 && velocidadFinal <= 100) {
			velocidadActualKmH = velocidadFinal;
		} else if (marchaEngranada == 5 && velocidadFinal > 100) {
			velocidadActualKmH = velocidadFinal;
		}
	}
}
