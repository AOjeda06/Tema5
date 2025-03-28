package ejanalisis.ej4;

public class Main {
	public static void main(String[] args) {
		// Inicializar CRUD
		CRUD crud = new CRUD();

		// ENCABEZADO: Operaciones CRUD
		System.out.println("===== SIMULACIÓN DE UNA AGENDA DE CONTACTOS =====\n");

		// Operación: Guardar contactos
		System.out.println("Operación: Guardar contactos\n");
		Contacto contacto1 = new ContactoPersona("Juan Pérez", 612345678, "15/05/1985");
		Contacto contacto2 = new ContactoEmpresa("María López", 691234567, "www.empresa.com");
		Contacto contacto3 = new ContactoPersona("Carlos García", 681234567, "08/08/1990");

		System.out.println("Guardando contacto: " + contacto1);
		System.out.println(
				crud.guardarContacto(contacto1) ? "Contacto añadido correctamente.\n" : "El contacto ya existe.\n");

		System.out.println("Guardando contacto: " + contacto2);
		System.out.println(
				crud.guardarContacto(contacto2) ? "Contacto añadido correctamente.\n" : "El contacto ya existe.\n");

		System.out.println("Guardando contacto: " + contacto3);
		System.out.println(
				crud.guardarContacto(contacto3) ? "Contacto añadido correctamente.\n" : "El contacto ya existe.\n");

		// Operación: Ver contactos
		System.out.println("Operación: Ver todos los contactos\n");
		crud.verContactos();
		System.out.println();

		// Operación: Actualizar contacto
		System.out.println("Operación: Actualizar contacto\n");
		Contacto contactoActualizado = new ContactoPersona("Carlos García", 681111111, "08/08/1991");
		System.out.println("Actualizando contacto: " + contacto3 + " a " + contactoActualizado);
		System.out.println(
				crud.actualizarContacto(contacto3, contactoActualizado) ? "Contacto actualizado correctamente.\n"
						: "El contacto no existe.\n");

		// Operación: Ver contactos después de actualización
		System.out.println("Ver contactos después de actualizar:");
		crud.verContactos();
		System.out.println();

		// Operación: Eliminar contacto
		System.out.println("Operación: Eliminar contacto\n");
		System.out.println("Eliminando contacto: " + contacto2);
		System.out.println(
				crud.eliminarContacto(contacto2) ? "Contacto eliminado correctamente.\n" : "El contacto no existe.\n");

		// Operación: Ver contactos después de eliminación
		System.out.println("Ver contactos después de eliminación:");
		crud.verContactos();
	}
}
