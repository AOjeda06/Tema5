package interfaces.ej3;

/**
 * Clase que representa a un perro como un animal doméstico. Extiende la clase
 * abstracta AnimalDomestico.
 */
public class Perro extends AnimalDomestico {

	/**
	 * Constructor que inicializa las propiedades del perro.
	 *
	 * @param nombre El nombre del perro.
	 * @param raza   La raza del perro.
	 * @param peso   El peso del perro en kilogramos.
	 * @param color  El color del perro.
	 */
	public Perro(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
	}

	/**
	 * Método que define el sonido que hace el perro. En este caso, el perro ladra.
	 */
	@Override
	public void hacerRuido() {
		System.out.println(nombre + " está ladrando.");
	}

	/**
	 * Método que indica si el perro hace caso. Se calcula una probabilidad del 90%
	 * de que haga caso.
	 *
	 * @return true si el perro hace caso, false en caso contrario.
	 */
	@Override
	public boolean hacerCaso() {
		return Math.random() < 0.9; // 90% de probabilidad de hacer caso
	}

	/**
	 * Método específico para los perros que indica que están siendo sacados a
	 * pasear.
	 */
	public void sacarPaseo() {
		System.out.println(nombre + " está siendo sacado a pasear.");
	}
}
