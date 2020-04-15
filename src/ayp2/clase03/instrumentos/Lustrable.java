package ayp2.clase03.instrumentos;

public interface Lustrable {

	public default void lustrar() {
		System.out.println(
				"Estoy lustrando un instrumento cualquiera... (Por defecto, todos se lustran de la misma forma.)");
	}

}
