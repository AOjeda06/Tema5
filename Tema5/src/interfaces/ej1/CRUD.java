package interfaces.ej1;

import java.util.ArrayList;

/**
 * Clase que gestiona la base de datos de socios y proporciona métodos para
 * añadir socios y mostrar la información almacenada.
 */
public class CRUD {
	/** Lista que actúa como la base de datos de socios. */
	static ArrayList<Socio> BBDD = new ArrayList<>();

	/**
	 * Añade un socio a la base de datos.
	 * 
	 * @param s El socio que se desea añadir.
	 * @return true si el socio se añade correctamente, false en caso contrario.
	 */
	public static boolean añadirSocio(Socio s) {
		return BBDD.add(s);
	}

	/**
	 * Imprime los datos de todos los socios almacenados en la base de datos. Los
	 * socios se ordenan previamente por su ID.
	 */
	public static void imprimirBBDD() {
		for (Socio elemento : BBDD) {
			System.out.println(elemento);
			System.out.println();
		}
	}
}
