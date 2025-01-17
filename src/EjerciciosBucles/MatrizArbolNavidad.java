package EjerciciosBucles;

import java.util.Scanner;
public class MatrizArbolNavidad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mitadAncho;
		
		System.out.println("Ingresa un número:");
		mitadAncho = sc.nextInt();
		
		// Primera fila
		for(int i = 0; i < mitadAncho * 2; i++) {
			System.out.print("+");
		}
		System.out.println("");
		
		// Base del árbol
		for(int i = 0; i < mitadAncho; i++) {
			for(int j = 0; j < mitadAncho * 2; j++) {
				if(j < mitadAncho - i -1 || j >= mitadAncho + i + 1) {
					System.out.print("+");
				}else {
					if(i % 2 == 0) {
						System.out.print("o");
					}else {
						System.out.print("=");
					}
				}
			}
			System.out.println();
		}
		
		// Tronco
		for(int i = 0; i < mitadAncho * 2; i++) {
			if(i < mitadAncho - 1 || i >= mitadAncho + 1) {
				System.out.print("+");
			}else
				System.out.print("U");
		}
	}
}

