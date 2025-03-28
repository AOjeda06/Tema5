package ejanalisis.ej4;

import java.util.HashSet;

/**
 * Clase para gestionar una agenda de contactos usando operaciones CRUD (Crear,
 * Leer, Actualizar y Eliminar).
 */
public class CRUD {
	/**
	 * Colección que simula la base de datos de contactos.
	 */
	private HashSet<Contacto> agenda;

	/**
	 * Constructor para inicializar la agenda.
	 */
	public CRUD() {
		agenda = new HashSet<>();
	}

	/**
	 * Añade un contacto a la agenda.
	 *
	 * @param contacto El contacto que se desea añadir.
	 * @return true si el contacto fue añadido correctamente, false si ya existe.
	 */
	public boolean guardarContacto(Contacto contacto) {
		return agenda.add(contacto);
	}

	/**
	 * Elimina un contacto de la agenda.
	 *
	 * @param contacto El contacto que se desea eliminar.
	 * @return true si el contacto fue eliminado correctamente, false si no existe.
	 */
	public boolean eliminarContacto(Contacto contacto) {
		return agenda.remove(contacto);
	}

	/**
	 * Muestra todos los contactos de la agenda.
	 */
	public void verContactos() {
		if (agenda.isEmpty()) {
			System.out.println("La agenda está vacía.");
		} else {
			System.out.println("Contactos en la agenda:");
			for (Contacto contacto : agenda) {
				System.out.println(contacto);
			}
		}
	}

	/**
	 * Actualiza un contacto en la agenda. Elimina el contacto anterior y añade el
	 * nuevo.
	 *
	 * @param contactoAntiguo El contacto que se desea actualizar.
	 * @param contactoNuevo   El nuevo contacto con información actualizada.
	 * @return true si se actualizó correctamente, false si el contacto antiguo no
	 *         existe.
	 */
	public boolean actualizarContacto(Contacto contactoAntiguo, Contacto contactoNuevo) {
		if (agenda.remove(contactoAntiguo)) {
			return agenda.add(contactoNuevo);
		}
		return false;
	}
}
