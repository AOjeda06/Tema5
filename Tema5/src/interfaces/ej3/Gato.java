package interfaces.ej3;

/**
 * Clase que representa a un gato como un animal doméstico. Extiende la clase
 * abstracta AnimalDomestico.
 */
public class Gato extends AnimalDomestico {

	/**
	 * Constructor que inicializa las propiedades del gato.
	 *
	 * @param nombre El nombre del gato.
	 * @param raza   La raza del gato.
	 * @param peso   El peso del gato en kilogramos.
	 * @param color  El color del gato.
	 */
	public Gato(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
	}

	/**
	 * Método que define el sonido que hace el gato. En este caso, el gato maúlla.
	 */
	@Override
	public void hacerRuido() {
		System.out.println(nombre + " está maullando.");
	}

	/**
	 * Método que indica si el gato hace caso. Se calcula una probabilidad del 5% de
	 * que haga caso.
	 *
	 * @return true si el gato hace caso, false en caso contrario.
	 */
	@Override
	public boolean hacerCaso() {
		return Math.random() < 0.05; // 5% de probabilidad de hacer caso
	}

	/**
	 * Método específico para los gatos que indica que el gato ha tosido una bola de
	 * pelo.
	 */
	public void toserBolaPelo() {
		System.out.println(nombre + " ha tosido una bola de pelo.");
	}
}
