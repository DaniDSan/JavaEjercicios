package EjerciciosArrays;

public class MatrizMagica {

	public static void main(String[] args) {
		int[][] array1 = { { 1, 2, 3, 4 }, { 2, 3, 4, 1 }, { 4, 3, 2, 1 }, { 3, 1, 4, 2 } };
		/*
		 * for (int i = 0; i < array1.length; i++) { for (int j = 0; j <
		 * array1[i].length; j++) { array1[i][j] = i + 1; } }
		 */
		System.out.print(Comprobar(array1));
	}

	public static boolean Comprobar(int[][] array1) {
		int totalPrimeraFila = 0;
		for (int j = 0; j < array1[0].length; j++) {
			totalPrimeraFila += array1[0][j];
		}

		for (int i = 1; i < array1.length; i++) {
			int totalFila = 0;
			for (int j = 0; j < array1[i].length; j++) {
				totalFila += array1[i][j];
			}
			if (totalFila != totalPrimeraFila) {
				return false;
			}
		}
		return true;
	}
}
