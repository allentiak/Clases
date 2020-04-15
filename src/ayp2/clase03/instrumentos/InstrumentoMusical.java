package ayp2.clase03.instrumentos;

// Esta clase, al ser abstracta, no se puede instanciar
abstract public class InstrumentoMusical {

	// Atributos
	private String nombre;
	private static String descripcion;

	// Constructor (sólo invocable por subclases)
	protected InstrumentoMusical(String miNombre, String miDescripcion) {
		setNombre(miNombre);
		setDescripcion(miDescripcion);
	};

	// Este método abstracto deberá ser implementado por las subclases
	public abstract void tocar();

	// A partir de acá, sólo nos quedan setters y getters

	private void setNombre(String nuevoNombre) {
		nombre = nuevoNombre;
	}

	private String getNombre() {
		return nombre;
	}

	private void setDescripcion(String nuevaDescripcion) {
		descripcion = nuevaDescripcion;
	}

	private String getDescripcion() {
		return descripcion;
	}

}
