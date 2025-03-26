package ejanalisis.ej2;

/**
 * Representa una revista con un número y un año de publicación. Hereda de la
 * clase abstracta Ficha.
 */
public class Revista extends Ficha {
	/**
	 * Número de la revista.
	 */
	private int numero;

	/**
	 * Año de publicación de la revista.
	 */
	private int año;

	/**
	 * Constructor de la clase Revista. Crea una revista con un ID, título, número y
	 * año específicos.
	 * 
	 * @param id     el identificador único de la revista
	 * @param titulo el título de la revista
	 * @param numero el número de la revista
	 * @param año    el año de publicación de la revista
	 */
	public Revista(int id, String titulo, int numero, int año) {
		super(id, titulo);
		this.numero = numero;
		this.año = año;
	}

	/**
	 * Obtiene el número de la revista.
	 * 
	 * @return el número de la revista
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Obtiene el año de publicación de la revista.
	 * 
	 * @return el año de publicación de la revista
	 */
	public int getAño() {
		return año;
	}

	/**
	 * Presta la revista. Imprime un mensaje indicando que la revista ha sido
	 * prestada por 10 días.
	 */
	@Override
	public void prestar() {
		System.out.println("La revista ha sido prestada para los siguientes 10 días");
	}
}
