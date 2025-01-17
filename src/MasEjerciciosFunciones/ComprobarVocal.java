package MasEjerciciosFunciones;

import java.util.Scanner;

public class ComprobarVocal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una letra: ");
        char letra = scanner.next().charAt(0);
        ComprobarVocal comprobador = new ComprobarVocal();
        comprobador.Comprobar(letra);
    }

    void Comprobar(char letra){
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("Es una vocal");
            }else{
            	System.out.println("No es una vocal");
        }
    }
}