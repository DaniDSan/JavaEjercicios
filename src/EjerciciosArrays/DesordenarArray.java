package EjerciciosArrays;

import java.util.Arrays;

public class DesordenarArray {

	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 5, 6};
		System.out.println(Arrays.toString(Desordenar(array1)));
		System.out.println(Arrays.toString(array1));
	}

	public static int[] Desordenar(int[] vector) {
		int[] vectorAux = Arrays.copyOf(vector, vector.length);
		for (int i = 0; i < vectorAux.length; i++) {
			int ran = (int) (Math.random() * 2);
			
			int aux = vectorAux[i];
			vectorAux[i] = vectorAux[ran];
			vectorAux[ran] = aux;
		}	
		return vectorAux;
	}
}
