package ejanalisis.ej2;

/**
 * Representa un DVD con un director, año de lanzamiento y un género específico.
 * Hereda de la clase abstracta Ficha.
 */
public class DVD extends Ficha {
	/**
	 * Director del DVD.
	 */
	private String director;

	/**
	 * Año de lanzamiento del DVD.
	 */
	private int año;

	/**
	 * Género del contenido del DVD. Puede ser película, documental o serie.
	 */
	private Genero tipo;

	/**
	 * Enum que define los géneros posibles para un DVD.
	 */
	enum Genero {
		PELICULA, DOCUMENTAL, SERIE
	}

	/**
	 * Constructor de la clase DVD. Crea un DVD con un ID, título, director, año y
	 * tipo de género.
	 * 
	 * @param id       el identificador único del DVD
	 * @param titulo   el título del DVD
	 * @param director el director del DVD
	 * @param año      el año de lanzamiento del DVD
	 * @param tipo     el género del DVD (PELICULA, DOCUMENTAL o SERIE)
	 */
	public DVD(int id, String titulo, String director, int año, String tipo) {
		super(id, titulo);
		this.director = director;
		this.año = año;
		this.tipo = Genero.valueOf(tipo.toUpperCase());
	}

	/**
	 * Obtiene el director del DVD.
	 * 
	 * @return el nombre del director
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * Obtiene el año de lanzamiento del DVD.
	 * 
	 * @return el año de lanzamiento
	 */
	public int getAño() {
		return año;
	}

	/**
	 * Obtiene el género del DVD.
	 * 
	 * @return el género del DVD
	 */
	public Genero getTipo() {
		return tipo;
	}

	/**
	 * Presta el DVD. Imprime un mensaje indicando que el DVD ha sido prestado por 5
	 * días.
	 */
	@Override
	public void prestar() {
		System.out.println("El DVD ha sido prestado para los siguientes 5 días.");
	}
}
