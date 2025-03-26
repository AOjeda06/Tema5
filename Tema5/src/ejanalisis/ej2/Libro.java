package ejanalisis.ej2;

/**
 * Representa un libro con un autor y una editorial. Hereda de la clase
 * abstracta Ficha.
 */
public class Libro extends Ficha {
	/**
	 * Autor del libro.
	 */
	private String autor;

	/**
	 * Editorial del libro.
	 */
	private String editorial;

	/**
	 * Constructor de la clase Libro. Crea un libro con un ID, título, autor y
	 * editorial específicos.
	 * 
	 * @param id        el identificador único del libro
	 * @param titulo    el título del libro
	 * @param autor     el nombre del autor del libro
	 * @param editorial la editorial que publica el libro
	 */
	public Libro(int id, String titulo, String autor, String editorial) {
		super(id, titulo);
		this.autor = autor;
		this.editorial = editorial;
	}

	/**
	 * Obtiene el autor del libro.
	 * 
	 * @return el nombre del autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Obtiene la editorial del libro.
	 * 
	 * @return el nombre de la editorial
	 */
	public String getEditorial() {
		return editorial;
	}

	/**
	 * Presta el libro. Imprime un mensaje indicando que el libro ha sido prestado
	 * por 15 días.
	 */
	@Override
	public void prestar() {
		System.out.println("El libro ha sido prestado para los siguientes 15 días.");
	}
}
