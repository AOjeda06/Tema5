package ejercicio5;

/**
 * Clase que representa un triángulo y extiende la clase abstracta Poligono.
 * Permite calcular el área de un triángulo y manejar las dimensiones de sus
 * lados.
 */
public class Triangulo extends Poligono {

	private double lado1 = 1;
	private double lado2 = 1;
	private double lado3 = 1;

	/**
	 * Constructor sin parámetros que inicializa un triángulo equilátero con lados
	 * de longitud 1. El número de lados se fija en 3, ya que siempre es un
	 * triángulo.
	 */
	public Triangulo() {
		super(3);
	}

	/**
	 * Constructor que inicializa un triángulo con las dimensiones especificadas
	 * para sus lados.
	 * 
	 * @param lado1 La longitud del primer lado del triángulo (debe ser mayor a 0).
	 * @param lado2 La longitud del segundo lado del triángulo (debe ser mayor a 0).
	 * @param lado3 La longitud del tercer lado del triángulo (debe ser mayor a 0).
	 * @throws IllegalArgumentException Si alguno de los lados tiene un valor menor
	 *                                  o igual a 0.
	 */
	public Triangulo(double lado1, double lado2, double lado3) {
		super(3);
		if (lado1 <= 0) {
			throw new IllegalArgumentException("El valor del lado 1 no es valido");
		}
		if (lado2 <= 0) {
			throw new IllegalArgumentException("El valor del lado 2 no es valido");
		}
		if (lado3 <= 0) {
			throw new IllegalArgumentException("El valor del lado 3 no es valido");
		}
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	/**
	 * Calcula el área del triángulo utilizando la fórmula de Herón.
	 * 
	 * @return El área del triángulo.
	 */
	@Override
	public double area() {
		// Calculamos el semiperímetro
		double semiperimetro = (lado1 + lado2 + lado3) / 2;

		// Usamos la fórmula de Herón para calcular el área
		return Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
	}

	/**
	 * Representación en forma de cadena del triángulo.
	 * 
	 * @return Una cadena que describe las dimensiones de los lados del triángulo.
	 */
	@Override
	public String toString() {
		return "Triangulo: \n Lado1: " + lado1 + "\n Lado2: " + lado2 + "\n Lado3: " + lado3;
	}

	/**
	 * Obtiene la longitud del primer lado del triángulo.
	 * 
	 * @return La longitud del lado1.
	 */
	public double getLado1() {
		return lado1;
	}

	/**
	 * Establece la longitud del primer lado del triángulo.
	 * 
	 * @param lado1 La nueva longitud del lado1 (debe ser mayor a 0).
	 */
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	/**
	 * Obtiene la longitud del segundo lado del triángulo.
	 * 
	 * @return La longitud del lado2.
	 */
	public double getLado2() {
		return lado2;
	}

	/**
	 * Establece la longitud del segundo lado del triángulo.
	 * 
	 * @param lado2 La nueva longitud del lado2 (debe ser mayor a 0).
	 */
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	/**
	 * Obtiene la longitud del tercer lado del triángulo.
	 * 
	 * @return La longitud del lado3.
	 */
	public double getLado3() {
		return lado3;
	}

	/**
	 * Establece la longitud del tercer lado del triángulo.
	 * 
	 * @param lado3 La nueva longitud del lado3 (debe ser mayor a 0).
	 */
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
}
