package ejercicio4;

/**
 * Clase que representa un electrodoméstico con propiedades como precio base,
 * peso, color y consumo energético.
 */
public class Electrodomestico {

	private double precioBase = 100;
	private double peso = 5;
	private ColoresTipo color = ColoresTipo.BLANCO;
	private ConsumoTipo consumo = ConsumoTipo.F;

	/**
	 * Enum que representa los colores disponibles para el electrodoméstico.
	 */
	enum ColoresTipo {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}

	/**
	 * Enum que representa los niveles de consumo energético del electrodoméstico.
	 */
	enum ConsumoTipo {
		A, B, C, D, E, F
	}

	/**
	 * Constructor que inicializa el precio y el peso del electrodoméstico.
	 * 
	 * @param precio El precio base del electrodoméstico.
	 * @param peso   El peso del electrodoméstico.
	 */
	public Electrodomestico(double precio, double peso) {
		this.precioBase = precio;
		this.peso = peso;
	}

	/**
	 * Constructor que inicializa el precio, peso, color y consumo del
	 * electrodoméstico.
	 * 
	 * @param precio  El precio base del electrodoméstico.
	 * @param peso    El peso del electrodoméstico.
	 * @param color   El color del electrodoméstico.
	 * @param consumo El consumo energético del electrodoméstico.
	 */
	public Electrodomestico(double precio, double peso, String color, char consumo) {
		this.precioBase = precio;
		this.peso = peso;
		this.color = comprobarColor(color);
		this.consumo = comprobarConsumoEnergetico(consumo);
	}

	/**
	 * Obtiene el precio base del electrodoméstico.
	 * 
	 * @return El precio base del electrodoméstico.
	 */
	public double getPrecioBase() {
		return precioBase;
	}

	/**
	 * Establece el precio base del electrodoméstico.
	 * 
	 * @param precioBase El nuevo precio base del electrodoméstico.
	 */
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	/**
	 * Obtiene el peso del electrodoméstico.
	 * 
	 * @return El peso del electrodoméstico.
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * Obtiene el color del electrodoméstico.
	 * 
	 * @return El color del electrodoméstico.
	 */
	public ColoresTipo getColor() {
		return color;
	}

	/**
	 * Obtiene el consumo energético del electrodoméstico.
	 * 
	 * @return El consumo energético del electrodoméstico.
	 */
	public ConsumoTipo getConsumo() {
		return consumo;
	}

	/**
	 * Comprueba el nivel de consumo energético basado en una letra.
	 * 
	 * @param letra La letra que representa el nivel de consumo.
	 * @return El tipo de consumo correspondiente.
	 */
	private ConsumoTipo comprobarConsumoEnergetico(char letra) {
		ConsumoTipo devolver = ConsumoTipo.F;
		for (ConsumoTipo valor : ConsumoTipo.values()) {
			if (valor.name().charAt(0) == letra) {
				devolver = valor;
				break;
			}
		}
		return devolver;
	}

	/**
	 * Comprueba el color basado en un nombre.
	 * 
	 * @param color El nombre del color.
	 * @return El tipo de color correspondiente.
	 */
	private ColoresTipo comprobarColor(String color) {
		ColoresTipo devolver = ColoresTipo.BLANCO;
		for (ColoresTipo valor : ColoresTipo.values()) {
			if (valor.name().equalsIgnoreCase(color)) {
				devolver = valor;
				break;
			}
		}
		return devolver;
	}

	/**
	 * Calcula el precio final del electrodoméstico basado en su consumo energético
	 * y peso.
	 * 
	 */
	public void precioFinal() {
		switch (this.consumo) {
		case A -> this.precioBase += 100;
		case B -> this.precioBase += 80;
		case C -> this.precioBase += 60;
		case D -> this.precioBase += 50;
		case E -> this.precioBase += 30;
		case F -> this.precioBase += 10;
		}

		if (this.peso > 80) {
			this.precioBase += 100;
		} else if (this.peso > 50) {
			this.precioBase += 80;
		} else if (this.peso > 20) {
			this.precioBase += 50;
		} else {
			this.precioBase += 10;
		}

	}
}
