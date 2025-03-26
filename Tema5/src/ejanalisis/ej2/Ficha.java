package ejanalisis.ej2;

/**
 * Representa una ficha con un identificador único y un título. Esta clase es
 * abstracta y define un método abstracto que debe ser implementado por las
 * subclases.
 */
public abstract class Ficha {
	/**
	 * Identificador único de la ficha.
	 */
	private int id;

	/**
	 * Título de la ficha.
	 */
	private String titulo;

	/**
	 * Constructor de la clase Ficha. Crea una nueva ficha con un ID y un título
	 * específicos.
	 * 
	 * @param id     el identificador único de la ficha
	 * @param titulo el título de la ficha
	 */
	public Ficha(int id, String titulo) {
		this.id = id;
		this.titulo = titulo;
	}

	/**
	 * Obtiene el identificador único de la ficha.
	 * 
	 * @return el identificador de la ficha
	 */
	public int getId() {
		return id;
	}

	/**
	 * Obtiene el título de la ficha.
	 * 
	 * @return el título de la ficha
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Método abstracto para prestar la ficha. Debe ser implementado por las
	 * subclases concretas.
	 */
	public abstract void prestar();
}
