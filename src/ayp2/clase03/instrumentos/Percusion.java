package ayp2.clase03.instrumentos;

public class Percusion extends InstrumentoMusical implements Lustrable {

	public Percusion(String miNombre) {
		super(miNombre, "Soy un instrumento musical de Percusión.");
	};

	public void lustrar() {
		System.out.println("Lustrando un instrumento de Percusión...");
	}

	public void tocar() {
		System.out.println("Tocando un instrumento de Percusión...");
	}

}
