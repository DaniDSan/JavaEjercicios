package EjerciciosArrays;

import java.util.Arrays;

public class EjercicioBuscarTodos {

	public static void main(String[] args) {
		int[] array1 = {1, 5, 317, 24, 3, 12, 5, 24, 24};
		int n = 24;
		EjercicioBuscarTodos b = new EjercicioBuscarTodos();
		System.out.println(Arrays.toString(b.Buscar(array1, n)));
	}
	
	public int[] Buscar(int[] vector, int n) {
		int[] vectorAux = new int[0];
		for (int i = 0; i < vector.length; i ++) {
			if (vector[i] == n) {
				vectorAux = Arrays.copyOf(vectorAux, vectorAux.length + 1);
				vectorAux[vectorAux.length - 1] = i;
			}
		}
		return vectorAux;
	}
}
