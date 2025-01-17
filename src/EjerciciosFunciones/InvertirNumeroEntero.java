package EjerciciosFunciones;

public class InvertirNumeroEntero {
	public int InvertirNum(int n) {
		int naux = 0;
		
		while (n % 10 != 0) {
			int resto = n % 10;
			naux = naux * 10 + resto;
			
			n /= 10;
		}
		return naux;
	}
}
