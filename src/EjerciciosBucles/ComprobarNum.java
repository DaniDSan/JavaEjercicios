package EjerciciosBucles;

import java.util.Scanner;
public class ComprobarNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int aux; // Interger aux = null;
        boolean firstLap = true;

        do {
            System.out.println("Introduce un numero: ");
            n = sc.nextInt();
            
            aux = n;
            if(aux == n && !firstLap) { // if (aux == n && aux != null)
            	break;
            }

            if(n % 2 == 0){
                System.out.println("El numero es par");
            }else{
                System.out.println("El numero es impar");
            }
            if(n < 0){
                System.out.println("El numero es negativo");
            }else{
                System.out.println("El numero es positivo");
            }
            firstLap = false; // aux = n;
        }
        while (true);
    }
}
