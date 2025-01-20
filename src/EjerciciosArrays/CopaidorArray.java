package EjerciciosArrays;

import java.util.Arrays;

public class CopaidorArray {

	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(MiCopiador(array1, 2, 3)));
		System.out.println(Arrays.toString(array1));
	}
	
	public static int[] MiCopiador(int[] vector, int desde, int hasta) {
		int[] vectorAux = new int[vector.length];
		for (int i = desde; i < hasta; i++) {
			vectorAux[i] = vector[i]; 
		}
		return vectorAux;
	}
}
