package EjerciciosArrays;

public class BucleForEach {

	public static void main(String[] args) {
		int[] array1 = new int[4];
		
		for(int i = 0; i < array1.length ; i++) {
			array1[i] = i * 2;
		}
		
		for(int i : array1) {
			System.out.println(i);
		}
	}
}
