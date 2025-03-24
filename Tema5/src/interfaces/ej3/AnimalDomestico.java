package interfaces.ej3;

/**
 * Clase abstracta que representa un animal doméstico. Implementa la interfaz
 * Animal.
 */
public abstract class AnimalDomestico implements Animal {

	/**
	 * El nombre del animal.
	 */
	protected String nombre;

	/**
	 * La raza del animal.
	 */
	protected String raza;

	/**
	 * El peso del animal en kilogramos.
	 */
	protected double peso;

	/**
	 * El color del animal.
	 */
	protected String color;

	/**
	 * Constructor que inicializa los atributos básicos de un animal doméstico.
	 *
	 * @param nombre El nombre del animal.
	 * @param raza   La raza del animal.
	 * @param peso   El peso del animal.
	 * @param color  El color del animal.
	 */
	public AnimalDomestico(String nombre, String raza, double peso, String color) {
		this.nombre = nombre;
		this.raza = raza;
		this.peso = peso;
		this.color = color;
	}

	/**
	 * Método que indica que el animal ha sido vacunado.
	 */
	public void vacunar() {
		System.out.println(nombre + " ha sido vacunado.");
	}

	/**
	 * Método que indica que el animal está comiendo.
	 */
	@Override
	public void comer() {
		System.out.println(nombre + " está comiendo.");
	}

	/**
	 * Método que indica que el animal está durmiendo.
	 */
	@Override
	public void dormir() {
		System.out.println(nombre + " está durmiendo.");
	}

	/**
	 * Método abstracto que define si el animal hace caso.
	 *
	 * @return true si el animal hace caso, false en caso contrario.
	 */
	public abstract boolean hacerCaso();

	/**
	 * Método abstracto que define el sonido que hace el animal.
	 */
	@Override
	public abstract void hacerRuido();
}
