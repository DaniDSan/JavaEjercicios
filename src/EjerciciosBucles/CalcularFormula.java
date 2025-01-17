package EjerciciosBucles;

import java.util.Scanner;
public class CalcularFormula {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pos, vel, acel, tiempo;
		
		do {
            System.out.println("Introduce Pos (>= 0):");
            pos = sc.nextInt();
            if (pos < 0) {
                System.out.println("Error: la posición inicial debe ser mayor o igual a 0.");
            }
        } while (pos < 0);
		
        do {
            System.out.println("Introduce Vel (entre 0 y 100):");
            vel = sc.nextInt();
            if (vel < 0 || vel > 100) {
                System.out.println("Error: la velocidad inicial debe estar entre 0 y 100.");
            }
        } while (vel < 0 || vel > 100);
        
        do {
            System.out.println("Introduce Acel (entre 5 y 15):");
            acel = sc.nextInt();
            if (acel < 5 || acel > 15) {
                System.out.println("Error: la aceleración inicial debe estar entre 5 y 15.");
            }
        } while (acel < 5 || acel > 15);
        
        do {
            System.out.println("Introduce Tiempo (entre 10 y 100):");
            tiempo = sc.nextInt();
            if (tiempo < 10 || tiempo > 100) {
                System.out.println("Error: el tiempo debe estar entre 10 y 100.");
            }
        } while (tiempo < 10 || tiempo > 100);
        
        int aux = vel; // no se si quiere esto o que pos use el valor actualizado de vel
        for(int i = 0; i < tiempo; i++) {
        	pos = pos + aux; // borrar lo de arriba y pos += vel
        	vel += acel;
        }
        System.out.println("Velocidad: " + vel + " m/s");
        System.out.println("Aceleración: " + acel + " m/s2");
        System.out.println("Posición: " + pos + " m");
        System.out.println("Tiempo usado: " + tiempo + " segundos");
	}
}
