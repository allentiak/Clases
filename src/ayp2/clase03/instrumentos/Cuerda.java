package ayp2.clase03.instrumentos;

public class Cuerda extends InstrumentoMusical implements Afinable {

	public Cuerda(String miNombre) {
		super(miNombre, "Soy un instrumento musical de Cuerda.");
	};

	public void afinarManualmente() {
		System.out.println("Afinando manualmente una Cuerda...");
	}

	public void afinarAutomaticamente() {
		System.out.println("Afinando automáticamente una Cuerda...");
	}

	public void tocar() {
		System.out.println("Tocando una Cuerda...");
	}

}
