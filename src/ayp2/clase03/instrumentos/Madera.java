package ayp2.clase03.instrumentos;

public class Madera extends Viento {

	public Madera(String miNombre) {
		super(miNombre, "Soy un instrumento musical de viento. (De madera.)");
	}

	public void tocar() {
		System.out.println("Tocando una Madera...");
	}

}
