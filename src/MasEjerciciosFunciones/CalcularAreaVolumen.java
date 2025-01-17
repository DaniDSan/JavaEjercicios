package MasEjerciciosFunciones;

import java.util.Scanner;

public class CalcularAreaVolumen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        CalcularAreaVolumen ca = new CalcularAreaVolumen();
        if(s.equals("area")) {
            float altura = sc.nextFloat();
            float radio = sc.nextFloat();
            ca.Area(altura, radio);
        }else if(s.equals("volumen")) {
            float altura = sc.nextFloat();
            float radio = sc.nextFloat();
            ca.Volumen(altura, radio);
        }else{
            System.out.println("Opcion no valida");
        }
    }

    public void Area(float altura, float radio) {
        System.out.println("El area es: " + (2 * Math.PI * radio) * (altura + radio));
    }

    public void Volumen(float altura, float radio) {
        System.out.println("El volumen es: " + (Math.PI * Math.pow(radio, 2) * altura));
    }
}
