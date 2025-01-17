package EjerciciosArrays;

import java.util.Arrays;
public class PruebaArrayFuncion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = new int[15];
		for(int i = 0; i < array1.length; i++) {
			array1[i] = i + 1;
		}
		int[] array2 = Arrays.copyOf(array1, 5);
		PruebaArrayFuncion p = new PruebaArrayFuncion();
		System.out.println(Arrays.toString(array2) + "Array2");
		System.out.println(Arrays.toString(p.RecibeArray(array1)));
		System.out.println(Arrays.toString(array2) + "Array2");
	}

	int[] RecibeArray(int[] vector) {
		for(int i = 0; i < vector.length / 2; i++) {
			int aux = vector[i];
			vector[i] = vector[vector.length - 1 - i];
			vector[vector.length - 1 - i] = aux;;
		}
		return vector;
	}
}
