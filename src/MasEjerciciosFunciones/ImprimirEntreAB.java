package MasEjerciciosFunciones;

import java.util.Scanner;
public class ImprimirEntreAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        ImprimirEntreAB i = new ImprimirEntreAB();
        i.Imprimir(a, b);
    }

    public void Imprimir(int a, int b) {
        if (a <= b) {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        }else{
            for (int i = a; i >= b; i--) {
                System.out.println(i);
            }
        }
    }
}
