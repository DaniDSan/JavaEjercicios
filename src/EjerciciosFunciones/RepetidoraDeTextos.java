package EjerciciosFunciones;

public class RepetidoraDeTextos {
	public String RepetirTexto(int n, String original) {
		String text = "";
		
		for(int i = 0; i < n; i++) {
			text += original;
		}
		return text;
	}
}
