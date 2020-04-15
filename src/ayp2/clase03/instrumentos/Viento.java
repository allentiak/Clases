package ayp2.clase03.instrumentos;

public abstract class Viento extends InstrumentoMusical implements Afinable, Lustrable {

	protected Viento(String miNombre, String miDescripcion) {
		super(miNombre, miDescripcion);
	};

	public void afinarManualmente() {
		System.out.println("Afinando manualmente un viento... (No importa de qué tipo.)");
	}

	public void afinarAutomaticamente() {
		System.out.println("Afinando automáticamente un viento... (No importa de qué tipo.)");
	}

	public void lustrar() {
		System.out.println("Lustrando un Viento");
	}

}
