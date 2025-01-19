package EjerciciosArrays;

import java.util.Arrays;

public class ArrayYFunciones {

	public static void main(String[] args) {
		int[] array1 = new int[10];
		int[] array2 = array1;
		int[] array3 = Arrays.copyOf(array1, 10);
		int[] array4 = new int[array1.length];
		int[] array5 = new int[array1.length];
		
		for(int i = 0; i < array1.length ; i++) {
			array1[i] = i + 1;
		}
		for(int i = 0; i < array1.length ; i++) {
			array4[i] = i * 2;
		}
		
		array5 = Arrays.copyOf(array4, array1.length);
		
		ArrayYFunciones a = new ArrayYFunciones();
		
		System.out.println(Arrays.toString(a.FuncionConArray(array1)));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
		System.out.println(Arrays.toString(array5));
	}
		
	public int[] FuncionConArray(int[] vector) {
		for(int i = 0; i < vector.length / 2; i++) {
			int aux = vector[vector.length - i - 1];
			vector[vector.length - i - 1] = vector[i];
			vector[i] = aux;
			}
		return vector;
	}
}
