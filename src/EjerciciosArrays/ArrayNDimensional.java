package EjerciciosArrays;

import java.util.Arrays;

public class ArrayNDimensional {
	public static void main(String[] args) {
		int[][] array1 = new int[4][3];
		
		for(int i = 0; i < array1.length ; i++) {
			for(int j = 0; j < array1[i].length ; j++) {
				array1[i][j] = i + 1;
			}
		}
		System.out.println(Arrays.deepToString(array1));
		
		for(int[] iArray1 : array1) {
			for(int j : iArray1) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		// Se puede hacer lo mismo con un doble bucle for
		System.out.println();
		for(int i = 0; i < array1.length ; i++) {
			for(int j = 0; j < array1[i].length ; j++) {
				System.out.print("|" + array1[i][j]);
				}
			System.out.print("|");
			System.out.println();
		}
	}
}
