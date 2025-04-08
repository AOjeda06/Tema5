package ejexcepciones.ej3;

/**
 * Excepción lanzada cuando el precio del artículo no es válido.
 * Esta excepción asegura que los valores proporcionados para el precio del artículo
 * sean correctos, evitando precios negativos que no tienen sentido en este contexto.
 */
@SuppressWarnings("serial")
public class InvalidPriceException extends Exception {

    /**
     * Constructor por defecto que lanza un mensaje estándar indicando que
     * el precio del artículo no puede ser negativo.
     */
    public InvalidPriceException() {
        super("El precio del artículo no puede ser negativo.");
    }

    /**
     * Constructor que permite especificar un mensaje personalizado para la excepción.
     *
     * @param message El mensaje de error que describe la causa de la excepción.
     */
    public InvalidPriceException(String message) {
        super(message);
    }
}
