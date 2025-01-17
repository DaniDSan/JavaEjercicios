package MasEjerciciosFunciones;

import java.util.Scanner;
public class ImprimirNVeces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ImprimirNVeces c = new ImprimirNVeces();
        c.Eco(n);
    }

    public void Eco(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("eco");
        }
    }
}
