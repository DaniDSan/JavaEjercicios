package EjerciciosArrays;

public class MatrizMagica {

	public static void main(String[] args) {
		int[][] array1 = { { 1, 2, 3, 4 }, { 2, 3, 4, 1 }, { 4, 3, 2, 1 }, { 3, 1, 4, 2 } };
		int[][] array2 = { { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 } };
		/*
		 * for (int i = 0; i < array1.length; i++) { for (int j = 0; j <
		 * array1[i].length; j++) { array1[i][j] = i + 1; } }
		 */
		System.out.print(Comprobar(array2));
	}

	public static boolean Comprobar(int[][] array1) {
		int totalPrimeraFila = 0;
		int totalPrimeraColumna = 0;
		for (int j = 0; j < array1[0].length; j++) {
			totalPrimeraFila += array1[0][j];
		}

		for (int i = 0; i < array1.length; i++) {
			totalPrimeraColumna += array1[i][0];
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

		for (int i = 0; i < array1[i].length; i++) {
			int totalColumna = 0;
			for (int j = 1; j < array1.length; j++) {
				totalColumna += array1[i][j];
				if (totalColumna != totalPrimeraColumna) {
					return false;
				}
			}
		}

		return true;
	}
}
