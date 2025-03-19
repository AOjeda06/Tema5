package interfaces.ej1;

import java.util.ArrayList;
import java.util.Collections;

public class CRUD {
	static ArrayList<Socio> BBDD = new ArrayList<>();

	public static boolean añadirSocio(Socio s) {
		return BBDD.add(s);
	}

	public static void imprimirBBDD() {
		Collections.sort(BBDD);
		for (Socio elemento : BBDD) {
			System.out.println(elemento);
			System.out.println();
		}
	}
}
