package MasEjerciciosFunciones;

public class EjercicioRecursividad {
	
	 public static void main(String[] args) {
		 System.out.println(CalcularPotencia(3, 3));
	 }
	
	public static int CalcularPotencia(int base, int exponente) {
		if (exponente == 0) {
			return 1;
		}
		return base * CalcularPotencia(base, exponente - 1);
	}
}
