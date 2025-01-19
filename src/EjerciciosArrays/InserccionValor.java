package EjerciciosArrays;

import java.util.Arrays;
public class InserccionValor {

	public static void main(String[] args) {
		int[]array1 = {1, 2, 3};
		
		int[]arrayAux = Arrays.copyOf(array1, array1.length + 1);
		arrayAux[arrayAux.length - 1] = 1;
		Arrays.sort(arrayAux);
		System.out.println(Arrays.toString(arrayAux));
	}
}