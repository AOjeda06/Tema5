package interfaces.ej1;

public class Socio implements Comparable<Socio> {
	private int id;
	private String nombre;
	private int edad;

	public Socio(int id, String nombre, int edad) {
		if (id <= 0) {
			throw new IllegalArgumentException("ID no válido");
		}
		if (nombre.isBlank() || nombre.isEmpty()) {
			throw new IllegalArgumentException("Nombre no válido");
		}
		if (edad <= 0) {
			throw new IllegalArgumentException("Edad no válida");
		}
		this.id = id;
		this.edad = edad;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return id + " " + nombre + " " + edad;
	}

	@Override
	public int compareTo(Socio o) {
		int res = 0;

		if (this.id < o.id) {
			res = -1;
		}
		if (this.id > o.id) {
			res = 1;
		}

		return res;
	}

}
