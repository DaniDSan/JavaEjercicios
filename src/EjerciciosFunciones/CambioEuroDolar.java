package EjerciciosFunciones;

public class CambioEuroDolar {
	public float CambioMoneda(float euros, float tipoCambio) {
		if(tipoCambio < 0.1f || tipoCambio > 100.0f)
			return 0.0f;
		else
			return euros * tipoCambio;
	}
}
