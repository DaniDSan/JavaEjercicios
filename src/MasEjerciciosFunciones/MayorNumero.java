package MasEjerciciosFunciones;

import java.util.Scanner;

public class MayorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();
        
        MayorNumero mayorNumero = new MayorNumero();
        System.out.println("El número mayor es: " + mayorNumero.ComprobarMayor(numero1, numero2));
    }
    
    int ComprobarMayor(int numero1, int numero2){
        if (numero1 >= numero2) {
            System.out.println("El primer número es mayor.");
            return numero1;
        } else {
            System.out.println("El segundo número es mayor.");
            return numero2;
        }
    }
}
