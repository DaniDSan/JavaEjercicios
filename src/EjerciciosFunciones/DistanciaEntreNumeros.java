package EjerciciosFunciones;

public class DistanciaEntreNumeros {
	public boolean ComprobarDistancia(float a, float b, float rango) {
		float aux = 0;
		if(a - b < 0) {
			aux = (a - b) * -1;
		}else
			aux = a - b;
		if(aux <= rango)
			return true;
		else
			return false;
	}

}
