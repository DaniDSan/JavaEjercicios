package EjerciciosArrays;

import java.util.Arrays;

public class EliminacionArray {

	public static void main(String[] args) {
		int[] array1 = {1, 3, 2, 5, 4};
		EliminacionArray e = new EliminacionArray();
		System.out.println(Arrays.toString(e.ArrayNoOrdenado(array1, 2)));
	}
	
	public int[] ArrayNoOrdenado(int[] vector, int valorABuscar) {
		int indiceBorrado = 0;
		for(int i = 0; i < vector.length; i++) {
			if(vector[i] == valorABuscar) {
				indiceBorrado = i;
				vector[indiceBorrado] = vector[vector.length - 1];
				int[] vectorAux = Arrays.copyOf(vector, vector.length - 1);
				return vectorAux;
			}
		}
		return vector;
	}
	
	public int[] MiArrayOrdenado(int[] vector, int valorABuscar) {
		int indiceBorrado = 0;
		for(int i = 0; i < vector.length; i++) {
			if(vector[i] == valorABuscar) {
				indiceBorrado = i;
				vector[indiceBorrado] = vector[vector.length - 1];
				vector = Arrays.copyOf(vector, vector.length - 1); // Podemos usar el mismo vector cambiandole los valores o crear una nueva variable
				// int[] vectorAux = Arrays.copyOf(vector, vector.length - 1);
				// return vectorAux;
				Arrays.sort(vector); // Como esta ordenado se va a desordenar lo volvemos a ordenar y listo
				return vector;
			}
		}
		return vector;
	}
	
	public int[] ArrayOrdenado(int[] vector, int valorABuscar) {
		int indiceBorrado = Arrays.binarySearch(vector, valorABuscar);
		System.arraycopy(vector, indiceBorrado + 1, vector, indiceBorrado, vector.length - indiceBorrado - 1);
		vector = Arrays.copyOf(vector, vector.length);
		return vector;
	}
}

