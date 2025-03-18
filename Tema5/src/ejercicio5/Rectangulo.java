package ejercicio5;

/**
 * Clase que representa un rectángulo y extiende la clase abstracta Poligono.
 * Permite calcular el área de un rectángulo y manejar las dimensiones de sus
 * lados.
 */
public class Rectangulo extends Poligono {

	private double lado1 = 1;
	private double lado2 = 1;

	/**
	 * Constructor sin parámetros que inicializa un rectángulo con valores
	 * predeterminados. El número de lados se fija en 4, ya que siempre es un
	 * rectángulo.
	 */
	public Rectangulo() {
		super(4);
	}

	/**
	 * Constructor de la clase Rectangulo que inicializa un rectángulo con las
	 * dimensiones especificadas.
	 * 
	 * @param lado1 La longitud del primer lado del rectángulo (debe ser mayor a 0).
	 * @param lado2 La longitud del segundo lado del rectángulo (debe ser mayor a
	 *              0).
	 * @throws IllegalArgumentException Si alguno de los lados es menor o igual a 0.
	 */
	public Rectangulo(double lado1, double lado2) {
		super(4);
		if (lado1 <= 0) {
			throw new IllegalArgumentException("Valor no válido para lado 1");
		}
		if (lado2 <= 0) {
			throw new IllegalArgumentException("Valor no válido para lado 2");
		}
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	/**
	 * Obtiene la longitud del primer lado del rectángulo.
	 * 
	 * @return La longitud del lado1.
	 */
	public double getLado1() {
		return lado1;
	}

	/**
	 * Establece la longitud del primer lado del rectángulo.
	 * 
	 * @param lado1 La nueva longitud del lado1 (debe ser mayor a 0).
	 */
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	/**
	 * Obtiene la longitud del segundo lado del rectángulo.
	 * 
	 * @return La longitud del lado2.
	 */
	public double getLado2() {
		return lado2;
	}

	/**
	 * Establece la longitud del segundo lado del rectángulo.
	 * 
	 * @param lado2 La nueva longitud del lado2 (debe ser mayor a 0).
	 */
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	/**
	 * Calcula el área del rectángulo usando las dimensiones de sus lados.
	 * 
	 * @return El área del rectángulo.
	 */
	@Override
	public double area() {
		return lado1 * lado2;
	}

	/**
	 * Representación en forma de cadena del rectángulo.
	 * 
	 * @return Una cadena que describe las dimensiones del rectángulo.
	 */
	@Override
	public String toString() {
		return "Rectangulo: \n Lado1: " + lado1 + "\n Lado2: " + lado2;
	}
}
