package EjerciciosArrays;

public class BusquedaValor {
	public static void main(String[] args) {
		int[] array1 = {1, 5, 317, 24, 3, 12, 5};
		int n = 23;
		BusquedaValor b = new BusquedaValor();
		System.out.println(b.Buscar(array1, n));
	}
	
	public boolean Buscar(int[] vector, int n) {
		for (int i = 0; i < vector.length; i ++) {
			if (vector[i] == n) {
				return true;
			}
		}
		return false;
	}
}