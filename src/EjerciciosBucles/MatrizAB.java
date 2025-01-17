package EjerciciosBucles;

import java.util.Scanner;
public class MatrizAB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ancho, altura;
		
		// Introducción de datos
		do {
			System.out.println("Ingresa el ancho (>= 2 y <=10): ");
			ancho = sc.nextInt();
			if (ancho < 2 || ancho > 10) {
				System.out.println("Debe ser entre 2 y 10");
				}
		}
		while(ancho < 2 || ancho > 10);
		
		do {
			System.out.println("Ingresa la altura: ");
			altura = sc.nextInt();
			if (altura < 2 || altura > 10) {
				System.out.println("Debe ser entre 2 y 10");
				}
		}while(altura < 2 || altura > 10);
		
		// Operación
		for(int i = 1; i <= altura; i++) {
			for(int j = 1; j <= ancho; j++) {
				if(i%2 != 0) {
					System.out.print(j * i + " ");
				}else
					System.out.print(-1 * (j * i) + " ");
			}
			System.out.println();
		}
	}
}