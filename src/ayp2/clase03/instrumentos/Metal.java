package ayp2.clase03.instrumentos;

public class Metal extends Viento {

	public Metal(String miNombre) {
		super(miNombre, "Soy un instrumento musical de viento. (De metal.)");
	}

	public void tocar() {
		System.out.println("Tocando un Metal...");
	}

}
